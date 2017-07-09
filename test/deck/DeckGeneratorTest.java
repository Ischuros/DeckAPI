package deck;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import card.property.SimpleProperty;
import card.property.ValueCardProperty;
import example.Value;

public class DeckGeneratorTest
{
	private SimpleProperty valueProperty;
	private ValueCardProperty<Value> ace;
	private ValueCardProperty<Value> three;
	private ValueCardProperty<Value> four;
	private ValueCardProperty<Value> five;

	@Before
	public void before()
	{
		this.valueProperty = new SimpleProperty("Value", "Card value");
		this.ace = new ValueCardProperty<Value>(valueProperty, Value.ACE);
		this.three = new ValueCardProperty<Value>(valueProperty, Value.THREE);
		this.four = new ValueCardProperty<Value>(valueProperty, Value.FOUR);
		this.five = new ValueCardProperty<Value>(valueProperty, Value.FIVE);
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
				((ValueCardProperty<Value>) deck.get(0).getOrderedProperties().get(0)).getValue());
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
				((ValueCardProperty<Value>) deck.get(0).getOrderedProperties().get(0)).getValue());
		Assert.assertEquals(Value.FOUR,
				((ValueCardProperty<Value>) deck.get(1).getOrderedProperties().get(0)).getValue());
		Assert.assertEquals(Value.FIVE,
				((ValueCardProperty<Value>) deck.get(2).getOrderedProperties().get(0)).getValue());
	}
}
