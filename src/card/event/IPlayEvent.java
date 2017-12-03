package card.event;

import card.play.IPlayContext;

public interface IPlayEvent<C extends IPlayContext>
{
	void run(C context);
}
