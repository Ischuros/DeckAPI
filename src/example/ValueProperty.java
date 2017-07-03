package example;

import card.property.CardPropertyWithValue;

public class ValueProperty extends CardPropertyWithValue<Value>
{
	private static final long serialVersionUID = 1L;

	public ValueProperty(Value value)
	{
		super("Value", "Card value", value);
	}
}