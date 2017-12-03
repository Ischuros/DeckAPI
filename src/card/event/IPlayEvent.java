package card.event;

import card.Card;
import card.play.IPlayContext;

public interface IPlayEvent
{
	void run(IPlayContext context, Card cardPlayed);
}
