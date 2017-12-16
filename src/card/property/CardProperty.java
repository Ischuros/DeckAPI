package card.property;

public abstract class CardProperty
{

	private final String name;
	private final String description;

	CardProperty(String name, String description)
	{
		this.name = name;
		this.description = description;
	}

	String getName()
	{
		return this.name;
	}

	String getDescription()
	{
		return this.description;
	}
}
