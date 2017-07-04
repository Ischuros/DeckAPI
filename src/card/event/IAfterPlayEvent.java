package card.event;

import java.util.List;

import card.play.IPlayContext;
import card.property.CardProperty;

public interface IAfterPlayEvent
{
	void run(IPlayContext context, List<CardProperty> properties);
}
