package card.property;

import java.io.Serializable;

public class CardPropertyWithValue<T extends Serializable> extends AbstractCardProperty
{
	private static final long serialVersionUID = 1L;

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