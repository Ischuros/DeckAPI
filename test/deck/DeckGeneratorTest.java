package deck;

import org.junit.Assert;
import org.junit.Test;

import example.Value;
import example.ValueProperty;

public class DeckGeneratorTest
{
	@Test
	public void testGenerateCard()
	{
		DeckGenerator generator = new DeckGenerator();
		generator.generateCard(new ValueProperty(Value.ACE));

		Deck deck = generator.getDeck();

		Assert.assertEquals(1, deck.size());
		Assert.assertEquals(1, deck.getFirst().getProperties().size());
		Assert.assertEquals(Value.ACE, deck.get(0).getProperties().get(0).getValue());
	}

	@Test
	public void testGenerateSeveralCards()
	{
		DeckGenerator generator = new DeckGenerator();
		generator.generateCard(new ValueProperty(Value.THREE));
		generator.generateCard(new ValueProperty(Value.FOUR));
		generator.generateCard(new ValueProperty(Value.FIVE));

		Deck deck = generator.getDeck();

		Assert.assertEquals(3, deck.size());
		Assert.assertEquals(1, deck.get(0).getProperties().size());
		Assert.assertEquals(1, deck.get(1).getProperties().size());
		Assert.assertEquals(1, deck.get(2).getProperties().size());
		Assert.assertEquals(Value.THREE, deck.get(0).getProperties().get(0).getValue());
		Assert.assertEquals(Value.FOUR, deck.get(1).getProperties().get(0).getValue());
		Assert.assertEquals(Value.FIVE, deck.get(2).getProperties().get(0).getValue());
	}
}
