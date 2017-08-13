package example.util.deck.fiftytwoclassicdeck;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import deck.Deck;
import example.util.deck.fiftytwoclassicdeck.FiftyTwoClassicDeckGenerator;
import example.util.deck.fiftytwoclassicdeck.property.ClassicPriority;

public class FiftyTwoClassicDeckGeneratorTest
{
	@Test
	public void testNbCards()
	{
		Assert.assertEquals(52, FiftyTwoClassicDeckGenerator.getDeck().size());
	}

	@Test
	public void testDeckSplittedIn2()
	{
		List<Deck<ClassicPriority>> smallerDecks = FiftyTwoClassicDeckGenerator.getDeck()
				.splitInequalParts(2);

		Assert.assertEquals(2, smallerDecks.size());
		Assert.assertEquals(26, smallerDecks.get(0).size());
		Assert.assertEquals(26, smallerDecks.get(1).size());
	}
}
