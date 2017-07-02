package card.interaction;

import java.util.List;

public class PropertyRunnableException extends Exception
{
	private static final long serialVersionUID = 1L;
	private final List<IInteractionContext> circumstances;
	private final List<IInteractionTarget> targets;

	public PropertyRunnableException(List<IInteractionContext> circumstances,
			List<IInteractionTarget> targets)
	{
		this.circumstances = circumstances;
		this.targets = targets;
	}

	@Override
	public String getMessage()
	{
		StringBuilder sb = new StringBuilder(
				"Interaction impossible dans les circonstances suivantes :\n");
		circumstances.forEach(c -> sb.append(c.toString()).append("\n"));
		sb.append("sur les cibles suivantes :\n");
		targets.forEach(t -> sb.append(t.toString()).append("\n"));
		return sb.toString();
	}
}
