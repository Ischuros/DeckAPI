package card.property;

public class SimpleProperty extends PriorityAndValueCardProperty<Integer, Integer>
{

	public SimpleProperty(String name, String description)
	{
		super(name, description, Integer.valueOf(0), Integer.valueOf(0));
	}

}
