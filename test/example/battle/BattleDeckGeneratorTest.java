package example.battle;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import deck.Deck;
import example.battle.BattleDeckGenerator;

public class BattleDeckGeneratorTest
{
	@Test
	public void testNbCards()
	{
		Assert.assertEquals(52, new BattleDeckGenerator().getDeck().size());
	}

	@Test
	public void testDeckSplittedIn2()
	{
		List<Deck> smallerDecks = new BattleDeckGenerator().getDeck().splitInequalParts(2);

		Assert.assertEquals(2, smallerDecks.size());
		Assert.assertEquals(26, smallerDecks.get(0).size());
		Assert.assertEquals(26, smallerDecks.get(1).size());
	}
}
