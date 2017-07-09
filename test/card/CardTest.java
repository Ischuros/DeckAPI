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

	@Test
	public void testComparatorDifferentProperties()
	{
		card.addProperty(new IntCardProperty(30));
		card.addProperty(new FloatCardProperty(10));

		Assert.assertEquals(2, card.getOrderedProperties().size());
	}

	private final class IntCardProperty extends ValueCardProperty<Integer>
	{
		public IntCardProperty(int value)
		{
			super(new SimpleProperty("Integer value", "Integer value"), Integer.valueOf(value));
		}
	}

	private final class FloatCardProperty extends ValueCardProperty<Float>
	{
		public FloatCardProperty(float value)
		{
			super(new SimpleProperty("Float value", "Float value"), Float.valueOf(value));
		}
	}
}
