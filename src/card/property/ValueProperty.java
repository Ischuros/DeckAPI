package card.property;

public class ValueProperty<V extends Comparable<V>> extends PriorityAndValueCardProperty<Integer, V>
{
	public ValueProperty(CardProperty property, V value)
	{
		super(property, Integer.valueOf(0), value);
	}

}