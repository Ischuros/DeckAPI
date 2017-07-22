package deck;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import card.property.SimpleProperty;
import card.property.ValueProperty;
import example.util.deck._52_classic_deck.property.Number;

public class DeckGeneratorTest
{
	private SimpleProperty property;
	private ValueProperty<Number> ace;
	private ValueProperty<Number> three;
	private ValueProperty<Number> four;
	private ValueProperty<Number> five;

	@Before
	public void before()
	{
		this.property = new SimpleProperty("Value", "Card value");
		this.ace = new ValueProperty<Number>(property, Number.ACE);
		this.three = new ValueProperty<Number>(property, Number.THREE);
		this.four = new ValueProperty<Number>(property, Number.FOUR);
		this.five = new ValueProperty<Number>(property, Number.FIVE);
	}

	@Test
	public void testGenerateCard()
	{
		Deck<Integer> deck = new DeckGenerator<Integer>().start().addCard().addProperty(ace)
				.finish().getDeck();

		Assert.assertEquals(1, deck.size());
		Assert.assertEquals(1, deck.getFirst().getPriorityOrderedProperties().size());
		Assert.assertEquals(Number.ACE,
				deck.get(0).getPriorityOrderedProperties().get(0).getValue());
	}

	@Test
	public void testGenerateSeveralCards()
	{
		Deck<Integer> deck = new DeckGenerator<Integer>().start().addCard().addProperty(three)
				.addCard().addProperty(four).addCard().addProperty(five).finish().getDeck();

		Assert.assertEquals(3, deck.size());
		Assert.assertEquals(1, deck.get(0).getPriorityOrderedProperties().size());
		Assert.assertEquals(1, deck.get(1).getPriorityOrderedProperties().size());
		Assert.assertEquals(1, deck.get(2).getPriorityOrderedProperties().size());
		Assert.assertEquals(Number.THREE,
				deck.get(0).getPriorityOrderedProperties().get(0).getValue());
		Assert.assertEquals(Number.FOUR,
				deck.get(1).getPriorityOrderedProperties().get(0).getValue());
		Assert.assertEquals(Number.FIVE,
				deck.get(2).getPriorityOrderedProperties().get(0).getValue());
	}
}
