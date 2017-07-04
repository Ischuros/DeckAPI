package card.event;

import java.util.List;

import card.play.IPlayContext;
import card.property.CardProperty;

public interface IBeforePlayEvent
{
	void run(IPlayContext context, List<CardProperty> properties);
}
