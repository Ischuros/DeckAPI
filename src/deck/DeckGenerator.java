package deck;

import card.Card;
import card.property.PriorityAndValueCardProperty;

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

		public CardAdder()
		{
			this.card = new Card<>();
			deck.add(card);
		}

		public CardAdder addProperty(PriorityAndValueCardProperty<P, ?> property)
		{
			card.addProperty(property);
			return this;
		}

		public CardAdder addCard()
		{
			return new CardAdder();
		}

		public DeckGenerator<P> finish()
		{
			return DeckGenerator.this;
		}
	}

}