package deck;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import card.property.SimpleProperty;
import card.property.ValueProperty;
import example.battle.Number;

public class DeckGeneratorTest
{
	private SimpleProperty valueProperty;
	private ValueProperty<Number> ace;
	private ValueProperty<Number> three;
	private ValueProperty<Number> four;
	private ValueProperty<Number> five;

	@Before
	public void before()
	{
		this.valueProperty = new SimpleProperty("Value", "Card value");
		this.ace = new ValueProperty<Number>(valueProperty, Number.ACE);
		this.three = new ValueProperty<Number>(valueProperty, Number.THREE);
		this.four = new ValueProperty<Number>(valueProperty, Number.FOUR);
		this.five = new ValueProperty<Number>(valueProperty, Number.FIVE);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testGenerateCard()
	{
		DeckGenerator generator = new DeckGenerator();
		generator.generateCard(ace);

		Deck deck = generator.getDeck();

		Assert.assertEquals(1, deck.size());
		Assert.assertEquals(1, deck.getFirst().getProperties().size());
		Assert.assertEquals(Number.ACE,
				((ValueProperty<Number>) deck.get(0).getProperties().get(0)).getValue());
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
		Assert.assertEquals(1, deck.get(0).getProperties().size());
		Assert.assertEquals(1, deck.get(1).getProperties().size());
		Assert.assertEquals(1, deck.get(2).getProperties().size());
		Assert.assertEquals(Number.THREE,
				((ValueProperty<Number>) deck.get(0).getProperties().get(0)).getValue());
		Assert.assertEquals(Number.FOUR,
				((ValueProperty<Number>) deck.get(1).getProperties().get(0)).getValue());
		Assert.assertEquals(Number.FIVE,
				((ValueProperty<Number>) deck.get(2).getProperties().get(0)).getValue());
	}
}
