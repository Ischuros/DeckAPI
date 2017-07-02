package card.interaction;

import java.util.List;

/**
 * This class describes one of the effect of a card property. For example for
 * the property "attack" of a card, one runnable could be "Increase attack" or
 * "Decrease attack"
 * 
 * @author Lucas PRANEUF
 *
 */
public abstract class AbstractInteractionRunnable implements IInteractionRunnable
{
	public final void run(List<IInteractionContext> circumstances, List<IInteractionTarget> targets)
			throws PropertyRunnableException
	{
		if (!isAllowToRun(circumstances.toArray(new IInteractionContext[circumstances.size()])))
		{
			throw new PropertyRunnableException(circumstances, targets);
		}
		runInternal(targets.toArray(new IInteractionTarget[targets.size()]));
	}
}