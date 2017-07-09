package example.classic;

import card.property.SimpleProperty;
import card.property.ValueCardProperty;
import deck.DeckGenerator;
import example.Symbol;
import example.Value;

public class ClassicDeckGenerator extends DeckGenerator
{
	public ClassicDeckGenerator()
	{
		SimpleProperty symbol = new SimpleProperty("Symbol",
				"Card symbol : club, diamond, heart or spade");
		SimpleProperty value = new SimpleProperty("Value", "Card value : from ace to king");

		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.CLUB),
				new ValueCardProperty<Value>(value, Value.ACE));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.CLUB),
				new ValueCardProperty<Value>(value, Value.TWO));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.CLUB),
				new ValueCardProperty<Value>(value, Value.THREE));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.CLUB),
				new ValueCardProperty<Value>(value, Value.FOUR));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.CLUB),
				new ValueCardProperty<Value>(value, Value.FIVE));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.CLUB),
				new ValueCardProperty<Value>(value, Value.SIX));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.CLUB),
				new ValueCardProperty<Value>(value, Value.SEVEN));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.CLUB),
				new ValueCardProperty<Value>(value, Value.EIGHT));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.CLUB),
				new ValueCardProperty<Value>(value, Value.NINE));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.CLUB),
				new ValueCardProperty<Value>(value, Value.TEN));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.CLUB),
				new ValueCardProperty<Value>(value, Value.JACK));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.CLUB),
				new ValueCardProperty<Value>(value, Value.QUEEN));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.CLUB),
				new ValueCardProperty<Value>(value, Value.KING));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.DIAMOND),
				new ValueCardProperty<Value>(value, Value.ACE));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.DIAMOND),
				new ValueCardProperty<Value>(value, Value.TWO));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.DIAMOND),
				new ValueCardProperty<Value>(value, Value.THREE));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.DIAMOND),
				new ValueCardProperty<Value>(value, Value.FOUR));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.DIAMOND),
				new ValueCardProperty<Value>(value, Value.FIVE));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.DIAMOND),
				new ValueCardProperty<Value>(value, Value.SIX));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.DIAMOND),
				new ValueCardProperty<Value>(value, Value.SEVEN));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.DIAMOND),
				new ValueCardProperty<Value>(value, Value.EIGHT));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.DIAMOND),
				new ValueCardProperty<Value>(value, Value.NINE));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.DIAMOND),
				new ValueCardProperty<Value>(value, Value.TEN));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.DIAMOND),
				new ValueCardProperty<Value>(value, Value.JACK));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.DIAMOND),
				new ValueCardProperty<Value>(value, Value.QUEEN));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.DIAMOND),
				new ValueCardProperty<Value>(value, Value.KING));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.HEART),
				new ValueCardProperty<Value>(value, Value.ACE));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.HEART),
				new ValueCardProperty<Value>(value, Value.TWO));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.HEART),
				new ValueCardProperty<Value>(value, Value.THREE));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.HEART),
				new ValueCardProperty<Value>(value, Value.FOUR));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.HEART),
				new ValueCardProperty<Value>(value, Value.FIVE));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.HEART),
				new ValueCardProperty<Value>(value, Value.SIX));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.HEART),
				new ValueCardProperty<Value>(value, Value.SEVEN));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.HEART),
				new ValueCardProperty<Value>(value, Value.EIGHT));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.HEART),
				new ValueCardProperty<Value>(value, Value.NINE));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.HEART),
				new ValueCardProperty<Value>(value, Value.TEN));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.HEART),
				new ValueCardProperty<Value>(value, Value.JACK));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.HEART),
				new ValueCardProperty<Value>(value, Value.QUEEN));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.HEART),
				new ValueCardProperty<Value>(value, Value.KING));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.SPADE),
				new ValueCardProperty<Value>(value, Value.ACE));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.SPADE),
				new ValueCardProperty<Value>(value, Value.TWO));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.SPADE),
				new ValueCardProperty<Value>(value, Value.THREE));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.SPADE),
				new ValueCardProperty<Value>(value, Value.FOUR));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.SPADE),
				new ValueCardProperty<Value>(value, Value.FIVE));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.SPADE),
				new ValueCardProperty<Value>(value, Value.SIX));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.SPADE),
				new ValueCardProperty<Value>(value, Value.SEVEN));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.SPADE),
				new ValueCardProperty<Value>(value, Value.EIGHT));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.SPADE),
				new ValueCardProperty<Value>(value, Value.NINE));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.SPADE),
				new ValueCardProperty<Value>(value, Value.TEN));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.SPADE),
				new ValueCardProperty<Value>(value, Value.JACK));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.SPADE),
				new ValueCardProperty<Value>(value, Value.QUEEN));
		generateCard(new ValueCardProperty<Symbol>(symbol, Symbol.SPADE),
				new ValueCardProperty<Value>(value, Value.KING));
	}
}
