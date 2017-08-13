package example.util.deck.fiftytwoclassicdeck.property;

import card.property.SimpleProperty;
import card.property.ValueCardProperty;

public class NumberProperty extends ValueCardProperty<ClassicPriority, Number>
{
	private static final SimpleProperty NUMBER_SIMPLE_PROPERTY = new SimpleProperty("Value",
			"Card value : from ace to king");

	public NumberProperty(Number value)
	{
		super(NUMBER_SIMPLE_PROPERTY, ClassicPriority.VALUE, value);
	}

}
