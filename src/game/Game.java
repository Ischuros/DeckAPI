package game;

import play.Play;
import play.PlayNotAllowedException;
import play.Player;
import turn.Turn;
import turn.TurnOverException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class Game<B extends Board, P extends Player, T extends Turn<B, P>> {
	private B board;
	private List<P> players = new ArrayList<>();
	private List<T> historicTurns = new ArrayList<>();
	private T currentTurn;

	public Game(B board) {
		this.board = board;
	}

	public void registerPlayers(List<P> playersToRegister) {
		this.players.addAll(playersToRegister);
	}

	public void sortPlayers(Comparator<P> comparator) {
		players.sort(comparator);
	}

	public void play(Play<B, P> play) throws GameOverException, PlayNotAllowedException,
			TurnOverException, WrongPlayerPlayingException {
		if (isOver()) {
			throw new GameOverException();
		}

		playCurrentTurn(play);
	}

	private void playCurrentTurn(Play<B, P> play) throws WrongPlayerPlayingException, TurnOverException,
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