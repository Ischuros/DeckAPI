package card;

import org.junit.Before;
import org.junit.Test;

import card.property.PriorityAndValueCardProperty;
import card.property.SimpleProperty;
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
		card.addProperty(new IntCardProperty(1, 30));
		card.addProperty(new IntCardProperty(1, 20));
		card.addProperty(new IntCardProperty(1, 10));

		Assert.assertEquals(3, card.getProperties().size());
	}

	@Test
	public void testComparator()
	{
		card.addProperty(new IntCardProperty(1, 30));
		card.addProperty(new IntCardProperty(1, 20));
		card.addProperty(new IntCardProperty(1, 10));

		Assert.assertEquals(10,
				((IntCardProperty) card.getOrderedProperties().get(0)).getValue().intValue());
		Assert.assertEquals(20,
				((IntCardProperty) card.getOrderedProperties().get(1)).getValue().intValue());
		Assert.assertEquals(30,
				((IntCardProperty) card.getOrderedProperties().get(2)).getValue().intValue());
	}

	@Test
	public void testComparatorDifferentPrioritiesProperties()
	{
		card.addProperty(new IntCardProperty(1, 30));
		card.addProperty(new FloatCardProperty(2, 10));

		Assert.assertEquals(2, card.getOrderedProperties().size());
	}

	@Test
	public void testComparatorSamePriorityProperties()
	{
		card.addProperty(new IntCardProperty(1, 30));
		card.addProperty(new FloatCardProperty(1, 10));

		Assert.assertEquals(2, card.getOrderedProperties().size());
	}

	private final class IntCardProperty extends PriorityAndValueCardProperty<Integer, Integer>
	{
		public IntCardProperty(int priority, int value)
		{
			super(new SimpleProperty("Integer value", "Integer value"), Integer.valueOf(priority),
					Integer.valueOf(value));
		}
	}

	private final class FloatCardProperty extends PriorityAndValueCardProperty<Integer, Float>
	{
		public FloatCardProperty(int priority, float value)
		{
			super(new SimpleProperty("Float value", "Float value"), Integer.valueOf(priority),
					Float.valueOf(value));
		}
	}
}
