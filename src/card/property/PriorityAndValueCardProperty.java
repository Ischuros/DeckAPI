package card.property;

public abstract class PriorityAndValueCardProperty<P extends Comparable<P>, V extends Comparable<V>>
		extends ComparableCardProperty<PriorityAndValueCardProperty<P, V>>
{
	private P priority;
	private V value;

	public PriorityAndValueCardProperty(CardProperty property, P priority, V value)
	{
		this(property.getName(), property.getDescription(), priority, value);
	}

	public PriorityAndValueCardProperty(String name, String description, P priority, V value)
	{
		super(name, description);
		this.priority = priority;
		this.value = value;
	}

	public P getPriority()
	{
		return priority;
	}

	public V getValue()
	{
		return value;
	}

	@Override
	public int compareTo(PriorityAndValueCardProperty<P, V> o)
	{
		int priorityCompare = getPriority().compareTo(o.getPriority());
		if (priorityCompare == 0)
		{
			return compareValue(o);
		}
		return priorityCompare;
	}

	private int compareValue(PriorityAndValueCardProperty<P, V> o)
	{
		int valueCompare = getValue().compareTo(o.getValue());
		if (valueCompare == 0)
		{
			return compareName(o);
		}
		return valueCompare;
	}

	private int compareName(PriorityAndValueCardProperty<P, V> o)
	{
		int nameCompare = getName().compareTo(o.getName());
		if (nameCompare == 0)
		{
			return getDescription().compareTo(o.getDescription());
		}
		return nameCompare;
	}

}
