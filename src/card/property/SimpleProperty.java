package card.property;

public class SimpleProperty extends ValueCardProperty<Integer, Integer>
{

	public SimpleProperty(String name, String description)
	{
		super(name, description, Integer.valueOf(Integer.MIN_VALUE),
				Integer.valueOf(Integer.MIN_VALUE));
	}

}
