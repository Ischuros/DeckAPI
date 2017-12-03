package deck;

import card.Card;
import card.property.ValueCardProperty;

public final class DeckGenerator
{
	private final Deck deck = new Deck();

	public final CardAdder start()
	{
		return new CardAdder();
	}

	public final Deck getDeck()
	{
		return deck;
	}

	public final class CardAdder
	{
		private Card card;

		public final CardAdder addProperty(ValueCardProperty<? extends Comparable<?>> property)
		{
			card.addProperty(property);
			return this;
		}

		public final CardAdder addCard()
		{
			this.card = new Card();
			deck.add(card);
			return this;
		}

		public final DeckGenerator finish()
		{
			return DeckGenerator.this;
		}
	}

}