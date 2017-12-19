package play;

import event.BaseEvent;
import game.Board;

import java.util.List;

/**
 * Represents a play. To perform a play, we need a context and card properties.
 * Actions can be triggered before and after plays.
 * 
 * Card properties and events can be sorted in order to be executed in the right
 * order, independently from the play itself.
 * 
 * @author Lucas PRANEUF
 *
 */
public abstract class Play<B extends Board, P extends Player> extends BaseEvent<B, P>
{
	protected P player;

	public Play(P player) {
		this.player = player;
	}

	public void run(B board, List<P> otherPlayers) throws PlayNotAllowedException
	{
		if (!isAllowToRun(board, otherPlayers))
		{
			throw new PlayNotAllowedException();
		}

		runBefore(board, player, otherPlayers);
		runInternal(board, otherPlayers);
		runAfter(board, player, otherPlayers);
	}

	public P getPlayer() {
		return player;
	}

	protected abstract boolean isAllowToRun(B board, List<P> otherPlayers);

	protected abstract void runInternal(B board, List<P> otherPlayers);
}
