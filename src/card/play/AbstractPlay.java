package card.play;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import card.Card;
import card.event.IPlayEvent;

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
public abstract class AbstractPlay<T extends IPlayEvent, U extends IPlayEvent, C extends IPlayContext>
{

	private final List<T> beforePlayEvents = new ArrayList<>();
	private final List<U> afterPlayEvents = new ArrayList<>();
	private Comparator<T> beforePlayComparator;
	private Comparator<U> afterPlayComparator;

	public void run(C context) throws PlayNotAllowedException
	{
		if (!isAllowToRun(context))
		{
			throw new PlayNotAllowedException(context);
		}

		runBefore(context);
		runInternal(context);
		runAfter(context);
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

	private void runBefore(C context)
	{
		List<T> events = new ArrayList<>(beforePlayEvents);
		if (beforePlayComparator != null)
		{
			events.sort(beforePlayComparator);
		}
		events.forEach(event -> event.run(context));
	}

	private void runAfter(C context)
	{
		List<U> sortedEvents = new ArrayList<>(afterPlayEvents);
		if (afterPlayComparator != null)
		{
			sortedEvents.sort(afterPlayComparator);
		}
		sortedEvents.forEach(event -> event.run(context));
	}

	protected abstract boolean isAllowToRun(C context);

	protected abstract void runInternal(C context);
}
