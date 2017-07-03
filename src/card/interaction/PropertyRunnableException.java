package card.interaction;

public class PropertyRunnableException extends Exception
{
	private static final long serialVersionUID = 1L;

	private final IInteractionContext context;

	public PropertyRunnableException(IInteractionContext context)
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
