package card.property;

abstract class AbstractCardProperty implements ICardProperty
{
	private static final long serialVersionUID = 1L;

	private String name;
	private String description;

	public AbstractCardProperty(String name, String description)
	{
		this.name = name;
		this.description = description;
	}

	@Override
	public String getName()
	{
		return this.name;
	}

	@Override
	public String getDescription()
	{
		return this.description;
	}
}