package card.event;

import game.Game;

public interface PlayEvent<G extends Game>
{
	void run(G game);
}
