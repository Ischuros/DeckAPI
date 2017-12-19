package turn;

import event.BaseEvent;
import game.WrongPlayerPlayingException;
import game.Board;
import play.Play;
import play.PlayNotAllowedException;
import play.Player;

import java.util.ArrayList;
import java.util.List;

public class Turn<B extends Board, P extends Player>  extends BaseEvent<B, P> {
	private B board;
	private P playerToPlay;
	private List<P> players;
	private List<Play<B, P>> historicPlays = new ArrayList<>();
	private boolean isOver;

	public Turn(B board, List<P> players) {
		this.board = board;
		this.players = players;
	}

	public void play(Play<B, P> play) throws PlayNotAllowedException, WrongPlayerPlayingException, TurnOverException {
		if (isOver) {
			throw new TurnOverException();
		}

		if (!play.getPlayer().equals(playerToPlay)) {
			throw new WrongPlayerPlayingException(play.getPlayer());
		}

		runBefore(board, playerToPlay, getOtherPlayers(playerToPlay));

		play.run(board, getOtherPlayers(playerToPlay));
		historicPlays.add(play);
		setNextPlayerToPlay();

		runAfter(board, playerToPlay, getOtherPlayers(playerToPlay));

		updateIsOver();
	}

	private List<P> getOtherPlayers(P player) {
		List<P> otherPlayers = new ArrayList<>(players);
		otherPlayers.remove(player);
		return otherPlayers;
	}

	private void setNextPlayerToPlay() {
		playerToPlay = players.get(getNextPlayerIndex());
	}

	private void updateIsOver() {
		isOver = getNextPlayerIndex() == 0;
	}

	private int getNextPlayerIndex() {
		return players.indexOf(playerToPlay) == players.size() - 1 ? 0 : players.indexOf(playerToPlay) + 1;
	}

	public boolean isOver() {
		return isOver;
	}

	public P getPlayerToPlay() {
		return playerToPlay;
	}

	public List<Play<B, P>> getHistoricPlays() {
		return historicPlays;
	}
}
