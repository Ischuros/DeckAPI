package example.classic;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import deck.Deck;

public class ClassicDeckGeneratorTest
{
	@Test
	public void testNbCards()
	{
		Assert.assertEquals(52, new ClassicDeckGenerator().getDeck().size());
	}

	@Test
	public void testDeckSplittedIn2()
	{
		List<Deck> smallerDecks = new ClassicDeckGenerator().getDeck().splitInequalParts(2);

		Assert.assertEquals(2, smallerDecks.size());
		Assert.assertEquals(26, smallerDecks.get(0).size());
		Assert.assertEquals(26, smallerDecks.get(1).size());
	}
}
