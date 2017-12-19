package example;

import deck.Deck;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DeckFactoryTest {

	@Test
	public void testNbCardsFiftyTwoClassicDeck()
	{
		Assert.assertEquals(52, DeckFactory.buildFiftyTwoClassicDeck().size());
	}

	@Test
	public void testDeckSplitIn2FiftyTwoClassicDeck()
	{
		List<Deck> smallerDecks = DeckFactory.buildFiftyTwoClassicDeck().splitUnequalParts(2);

		Assert.assertEquals(2, smallerDecks.size());
		Assert.assertEquals(26, smallerDecks.get(0).size());
		Assert.assertEquals(26, smallerDecks.get(1).size());
	}

}