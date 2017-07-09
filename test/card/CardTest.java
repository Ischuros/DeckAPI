package card;

import org.junit.Before;
import org.junit.Test;

import card.property.SimpleProperty;
import card.property.ValueCardProperty;
import junit.framework.Assert;

public class CardTest
{
	private Card card;

	@Before
	public void before()
	{
		this.card = new Card();
	}

	@Test
	public void testAddProperty()
	{
		card.addProperty(new IntCardProperty(30));
		card.addProperty(new IntCardProperty(20));
		card.addProperty(new IntCardProperty(10));

		Assert.assertEquals(3, card.getOrderedProperties().size());
	}

	@Test
	public void testComparator()
	{
		card.addProperty(new IntCardProperty(30));
		card.addProperty(new IntCardProperty(20));
		card.addProperty(new IntCardProperty(10));

		Assert.assertEquals(10,
				((IntCardProperty) card.getOrderedProperties().get(0)).getValue().intValue());
		Assert.assertEquals(20,
				((IntCardProperty) card.getOrderedProperties().get(1)).getValue().intValue());
		Assert.assertEquals(30,
				((IntCardProperty) card.getOrderedProperties().get(2)).getValue().intValue());
	}

	private final class IntCardProperty extends ValueCardProperty<Integer>
	{
		public IntCardProperty(int value)
		{
			super(new SimpleProperty("Value", "Value"), Integer.valueOf(value));
		}
	}
}
