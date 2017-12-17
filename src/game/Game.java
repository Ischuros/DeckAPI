package game;

import play.Board;
import play.Play;
import play.PlayNotAllowedException;
import play.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Game<P extends Player, B extends Board, T extends Turn<P>> {
	private B board;
	private List<P> players = new ArrayList<>();
	private List<T> historicTurns = new ArrayList<>();
	private T currentTurn;

	public Game(B board) {
		this.board = board;
	}

	public void registerPlayers(P... players) {
		Collections.addAll(this.players, players);
	}

	public void sortPlayers(Comparator<P> comparator) {
		players.sort(comparator);
	}

	public void play(Play play) throws GameOverException, PlayNotAllowedException,
			TurnOverException, WrongPlayerPlayingException {
		if (isOver()) {
			throw new GameOverException();
		}

		playCurrentTurn(play);
	}

	private void playCurrentTurn(Play play) throws WrongPlayerPlayingException, TurnOverException,
			PlayNotAllowedException {
		if (currentTurn == null) {
			currentTurn = createNewTurn();
		}

		if (currentTurn.isOver()) {
			historicTurns.add(currentTurn);
			currentTurn = createNewTurn();
		}

		currentTurn.play(play);
	}

	public P getCurrentPlayer() {
		if (currentTurn == null) {
			return players.iterator().next();
		}

		return currentTurn.getPlayerToPlay();
	}

	/**
	 * @param player Player to exclude
	 * @return a list of all players, excluding the one passed in parameter;
	 */
	public List<P> getOtherPlayers(P player) {
		List<P> otherPlayers = new ArrayList<>(players);
		otherPlayers.remove(player);
		return otherPlayers;
	}

	public B getBoard() {
		return board;
	}

	public List<P> getPlayers() {
		return players;
	}

	public P getWinner() throws GameNotOverException {
		if (!isOver()) {
			throw new GameNotOverException();
		}

		return getInternalWinner();
	}

	public abstract boolean isOver();

	protected abstract P getInternalWinner();

	protected abstract T createNewTurn();
}