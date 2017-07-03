package example.classic;

import card.property.CardProperty;
import card.property.CardPropertyValue;
import deck.DeckGenerator;
import example.Symbol;
import example.Value;

public class ClassicDeckGenerator extends DeckGenerator
{
	public ClassicDeckGenerator()
	{
		CardProperty symbol = new CardProperty("Symbol",
				"Card symbol : club, diamond, heart or spade");
		CardProperty value = new CardProperty("Value", "Card value : from ace to king");

		generateCard(new CardPropertyValue<>(symbol, Symbol.CLUB),
				new CardPropertyValue<>(value, Value.ACE));
		generateCard(new CardPropertyValue<>(symbol, Symbol.CLUB),
				new CardPropertyValue<>(value, Value.TWO));
		generateCard(new CardPropertyValue<>(symbol, Symbol.CLUB),
				new CardPropertyValue<>(value, Value.THREE));
		generateCard(new CardPropertyValue<>(symbol, Symbol.CLUB),
				new CardPropertyValue<>(value, Value.FOUR));
		generateCard(new CardPropertyValue<>(symbol, Symbol.CLUB),
				new CardPropertyValue<>(value, Value.FIVE));
		generateCard(new CardPropertyValue<>(symbol, Symbol.CLUB),
				new CardPropertyValue<>(value, Value.SIX));
		generateCard(new CardPropertyValue<>(symbol, Symbol.CLUB),
				new CardPropertyValue<>(value, Value.SEVEN));
		generateCard(new CardPropertyValue<>(symbol, Symbol.CLUB),
				new CardPropertyValue<>(value, Value.EIGHT));
		generateCard(new CardPropertyValue<>(symbol, Symbol.CLUB),
				new CardPropertyValue<>(value, Value.NINE));
		generateCard(new CardPropertyValue<>(symbol, Symbol.CLUB),
				new CardPropertyValue<>(value, Value.TEN));
		generateCard(new CardPropertyValue<>(symbol, Symbol.CLUB),
				new CardPropertyValue<>(value, Value.JACK));
		generateCard(new CardPropertyValue<>(symbol, Symbol.CLUB),
				new CardPropertyValue<>(value, Value.QUEEN));
		generateCard(new CardPropertyValue<>(symbol, Symbol.CLUB),
				new CardPropertyValue<>(value, Value.KING));
		generateCard(new CardPropertyValue<>(symbol, Symbol.DIAMOND),
				new CardPropertyValue<>(value, Value.ACE));
		generateCard(new CardPropertyValue<>(symbol, Symbol.DIAMOND),
				new CardPropertyValue<>(value, Value.TWO));
		generateCard(new CardPropertyValue<>(symbol, Symbol.DIAMOND),
				new CardPropertyValue<>(value, Value.THREE));
		generateCard(new CardPropertyValue<>(symbol, Symbol.DIAMOND),
				new CardPropertyValue<>(value, Value.FOUR));
		generateCard(new CardPropertyValue<>(symbol, Symbol.DIAMOND),
				new CardPropertyValue<>(value, Value.FIVE));
		generateCard(new CardPropertyValue<>(symbol, Symbol.DIAMOND),
				new CardPropertyValue<>(value, Value.SIX));
		generateCard(new CardPropertyValue<>(symbol, Symbol.DIAMOND),
				new CardPropertyValue<>(value, Value.SEVEN));
		generateCard(new CardPropertyValue<>(symbol, Symbol.DIAMOND),
				new CardPropertyValue<>(value, Value.EIGHT));
		generateCard(new CardPropertyValue<>(symbol, Symbol.DIAMOND),
				new CardPropertyValue<>(value, Value.NINE));
		generateCard(new CardPropertyValue<>(symbol, Symbol.DIAMOND),
				new CardPropertyValue<>(value, Value.TEN));
		generateCard(new CardPropertyValue<>(symbol, Symbol.DIAMOND),
				new CardPropertyValue<>(value, Value.JACK));
		generateCard(new CardPropertyValue<>(symbol, Symbol.DIAMOND),
				new CardPropertyValue<>(value, Value.QUEEN));
		generateCard(new CardPropertyValue<>(symbol, Symbol.DIAMOND),
				new CardPropertyValue<>(value, Value.KING));
		generateCard(new CardPropertyValue<>(symbol, Symbol.HEART),
				new CardPropertyValue<>(value, Value.ACE));
		generateCard(new CardPropertyValue<>(symbol, Symbol.HEART),
				new CardPropertyValue<>(value, Value.TWO));
		generateCard(new CardPropertyValue<>(symbol, Symbol.HEART),
				new CardPropertyValue<>(value, Value.THREE));
		generateCard(new CardPropertyValue<>(symbol, Symbol.HEART),
				new CardPropertyValue<>(value, Value.FOUR));
		generateCard(new CardPropertyValue<>(symbol, Symbol.HEART),
				new CardPropertyValue<>(value, Value.FIVE));
		generateCard(new CardPropertyValue<>(symbol, Symbol.HEART),
				new CardPropertyValue<>(value, Value.SIX));
		generateCard(new CardPropertyValue<>(symbol, Symbol.HEART),
				new CardPropertyValue<>(value, Value.SEVEN));
		generateCard(new CardPropertyValue<>(symbol, Symbol.HEART),
				new CardPropertyValue<>(value, Value.EIGHT));
		generateCard(new CardPropertyValue<>(symbol, Symbol.HEART),
				new CardPropertyValue<>(value, Value.NINE));
		generateCard(new CardPropertyValue<>(symbol, Symbol.HEART),
				new CardPropertyValue<>(value, Value.TEN));
		generateCard(new CardPropertyValue<>(symbol, Symbol.HEART),
				new CardPropertyValue<>(value, Value.JACK));
		generateCard(new CardPropertyValue<>(symbol, Symbol.HEART),
				new CardPropertyValue<>(value, Value.QUEEN));
		generateCard(new CardPropertyValue<>(symbol, Symbol.HEART),
				new CardPropertyValue<>(value, Value.KING));
		generateCard(new CardPropertyValue<>(symbol, Symbol.SPADE),
				new CardPropertyValue<>(value, Value.ACE));
		generateCard(new CardPropertyValue<>(symbol, Symbol.SPADE),
				new CardPropertyValue<>(value, Value.TWO));
		generateCard(new CardPropertyValue<>(symbol, Symbol.SPADE),
				new CardPropertyValue<>(value, Value.THREE));
		generateCard(new CardPropertyValue<>(symbol, Symbol.SPADE),
				new CardPropertyValue<>(value, Value.FOUR));
		generateCard(new CardPropertyValue<>(symbol, Symbol.SPADE),
				new CardPropertyValue<>(value, Value.FIVE));
		generateCard(new CardPropertyValue<>(symbol, Symbol.SPADE),
				new CardPropertyValue<>(value, Value.SIX));
		generateCard(new CardPropertyValue<>(symbol, Symbol.SPADE),
				new CardPropertyValue<>(value, Value.SEVEN));
		generateCard(new CardPropertyValue<>(symbol, Symbol.SPADE),
				new CardPropertyValue<>(value, Value.EIGHT));
		generateCard(new CardPropertyValue<>(symbol, Symbol.SPADE),
				new CardPropertyValue<>(value, Value.NINE));
		generateCard(new CardPropertyValue<>(symbol, Symbol.SPADE),
				new CardPropertyValue<>(value, Value.TEN));
		generateCard(new CardPropertyValue<>(symbol, Symbol.SPADE),
				new CardPropertyValue<>(value, Value.JACK));
		generateCard(new CardPropertyValue<>(symbol, Symbol.SPADE),
				new CardPropertyValue<>(value, Value.QUEEN));
		generateCard(new CardPropertyValue<>(symbol, Symbol.SPADE),
				new CardPropertyValue<>(value, Value.KING));
	}
}
