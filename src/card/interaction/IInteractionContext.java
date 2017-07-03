package card.interaction;

import java.io.Serializable;
import java.util.List;

public interface IInteractionContext extends Serializable
{
	List<IInteractionTarget> getTargets();
}