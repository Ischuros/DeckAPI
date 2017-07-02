package card.property;

public class CardPropertyWithValue<T> extends AbstractCardProperty
{
	private T value;

	public CardPropertyWithValue(String name, String description, T value)
	{
		super(name, description);
		this.value = value;
	}

	public final T getValue()
	{
		return this.value;
	}

	@Override
	public String toString()
	{
		return new StringBuilder(getName()).append(" : ").append(value.toString()).toString();
	}
}