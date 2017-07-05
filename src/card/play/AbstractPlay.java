package card.play;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import card.event.IAfterPlayEvent;
import card.event.IBeforePlayEvent;
import card.property.CardProperty;

/**
 * Represents a play. To perform a play, we need a context and card properties.
 * Before play and after play actions can be triggered.
 * 
 * Card properties and events can be sorted in order to be executed in the right
 * order, independently from the play itself.
 * 
 * @author Lucas PRANEUF
 *
 */
public abstract class AbstractPlay<T extends IBeforePlayEvent, U extends IAfterPlayEvent>
{

	private List<T> beforePlayEvents = new ArrayList<>();
	private List<U> afterPlayEvents = new ArrayList<>();
	private Comparator<T> beforePlayComparator;
	private Comparator<U> afterPlayComparator;
	private Comparator<CardProperty> propertiesComparator;

	public void run(IPlayContext context, List<CardProperty> properties)
			throws PlayNotAllowedException
	{
		if (!isAllowToRun(context))
		{
			throw new PlayNotAllowedException(context);
		}

		runBefore(context, properties);

		List<CardProperty> sortedProperties = new ArrayList<>(properties);
		if (propertiesComparator != null)
		{
			Collections.sort(sortedProperties, propertiesComparator);
		}
		runInternal(context, sortedProperties);

		runAfter(context, properties);
	}

	public void addBeforePlayEvent(T event)
	{
		beforePlayEvents.add(event);
	}

	public void addAfterPlayEvent(U event)
	{
		afterPlayEvents.add(event);
	}

	public void setBeforePlayComparator(Comparator<T> beforePlayComparator)
	{
		this.beforePlayComparator = beforePlayComparator;
	}

	public void setAfterPlayComparator(Comparator<U> afterPlayComparator)
	{
		this.afterPlayComparator = afterPlayComparator;
	}

	public void setPropertiesComparator(Comparator<CardProperty> propertiesComparator)
	{
		this.propertiesComparator = propertiesComparator;
	}

	private void runBefore(IPlayContext context, List<CardProperty> properties)
	{
		List<T> events = new ArrayList<>(beforePlayEvents);
		if (beforePlayComparator != null)
		{
			Collections.sort(events, beforePlayComparator);
		}
		events.forEach(event -> event.run(context, properties));
	}

	private void runAfter(IPlayContext context, List<CardProperty> properties)
	{
		List<U> sortedEvents = new ArrayList<>(afterPlayEvents);
		if (afterPlayComparator != null)
		{
			Collections.sort(sortedEvents, afterPlayComparator);
		}
		sortedEvents.forEach(event -> event.run(context, properties));
	}

	protected abstract boolean isAllowToRun(IPlayContext context);

	protected abstract void runInternal(IPlayContext context, List<CardProperty> properties);
}
