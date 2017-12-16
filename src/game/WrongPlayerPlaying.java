package game;

import play.Player;

public class WrongPlayerPlaying extends Exception
{
	private static final long serialVersionUID = 1L;

	private Player player;

	WrongPlayerPlaying(Player player) {
		this.player = player;
	}

	@Override
	public String getMessage()
	{
		return "It is not player " +player.toString()+" to play.";
	}
}