package card.event;

import play.Board;
import play.Player;

import java.util.List;

public interface PlayEvent<B extends Board, P extends Player>
{
	void run(B board, P playerToPlay, List<P> otherPlayers);
}
