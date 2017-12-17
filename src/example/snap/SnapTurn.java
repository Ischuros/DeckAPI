package example.snap;

import game.Game;
import game.Turn;

public class SnapTurn extends Turn<SnapPlayer> {

	public SnapTurn(Game game) {
		super(game);
	}

	@Override
	protected void triggerBeforeTurnEvent() {
		//do nothing
	}

	@Override
	protected void triggerAfterTurnEvent() {
		//TODO
	}
}
