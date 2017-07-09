package card.property;

public class PriorityAndValueCardProperty<P extends Comparable<P>, V extends Comparable<V>>
		extends ComparableCardProperty<PriorityAndValueCardProperty<P, V>>
{
	private P priority;
	private V value;

	public PriorityAndValueCardProperty(CardProperty property, P priority, V value)
	{
		super(property.getName(), property.getDescription());
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
			return getValue().compareTo(o.getValue());
		}
		return priorityCompare;
	}

}
