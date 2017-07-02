package card.interaction;

interface IInteractionRunnable
{
	boolean isAllowToRun(IInteractionContext... circumstances);

	void runInternal(IInteractionTarget... targets);
}