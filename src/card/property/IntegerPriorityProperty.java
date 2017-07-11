package card.property;

public class IntegerPriorityProperty<V extends Comparable<V>>
		extends PriorityAndValueCardProperty<Integer, V>
{

	public IntegerPriorityProperty(CardProperty property, Integer priority, V value)
	{
		super(property, priority, value);
	}

}
