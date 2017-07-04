package card.play;

import java.util.List;

public interface IPlay
{
	default void play(IPlayContext context) throws PlayNotAllowedException
	{
		if (!isAllowToRun(context))
		{
			throw new PlayNotAllowedException(context);
		}
		playInternal(context.getTargets());
	}

	boolean isAllowToRun(IPlayContext context);

	void playInternal(List<IPlayTarget> targets);
}