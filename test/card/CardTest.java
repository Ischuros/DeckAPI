package card;

import org.junit.Before;
import org.junit.Test;

import card.property.IllegalPriorityException;
import card.property.SimpleProperty;
import card.property.ValueCardProperty;
import junit.framework.Assert;

public class CardTest
{
	private Card<Integer> card;

	@Before
	public void before()
	{
		this.card = new Card<>();
	}

	@Test
	public void testAddProperty() throws IllegalPriorityException
	{
		card.addProperty(new IntCardProperty(1, 30));
		card.addProperty(new IntCardProperty(1, 20));
		card.addProperty(new IntCardProperty(1, 10));

		Assert.assertEquals(3, card.getPriorityOrderedProperties().size());
	}

	@Test
	public void testComparator() throws IllegalPriorityException
	{
		card.addProperty(new IntCardProperty(3, 30));
		card.addProperty(new IntCardProperty(2, 20));
		card.addProperty(new IntCardProperty(1, 10));

		Assert.assertEquals(10, card.getPriorityOrderedProperties().get(0).getValue());
		Assert.assertEquals(20, card.getPriorityOrderedProperties().get(1).getValue());
		Assert.assertEquals(30, card.getPriorityOrderedProperties().get(2).getValue());
	}

	@Test
	public void testComparatorDifferentPrioritiesProperties() throws IllegalPriorityException
	{
		card.addProperty(new FloatCardProperty(2, 10));
		card.addProperty(new IntCardProperty(1, 30));

		Assert.assertEquals(2, card.getPriorityOrderedProperties().size());
		Assert.assertEquals(Integer.valueOf(30),
				card.getPriorityOrderedProperties().get(0).getValue());
		Assert.assertEquals(Float.valueOf(10),
				card.getPriorityOrderedProperties().get(1).getValue());
	}

	@Test(expected = IllegalPriorityException.class)
	public void testComparatorSamePriorityProperties() throws IllegalPriorityException
	{
		card.addProperty(new IntCardProperty(1, 30));
		card.addProperty(new FloatCardProperty(1, 10));

		card.getPriorityOrderedProperties();
	}

	private final class IntCardProperty extends ValueCardProperty<Integer, Integer>
	{
		public IntCardProperty(int priority, int value)
		{
			super(new SimpleProperty("Integer value", "Integer value"), Integer.valueOf(priority),
					Integer.valueOf(value));
		}
	}

	private final class FloatCardProperty extends ValueCardProperty<Integer, Float>
	{
		public FloatCardProperty(int priority, float value)
		{
			super(new SimpleProperty("Float value", "Float value"), Integer.valueOf(priority),
					Float.valueOf(value));
		}
	}
}
