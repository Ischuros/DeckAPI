package example.util.deck.fiftytwoclassicdeck;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import deck.Deck;

public class FiftyTwoClassicDeckGeneratorTest
{
	@Test
	public void testNbCards()
	{
		Assert.assertEquals(52, FiftyTwoClassicDeckGenerator.getDeck().size());
	}

	@Test
	public void testDeckSplitIn2()
	{
		List<Deck> smallerDecks = FiftyTwoClassicDeckGenerator.getDeck()
				.splitUnequalParts(2);

		Assert.assertEquals(2, smallerDecks.size());
		Assert.assertEquals(26, smallerDecks.get(0).size());
		Assert.assertEquals(26, smallerDecks.get(1).size());
	}
}
