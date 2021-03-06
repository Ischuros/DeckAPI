package deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

import card.Card;

public class Deck extends LinkedList<Card> {
	private static final long serialVersionUID = 1L;

	/**
	 * Shuffle the deck.
	 * @return the deck shuffled
	 */
	public Deck shuffle()
	{
		Collections.shuffle(this);
		return this;
	}

	/**
	 * Split the deck into smaller decks. These smaller decks have not
	 * necessarily the same size. For instance a 52 cards deck split in 3 do
	 * not have the same size.
	 * 
	 * @param nbDecks
	 *            Number of decks to split this deck
	 */
	public List<Deck> splitUnequalParts(int nbDecks)
	{
		List<Deck> decks = new ArrayList<>();
		for (int i = 0; i < nbDecks; i++)
		{
			decks.add(new Deck());
		}
		for (int i = 0; i < size(); i++)
		{
			decks.get(i % nbDecks).add(get(i));
		}
		return decks;
	}

	@Override
	public String toString()
	{
		StringJoiner sj = new StringJoiner(System.lineSeparator());
		forEach(c -> sj.add(c.toString()));
		return sj.toString();
	}
}