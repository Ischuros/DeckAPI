package game;

import play.Player;

public class WrongPlayerPlayingException extends Exception
{
	private static final long serialVersionUID = 1L;

	public WrongPlayerPlayingException(Player player) {
		super("It is not player " +player.toString()+" to play.");
	}
}