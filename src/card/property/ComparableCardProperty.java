package card.property;

abstract class ComparableCardProperty<T extends Comparable<T>> extends CardProperty
		implements Comparable<T>
{

	ComparableCardProperty(String name, String description)
	{
		super(name, description);
	}
}
