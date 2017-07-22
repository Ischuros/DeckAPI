package card.property;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class PriorityAndValueCardPropertyTest
{

	@Test
	public void testOrderPriority()
	{
		PriorityAndValueCardProperty<Integer, Integer> priority1 = createProperty("a", "b",
				Integer.valueOf(90), Integer.valueOf(10));
		PriorityAndValueCardProperty<Integer, Integer> priority2 = createProperty("a", "b",
				Integer.valueOf(80), Integer.valueOf(10));
		PriorityAndValueCardProperty<Integer, Integer> priority3 = createProperty("a", "b",
				Integer.valueOf(70), Integer.valueOf(10));
		PriorityAndValueCardProperty<Integer, Integer> priority4 = createProperty("a", "b",
				Integer.valueOf(60), Integer.valueOf(10));
		PriorityAndValueCardProperty<Integer, Integer> priority5 = createProperty("a", "b",
				Integer.valueOf(50), Integer.valueOf(10));

		List<PriorityAndValueCardProperty<Integer, Integer>> priorities = new ArrayList<>();
		priorities.add(priority1);
		priorities.add(priority2);
		priorities.add(priority3);
		priorities.add(priority4);
		priorities.add(priority5);

		Collections.sort(priorities);

		Assert.assertEquals(priority5, priorities.get(0));
		Assert.assertEquals(priority4, priorities.get(1));
		Assert.assertEquals(priority3, priorities.get(2));
		Assert.assertEquals(priority2, priorities.get(3));
		Assert.assertEquals(priority1, priorities.get(4));

	}

	@Test
	public void testOrderValue()
	{
		PriorityAndValueCardProperty<Integer, Integer> priority1 = createProperty("a", "b",
				Integer.valueOf(10), Integer.valueOf(90));
		PriorityAndValueCardProperty<Integer, Integer> priority2 = createProperty("a", "b",
				Integer.valueOf(10), Integer.valueOf(80));
		PriorityAndValueCardProperty<Integer, Integer> priority3 = createProperty("a", "b",
				Integer.valueOf(10), Integer.valueOf(70));
		PriorityAndValueCardProperty<Integer, Integer> priority4 = createProperty("a", "b",
				Integer.valueOf(10), Integer.valueOf(60));
		PriorityAndValueCardProperty<Integer, Integer> priority5 = createProperty("a", "b",
				Integer.valueOf(10), Integer.valueOf(50));

		List<PriorityAndValueCardProperty<Integer, Integer>> priorities = new ArrayList<>();
		priorities.add(priority1);
		priorities.add(priority2);
		priorities.add(priority3);
		priorities.add(priority4);
		priorities.add(priority5);

		Collections.sort(priorities);

		Assert.assertEquals(priority5, priorities.get(0));
		Assert.assertEquals(priority4, priorities.get(1));
		Assert.assertEquals(priority3, priorities.get(2));
		Assert.assertEquals(priority2, priorities.get(3));
		Assert.assertEquals(priority1, priorities.get(4));
	}

	@Test
	public void testOrderPriorityAndValue()
	{
		PriorityAndValueCardProperty<Integer, Integer> priority1 = createProperty("a", "b",
				Integer.valueOf(30), Integer.valueOf(90));
		PriorityAndValueCardProperty<Integer, Integer> priority2 = createProperty("a", "b",
				Integer.valueOf(30), Integer.valueOf(80));
		PriorityAndValueCardProperty<Integer, Integer> priority3 = createProperty("a", "b",
				Integer.valueOf(30), Integer.valueOf(70));
		PriorityAndValueCardProperty<Integer, Integer> priority4 = createProperty("a", "b",
				Integer.valueOf(10), Integer.valueOf(90));
		PriorityAndValueCardProperty<Integer, Integer> priority5 = createProperty("a", "b",
				Integer.valueOf(10), Integer.valueOf(80));
		PriorityAndValueCardProperty<Integer, Integer> priority6 = createProperty("a", "b",
				Integer.valueOf(10), Integer.valueOf(70));

		List<PriorityAndValueCardProperty<Integer, Integer>> priorities = new ArrayList<>();
		priorities.add(priority1);
		priorities.add(priority2);
		priorities.add(priority3);
		priorities.add(priority4);
		priorities.add(priority5);
		priorities.add(priority6);

		Collections.sort(priorities);

		Assert.assertEquals(priority6, priorities.get(0));
		Assert.assertEquals(priority5, priorities.get(1));
		Assert.assertEquals(priority4, priorities.get(2));
		Assert.assertEquals(priority3, priorities.get(3));
		Assert.assertEquals(priority2, priorities.get(4));
		Assert.assertEquals(priority1, priorities.get(5));
	}

	@Test
	public void testOrderName()
	{
		PriorityAndValueCardProperty<Integer, Integer> priority1 = createProperty("z", "b",
				Integer.valueOf(10), Integer.valueOf(10));
		PriorityAndValueCardProperty<Integer, Integer> priority2 = createProperty("y", "b",
				Integer.valueOf(10), Integer.valueOf(10));
		PriorityAndValueCardProperty<Integer, Integer> priority3 = createProperty("x", "b",
				Integer.valueOf(10), Integer.valueOf(10));
		PriorityAndValueCardProperty<Integer, Integer> priority4 = createProperty("w", "b",
				Integer.valueOf(10), Integer.valueOf(10));
		PriorityAndValueCardProperty<Integer, Integer> priority5 = createProperty("v", "b",
				Integer.valueOf(10), Integer.valueOf(10));

		List<PriorityAndValueCardProperty<Integer, Integer>> priorities = new ArrayList<>();
		priorities.add(priority1);
		priorities.add(priority2);
		priorities.add(priority3);
		priorities.add(priority4);
		priorities.add(priority5);

		Collections.sort(priorities);

		Assert.assertEquals(priority5, priorities.get(0));
		Assert.assertEquals(priority4, priorities.get(1));
		Assert.assertEquals(priority3, priorities.get(2));
		Assert.assertEquals(priority2, priorities.get(3));
		Assert.assertEquals(priority1, priorities.get(4));

	}

	@Test
	public void testOrderDescription()
	{
		PriorityAndValueCardProperty<Integer, Integer> priority1 = createProperty("a", "z",
				Integer.valueOf(10), Integer.valueOf(10));
		PriorityAndValueCardProperty<Integer, Integer> priority2 = createProperty("a", "y",
				Integer.valueOf(10), Integer.valueOf(10));
		PriorityAndValueCardProperty<Integer, Integer> priority3 = createProperty("a", "x",
				Integer.valueOf(10), Integer.valueOf(10));
		PriorityAndValueCardProperty<Integer, Integer> priority4 = createProperty("a", "w",
				Integer.valueOf(10), Integer.valueOf(10));
		PriorityAndValueCardProperty<Integer, Integer> priority5 = createProperty("a", "v",
				Integer.valueOf(10), Integer.valueOf(10));

		List<PriorityAndValueCardProperty<Integer, Integer>> priorities = new ArrayList<>();
		priorities.add(priority1);
		priorities.add(priority2);
		priorities.add(priority3);
		priorities.add(priority4);
		priorities.add(priority5);

		Collections.sort(priorities);

		Assert.assertEquals(priority5, priorities.get(0));
		Assert.assertEquals(priority4, priorities.get(1));
		Assert.assertEquals(priority3, priorities.get(2));
		Assert.assertEquals(priority2, priorities.get(3));
		Assert.assertEquals(priority1, priorities.get(4));

	}

	private PriorityAndValueCardProperty<Integer, Integer> createProperty(String name,
			String description, Integer priority, Integer value)
	{
		return new PriorityAndValueCardProperty<Integer, Integer>(name, description, priority,
				value)
		{
		};
	}
}
