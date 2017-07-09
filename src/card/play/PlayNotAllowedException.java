package card.play;

public class PlayNotAllowedException extends Exception
{
	private static final long serialVersionUID = 1L;

	private final transient IPlayContext context;

	public PlayNotAllowedException(IPlayContext context)
	{
		this.context = context;
	}

	@Override
	public String getMessage()
	{
		StringBuilder sb = new StringBuilder("Impossible interaction in following context :\n")
				.append(context.toString());
		return sb.toString();
	}
}
