package deck;

import card.Card;
import card.property.ValueCardProperty;

public final class DeckGenerator<P extends Comparable<P>>
{
	private Deck<P> deck = new Deck<>();

	public CardAdder start()
	{
		return new CardAdder();
	}

	public Deck<P> getDeck()
	{
		return deck;
	}

	public final class CardAdder
	{
		private Card<P> card;

		public CardAdder addProperty(ValueCardProperty<P, ?> property)
		{
			card.addProperty(property);
			return this;
		}

		public CardAdder addCard()
		{
			this.card = new Card<>();
			deck.add(card);
			return this;
		}

		public DeckGenerator<P> finish()
		{
			return DeckGenerator.this;
		}
	}

}