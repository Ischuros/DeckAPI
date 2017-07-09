package deck;

import card.Card;
import card.property.CardProperty;

public class DeckGenerator
{
	private Deck deck = new Deck();

	public void generateCard(CardProperty... properties)
	{
		Card card = new Card();
		for (CardProperty cardProperty : properties)
		{
			card.addProperty(cardProperty);
		}
		deck.add(card);
	}

	public Deck getDeck()
	{
		return deck;
	}
}