package card.interaction;

import java.util.List;

public interface IInteractionRunnable
{
	public default void run(List<IInteractionContext> circumstances,
			List<IInteractionTarget> targets) throws PropertyRunnableException
	{
		if (!isAllowToRun(circumstances.toArray(new IInteractionContext[circumstances.size()])))
		{
			throw new PropertyRunnableException(circumstances, targets);
		}
		runInternal(targets.toArray(new IInteractionTarget[targets.size()]));
	}

	boolean isAllowToRun(IInteractionContext... circumstances);

	void runInternal(IInteractionTarget... targets);
}