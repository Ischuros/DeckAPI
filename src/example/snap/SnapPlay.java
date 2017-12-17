package example.snap;

import card.Card;
import play.Play;

import java.util.List;

public class SnapPlay extends Play<SnapBoard, SnapPlayer> {

	public SnapPlay(SnapPlayer player) {
		super(player);
	}

	@Override
    protected boolean isAllowToRun(SnapBoard board, List<SnapPlayer> otherPlayers) {
        return !player.getDeck().isEmpty();
    }

    @Override
    protected void runInternal(SnapBoard board, List<SnapPlayer> otherPlayers) {
        Card cardToPlay = player.getDeck().removeFirst();
        board.playCard(cardToPlay, player);
    }
}
