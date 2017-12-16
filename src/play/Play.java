package play;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import card.event.PlayEvent;
import game.Game;

/**
 * Represents a play. To perform a play, we need a context and card properties.
 * Actions can be triggered before and after plays.
 * 
 * Card properties and events can be sorted in order to be executed in the right
 * order, independently from the play itself.
 * 
 * @author Lucas PRANEUF
 *
 */
public abstract class Play<B extends PlayEvent<G>, A extends PlayEvent<G>, G extends Game>
{

	private final List<B> beforePlayEvents = new ArrayList<>();
	private final List<A> afterPlayEvents = new ArrayList<>();
	private Comparator<B> beforePlayComparator;
	private Comparator<A> afterPlayComparator;

	public void run(G game) throws PlayNotAllowedException
	{
		if (!isAllowToRun(game))
		{
			throw new PlayNotAllowedException(game);
		}

		runBefore(game);
		runInternal(game);
		runAfter(game);
	}

	public void addBeforePlayEvent(B event)
	{
		beforePlayEvents.add(event);
	}

	public void addAfterPlayEvent(A event)
	{
		afterPlayEvents.add(event);
	}

	public void setBeforePlayComparator(Comparator<B> beforePlayComparator)
	{
		this.beforePlayComparator = beforePlayComparator;
	}

	public void setAfterPlayComparator(Comparator<A> afterPlayComparator)
	{
		this.afterPlayComparator = afterPlayComparator;
	}

	private void runBefore(G game)
	{
		List<B> events = new ArrayList<>(beforePlayEvents);
		if (beforePlayComparator != null)
		{
			events.sort(beforePlayComparator);
		}
		events.forEach(event -> event.run(game));
	}

	private void runAfter(G game)
	{
		List<A> sortedEvents = new ArrayList<>(afterPlayEvents);
		if (afterPlayComparator != null)
		{
			sortedEvents.sort(afterPlayComparator);
		}
		sortedEvents.forEach(event -> event.run(game));
	}

	protected abstract boolean isAllowToRun(G context);

	protected abstract void runInternal(G context);
}
