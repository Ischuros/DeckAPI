package event;

import game.Board;
import play.Player;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class BaseEvent<B extends Board, P extends Player> {
	private final List<Event<B, P>> beforeEvents = new ArrayList<>();
	private final List<Event<B, P>> afterEvents = new ArrayList<>();
	private Comparator<Event<B, P>> beforeComparator;
	private Comparator<Event<B, P>> afterComparator;

	protected void runBefore(B board, P player, List<P> otherPlayers)
	{
		List<Event<B, P>> events = new ArrayList<>(beforeEvents);
		if (beforeComparator != null)
		{
			events.sort(beforeComparator);
		}
		events.forEach(event -> event.run(board, player, otherPlayers));
	}

	protected void runAfter(B board, P player, List<P> otherPlayers)
	{
		List<Event<B, P>> sortedEvents = new ArrayList<>(afterEvents);
		if (afterComparator != null)
		{
			sortedEvents.sort(afterComparator);
		}
		sortedEvents.forEach(event -> event.run(board, player, otherPlayers));
	}

	public void addBeforePlayEvent(Event<B, P> event)
	{
		beforeEvents.add(event);
	}

	public void addAfterPlayEvent(Event<B, P> event)
	{
		afterEvents.add(event);
	}

	public void setBeforeComparator(Comparator<Event<B, P>> beforeComparator)
	{
		this.beforeComparator = beforeComparator;
	}

	public void setAfterComparator(Comparator<Event<B, P>> afterComparator)
	{
		this.afterComparator = afterComparator;
	}
}
