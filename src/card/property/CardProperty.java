package card.property;

abstract class CardProperty
{

	private String name;
	private String description;

	public CardProperty(String name, String description)
	{
		this.name = name;
		this.description = description;
	}

	public String getName()
	{
		return this.name;
	}

	public String getDescription()
	{
		return this.description;
	}
}
