package card.event;

import card.Card;
import card.play.IPlayContext;

public interface IAfterPlayEvent
{
	void run(IPlayContext context, Card cardPlayed);
}
