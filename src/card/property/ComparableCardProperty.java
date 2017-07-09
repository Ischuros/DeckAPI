package card.property;

public abstract class ComparableCardProperty<T extends ComparableCardProperty<T>>
		extends CardProperty implements Comparable<T>
{
	public ComparableCardProperty(String name, String description)
	{
		super(name, description);
	}

}
