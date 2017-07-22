package example.util.deck._52_classic_deck.property;

import card.property.PriorityAndValueCardProperty;
import card.property.SimpleProperty;

public class NumberProperty extends PriorityAndValueCardProperty<ClassicPriority, Number>
{
	private static final SimpleProperty NUMBER_SIMPLE_PROPERTY = new SimpleProperty("Value",
			"Card value : from ace to king");

	public NumberProperty(Number value)
	{
		super(NUMBER_SIMPLE_PROPERTY, ClassicPriority.VALUE, value);
	}

}
