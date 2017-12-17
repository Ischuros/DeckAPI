package play;

import card.event.PlayEvent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
public abstract class Play<B extends Board, P extends Player>
{
	private final List<PlayEvent<B, P>> beforePlayEvents = new ArrayList<>();
	private final List<PlayEvent<B, P>> afterPlayEvents = new ArrayList<>();
	private Comparator<PlayEvent<B, P>> beforePlayComparator;
	private Comparator<PlayEvent<B, P>> afterPlayComparator;
	protected P player;

	public Play(P player) {
		this.player = player;
	}

	public void run(B board, List<P> otherPlayers) throws PlayNotAllowedException
	{
		if (!isAllowToRun(board, otherPlayers))
		{
			throw new PlayNotAllowedException();
		}

		runBefore(board, otherPlayers);
		runInternal(board, otherPlayers);
		runAfter(board, otherPlayers);
	}

	public void addBeforePlayEvent(PlayEvent<B, P> event)
	{
		beforePlayEvents.add(event);
	}

	public void addAfterPlayEvent(PlayEvent<B, P> event)
	{
		afterPlayEvents.add(event);
	}

	public void setBeforePlayComparator(Comparator<PlayEvent<B, P>> beforePlayComparator)
	{
		this.beforePlayComparator = beforePlayComparator;
	}

	public void setAfterPlayComparator(Comparator<PlayEvent<B, P>> afterPlayComparator)
	{
		this.afterPlayComparator = afterPlayComparator;
	}

	private void runBefore(B board, List<P> otherPlayers)
	{
		List<PlayEvent<B, P>> events = new ArrayList<>(beforePlayEvents);
		if (beforePlayComparator != null)
		{
			events.sort(beforePlayComparator);
		}
		events.forEach(event -> event.run(board, player, otherPlayers));
	}

	private void runAfter(B board, List<P> otherPlayers)
	{
		List<PlayEvent<B, P>> sortedEvents = new ArrayList<>(afterPlayEvents);
		if (afterPlayComparator != null)
		{
			sortedEvents.sort(afterPlayComparator);
		}
		sortedEvents.forEach(event -> event.run(board, player, otherPlayers));
	}

	public P getPlayer() {
		return player;
	}

	protected abstract boolean isAllowToRun(B board, List<P> otherPlayers);

	protected abstract void runInternal(B board, List<P> otherPlayers);
}
