package deck;

import card.Card;
import card.property.CardPropertyWithValue;

public class DeckGenerator
{
	private Deck deck = new Deck();

	public void generateCard(CardPropertyWithValue<?>... properties)
	{
		Card card = new Card();
		for (CardPropertyWithValue<?> cardPropertyWithValue : properties)
		{
			card.addProperty(cardPropertyWithValue);
		}
		deck.add(card);
	}

	public Deck getDeck()
	{
		return deck;
	}
}