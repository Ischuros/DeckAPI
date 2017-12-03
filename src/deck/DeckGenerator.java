package deck;

import card.Card;
import card.property.ValueCardProperty;

public final class DeckGenerator
{
	private final Deck deck = new Deck();

	public CardAdder start()
	{
		return new CardAdder();
	}

	public Deck getDeck()
	{
		return deck;
	}

	public final class CardAdder
	{
		private Card card;

		public CardAdder addProperty(ValueCardProperty<? extends Comparable<?>> property)
		{
			card.addProperty(property);
			return this;
		}

		public CardAdder addCard()
		{
			this.card = new Card();
			deck.add(card);
			return this;
		}

		public DeckGenerator finish()
		{
			return DeckGenerator.this;
		}
	}

}