package event;

import game.Board;
import play.Player;

import java.util.List;

public interface Event<B extends Board, P extends Player>
{
	void run(B board, P playerToPlay, List<P> otherPlayers);
}
