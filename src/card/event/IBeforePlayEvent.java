package card.event;

import card.Card;
import card.play.IPlayContext;

public interface IBeforePlayEvent
{
	void run(IPlayContext context, Card cardPlayed);
}
