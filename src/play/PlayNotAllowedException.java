package play;

import game.Game;

public class PlayNotAllowedException extends Exception
{
	private static final long serialVersionUID = 1L;

	private final transient Game context;

	PlayNotAllowedException(Game context)
	{
		this.context = context;
	}

	@Override
	public String getMessage()
	{
        return "Impossible interaction in following context :\n" +
                context.toString();
	}
}
