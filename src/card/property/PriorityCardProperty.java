package card.property;

import java.util.Comparator;

abstract class PriorityCardProperty<T extends PriorityCardProperty<T, P>, P extends Comparable<P>>
		extends ComparableCardProperty<T>
{
	private P priority;

	public PriorityCardProperty(CardProperty property, P priority)
	{
		this(property.getName(), property.getDescription(), priority);
	}

	public PriorityCardProperty(String name, String description, P priority)
	{
		super(name, description);
		this.priority = priority;
	}

	public final P getPriority()
	{
		return priority;
	}

	protected final Comparator<T> getPriorityComparator()
	{
		return (o1, o2) -> o1.getPriority().compareTo(o2.getPriority());
	}

}
