package card.interaction;

import java.util.List;

public interface IInteractionRunnable
{
	public default void run(IInteractionContext context) throws PropertyRunnableException
	{
		if (!isAllowToRun(context))
		{
			throw new PropertyRunnableException(context);
		}
		runInternal(context.getTargets());
	}

	boolean isAllowToRun(IInteractionContext context);

	void runInternal(List<IInteractionTarget> targets);
}