package example.classic;

import card.property.SimpleProperty;
import card.property.ValueCardProperty;

public class ValueProperty extends ValueCardProperty<Value>
{

	public ValueProperty(Value value)
	{
		super(new SimpleProperty("Value", "Card value : from ace to king"), value);
	}

}
