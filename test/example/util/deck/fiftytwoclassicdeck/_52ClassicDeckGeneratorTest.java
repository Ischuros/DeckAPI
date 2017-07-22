package example.util.deck.fiftytwoclassicdeck;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import deck.Deck;
import example.util.deck.fiftytwoclassicdeck._52ClassicDeckGenerator;
import example.util.deck.fiftytwoclassicdeck.property.ClassicPriority;

public class _52ClassicDeckGeneratorTest
{
	@Test
	public void testNbCards()
	{
		Assert.assertEquals(52, _52ClassicDeckGenerator.getDeck().size());
	}

	@Test
	public void testDeckSplittedIn2()
	{
		List<Deck<ClassicPriority>> smallerDecks = _52ClassicDeckGenerator.getDeck()
				.splitInequalParts(2);

		Assert.assertEquals(2, smallerDecks.size());
		Assert.assertEquals(26, smallerDecks.get(0).size());
		Assert.assertEquals(26, smallerDecks.get(1).size());
	}
}
