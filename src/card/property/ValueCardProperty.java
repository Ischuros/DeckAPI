package card.property;

public class ValueCardProperty<P extends Comparable<P>, V1 extends Comparable<V1>>
		extends PriorityCardProperty<ValueCardProperty<P, V1>, P>
{

	private V1 value;

	public ValueCardProperty(CardProperty property, P priority, V1 value)
	{
		this(property.getName(), property.getDescription(), priority, value);
	}

	public ValueCardProperty(String name, String description, P priority, V1 value)
	{
		super(name, description, priority);
		this.value = value;
	}

	public V1 getValue()
	{
		return value;
	}

	@Override
	public int compareTo(ValueCardProperty<P, V1> o)
	{
		int priorityCompare = getPriorityComparator().compare(this, o);
		if (priorityCompare == 0)
		{
			return compareValue(o);
		}
		return priorityCompare;
	}

	private int compareValue(ValueCardProperty<P, V1> o)
	{
		int valueCompare = getValue().compareTo(o.getValue());
		if (valueCompare == 0)
		{
			return compareName(o);
		}
		return valueCompare;
	}

	private int compareName(ValueCardProperty<P, V1> o)
	{
		int nameCompare = getName().compareTo(o.getName());
		if (nameCompare == 0)
		{
			return getDescription().compareTo(o.getDescription());
		}
		return nameCompare;
	}

}
