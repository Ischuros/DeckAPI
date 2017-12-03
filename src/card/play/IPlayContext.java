package card.play;

import java.util.List;

public interface IPlayContext
{
	List<? extends IPlayTarget> getTargets();
}