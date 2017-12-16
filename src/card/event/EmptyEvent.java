package card.event;

import game.Game;

public class EmptyEvent<T extends Game> implements PlayEvent<T> {

	@Override
	public void run(T game) {
		//do nothing
	}
}
