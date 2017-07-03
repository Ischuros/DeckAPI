package deck;

import card.Card;
import card.property.CardPropertyValue;

public class DeckGenerator
{
	private Deck deck = new Deck();

	public void generateCard(CardPropertyValue<?>... properties)
	{
		Card card = new Card();
		for (CardPropertyValue<?> cardPropertyWithValue : properties)
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