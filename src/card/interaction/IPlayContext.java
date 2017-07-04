package card.interaction;

import java.io.Serializable;
import java.util.List;

public interface IPlayContext extends Serializable
{
	List<IPlayTarget> getTargets();
}