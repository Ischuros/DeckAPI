package game;

import play.Board;
import play.Play;
import play.PlayNotAllowedException;
import play.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Game
{
	private Board board = new Board();
	private List<Player> players = new ArrayList<>();
	private Player playerToPlay;
	private List<Play> plays = new ArrayList<>();

	public void registerPlayers(Player... players) {
		Collections.addAll(this.players, players);
	}

	public void sortPlayers(Comparator<Player> comparator) {
		players.sort(comparator);
	}

	public void play(Player player, Play play) throws PlayNotAllowedException, WrongPlayerPlaying {
		if (!player.equals(playerToPlay)) {
			throw new WrongPlayerPlaying(player);
		}

		play.run(this);
		plays.add(play);
		setNextPlayerToPlay();
	}

	private void setNextPlayerToPlay() {
		int nextIndex = players.indexOf(playerToPlay) == players.size()-1 ? 0 : players.indexOf(playerToPlay)+1;
		playerToPlay = players.get(nextIndex);
	}
}