package game;

import play.Play;
import play.PlayNotAllowedException;
import play.Player;

import java.util.ArrayList;
import java.util.List;

public abstract class Turn<P extends Player> {
	protected Game game;
	private P playerToPlay;
	private List<Play> historicPlays = new ArrayList<>();
	private boolean isOver;

	public Turn(Game game) {
		this.game = game;
	}

	public void play(Play play) throws PlayNotAllowedException, WrongPlayerPlayingException, TurnOverException {
		if (isOver) {
			throw new TurnOverException();
		}

		if (!play.getPlayer().equals(playerToPlay)) {
			throw new WrongPlayerPlayingException(play.getPlayer());
		}

		if (hasToTriggerBeforeTurnEvent()) {
			triggerBeforeTurnEvent();
		}

		play.run(game.getBoard(), game.getOtherPlayers(play.getPlayer()));
		historicPlays.add(play);
		setNextPlayerToPlay();

		if (hasToTriggerAfterturnEvent()) {
			triggerAfterTurnEvent();
		}
	}

	private boolean hasToTriggerAfterturnEvent() {
		final List<P> players = game.getPlayers();
		return players.indexOf(playerToPlay) == players.size() - 1;
	}

	private boolean hasToTriggerBeforeTurnEvent() {
		return game.getPlayers().indexOf(playerToPlay) == 0;
	}

	private void setNextPlayerToPlay() {
		final List<P> players = game.getPlayers();
		int nextIndex = players.indexOf(playerToPlay) == players.size() - 1 ? 0 : players.indexOf(playerToPlay) + 1;
		if(nextIndex == 0) {
			isOver = true;
		}
		playerToPlay = players.get(nextIndex);
	}

	public boolean isOver() {
		return isOver;
	}

	public P getPlayerToPlay() {
		return playerToPlay;
	}

	protected abstract void triggerBeforeTurnEvent();

	protected abstract void triggerAfterTurnEvent();
}
