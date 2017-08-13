package deck;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import card.property.IllegalPriorityException;
import card.property.SimpleProperty;
import card.property.ValueCardProperty;
import example.util.deck.fiftytwoclassicdeck.property.ClassicPriority;
import example.util.deck.fiftytwoclassicdeck.property.Number;

public class DeckGeneratorTest
{
	private SimpleProperty property;
	private ValueCardProperty<ClassicPriority, Number> ace;
	private ValueCardProperty<ClassicPriority, Number> three;
	private ValueCardProperty<ClassicPriority, Number> four;
	private ValueCardProperty<ClassicPriority, Number> five;

	@Before
	public void before()
	{
		this.property = new SimpleProperty("Value", "Card value");
		this.ace = new ValueCardProperty<ClassicPriority, Number>(property, ClassicPriority.VALUE,
				Number.ACE);
		this.three = new ValueCardProperty<ClassicPriority, Number>(property, ClassicPriority.VALUE,
				Number.THREE);
		this.four = new ValueCardProperty<ClassicPriority, Number>(property, ClassicPriority.VALUE,
				Number.FOUR);
		this.five = new ValueCardProperty<ClassicPriority, Number>(property, ClassicPriority.VALUE,
				Number.FIVE);
	}

	@Test
	public void testGenerateCard() throws IllegalPriorityException
	{
		Deck<ClassicPriority> deck = new DeckGenerator<ClassicPriority>().start().addCard()
				.addProperty(ace).finish().getDeck();

		Assert.assertEquals(1, deck.size());
		Assert.assertEquals(1, deck.getFirst().getPriorityOrderedProperties().size());
		Assert.assertEquals(Number.ACE,
				deck.get(0).getPriorityOrderedProperties().get(0).getValue());
	}

	@Test
	public void testGenerateSeveralCards() throws IllegalPriorityException
	{
		Deck<ClassicPriority> deck = new DeckGenerator<ClassicPriority>().start().addCard()
				.addProperty(three).addCard().addProperty(four).addCard().addProperty(five).finish()
				.getDeck();

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
