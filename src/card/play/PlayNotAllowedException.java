package card.play;

class PlayNotAllowedException extends Exception
{
	private static final long serialVersionUID = 1L;

	private final transient IPlayContext context;

	PlayNotAllowedException(IPlayContext context)
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
