package card.property;

import java.io.Serializable;

/**
 * Decorator of {@link CardProperty} Contains a typed value.
 * 
 * @author Lucas PRANEUF
 *
 * @param <T>
 *            The typed value contained by property
 */
public class CardPropertyValue<T extends Serializable> extends CardProperty
{
	private static final long serialVersionUID = 1L;

	private T value;

	public CardPropertyValue(CardProperty property, T value)
	{
		super(property.getName(), property.getDescription());
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