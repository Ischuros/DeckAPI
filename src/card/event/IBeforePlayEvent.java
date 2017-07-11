package card.event;

import card.Card;
import card.play.IPlayContext;

public interface IBeforePlayEvent<P extends Comparable<P>>
{
	void run(IPlayContext context, Card<P> cardPlayed);
}
