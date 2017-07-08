package deck;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import card.property.CardProperty;
import card.property.CardPropertyValue;
import example.Value;

public class DeckGeneratorTest
{
	private CardProperty valueProperty;
	private CardPropertyValue<Value> ace;
	private CardPropertyValue<Value> three;
	private CardPropertyValue<Value> four;
	private CardPropertyValue<Value> five;

	@Before
	public void before()
	{
		this.valueProperty = new CardProperty("Value", "Card value");
		this.ace = new CardPropertyValue<Value>(valueProperty, Value.ACE);
		this.three = new CardPropertyValue<Value>(valueProperty, Value.THREE);
		this.four = new CardPropertyValue<Value>(valueProperty, Value.FOUR);
		this.five = new CardPropertyValue<Value>(valueProperty, Value.FIVE);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testGenerateCard()
	{
		DeckGenerator generator = new DeckGenerator();
		generator.generateCard(ace);

		Deck deck = generator.getDeck();

		Assert.assertEquals(1, deck.size());
		Assert.assertEquals(1, deck.getFirst().getOrderedProperties().size());
		Assert.assertEquals(Value.ACE,
				((CardPropertyValue<Value>) deck.get(0).getOrderedProperties().get(0)).getValue());
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testGenerateSeveralCards()
	{
		DeckGenerator generator = new DeckGenerator();
		generator.generateCard(three);
		generator.generateCard(four);
		generator.generateCard(five);

		Deck deck = generator.getDeck();

		Assert.assertEquals(3, deck.size());
		Assert.assertEquals(1, deck.get(0).getOrderedProperties().size());
		Assert.assertEquals(1, deck.get(1).getOrderedProperties().size());
		Assert.assertEquals(1, deck.get(2).getOrderedProperties().size());
		Assert.assertEquals(Value.THREE,
				((CardPropertyValue<Value>) deck.get(0).getOrderedProperties().get(0)).getValue());
		Assert.assertEquals(Value.FOUR,
				((CardPropertyValue<Value>) deck.get(1).getOrderedProperties().get(0)).getValue());
		Assert.assertEquals(Value.FIVE,
				((CardPropertyValue<Value>) deck.get(2).getOrderedProperties().get(0)).getValue());
	}
}
