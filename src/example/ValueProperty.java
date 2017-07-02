package example;

import card.property.CardPropertyWithValue;

public class ValueProperty extends CardPropertyWithValue<Value>
{
	public ValueProperty(Value value)
	{
		super("Value", "Card value", value);
	}
}