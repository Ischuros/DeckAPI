package example.battle;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import deck.Deck;

public class BattleDeckGeneratorTest
{
	@Test
	public void testNbCards()
	{
		Assert.assertEquals(52, BattleDeckGenerator.getDeck().size());
	}

	@Test
	public void testDeckSplittedIn2()
	{
		List<Deck<BattlePriority>> smallerDecks = BattleDeckGenerator.getDeck()
				.splitInequalParts(2);

		Assert.assertEquals(2, smallerDecks.size());
		Assert.assertEquals(26, smallerDecks.get(0).size());
		Assert.assertEquals(26, smallerDecks.get(1).size());
	}
}
