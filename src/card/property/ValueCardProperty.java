package card.property;

public class ValueCardProperty<V extends Comparable<V>>
		extends ComparableCardProperty<ValueCardProperty<V>>
{
	private V value;

	public ValueCardProperty(CardProperty property, V value)
	{
		super(property.getName(), property.getDescription());
		this.value = value;
	}

	public V getValue()
	{
		return value;
	}

	@Override
	public int compareTo(ValueCardProperty<V> o)
	{
		return getValue().compareTo(o.getValue());
	}

}
