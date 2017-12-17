package example.snap;

import game.Game;

public class SnapGame extends Game<SnapPlayer, SnapBoard, SnapTurn> {

	public SnapGame(SnapBoard board) {
		super(board);
	}

	@Override
	public boolean isOver() {
		return getPlayers().stream().map(SnapPlayer::getDeck).filter(deck -> !deck.isEmpty()).count() == 1;
	}

	@Override
	protected SnapPlayer getInternalWinner() {
		return getPlayers().stream().filter(player -> !player.getDeck().isEmpty()).findFirst().orElse(null);
	}

	@Override
	protected SnapTurn createNewTurn() {
		return new SnapTurn(this);
	}
}
