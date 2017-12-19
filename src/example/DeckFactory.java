package example;

import deck.Deck;
import deck.DeckGenerator;
import example.deck.fiftytwoclassicdeck.property.Number;
import example.deck.fiftytwoclassicdeck.property.NumberProperty;
import example.deck.fiftytwoclassicdeck.property.Symbol;
import example.deck.fiftytwoclassicdeck.property.SymbolProperty;

public class DeckFactory {

	private DeckFactory() {
	}

	public static Deck buildFiftyTwoClassicDeck()
	{
		SymbolProperty club = new SymbolProperty(Symbol.CLUB);
		SymbolProperty diamond = new SymbolProperty(Symbol.DIAMOND);
		SymbolProperty heart = new SymbolProperty(Symbol.HEART);
		SymbolProperty spade = new SymbolProperty(Symbol.SPADE);

		NumberProperty ace = new NumberProperty(Number.ACE);
		NumberProperty two = new NumberProperty(Number.TWO);
		NumberProperty three = new NumberProperty(Number.THREE);
		NumberProperty four = new NumberProperty(Number.FOUR);
		NumberProperty five = new NumberProperty(Number.FIVE);
		NumberProperty six = new NumberProperty(Number.SIX);
		NumberProperty seven = new NumberProperty(Number.SEVEN);
		NumberProperty eight = new NumberProperty(Number.EIGHT);
		NumberProperty nine = new NumberProperty(Number.NINE);
		NumberProperty ten = new NumberProperty(Number.TEN);
		NumberProperty jack = new NumberProperty(Number.JACK);
		NumberProperty queen = new NumberProperty(Number.QUEEN);
		NumberProperty king = new NumberProperty(Number.KING);

		return new DeckGenerator().start()
				.addCard().addProperty(club).addProperty(ace)
				.addCard().addProperty(club).addProperty(two)
				.addCard().addProperty(club).addProperty(three)
				.addCard().addProperty(club).addProperty(four)
				.addCard().addProperty(club).addProperty(five)
				.addCard().addProperty(club).addProperty(six)
				.addCard().addProperty(club).addProperty(seven)
				.addCard().addProperty(club).addProperty(eight)
				.addCard().addProperty(club).addProperty(nine)
				.addCard().addProperty(club).addProperty(ten)
				.addCard().addProperty(club).addProperty(jack)
				.addCard().addProperty(club).addProperty(queen)
				.addCard().addProperty(club).addProperty(king)

				.addCard().addProperty(diamond).addProperty(ace)
				.addCard().addProperty(diamond).addProperty(two)
				.addCard().addProperty(diamond).addProperty(three)
				.addCard().addProperty(diamond).addProperty(four)
				.addCard().addProperty(diamond).addProperty(five)
				.addCard().addProperty(diamond).addProperty(six)
				.addCard().addProperty(diamond).addProperty(seven)
				.addCard().addProperty(diamond).addProperty(eight)
				.addCard().addProperty(diamond).addProperty(nine)
				.addCard().addProperty(diamond).addProperty(ten)
				.addCard().addProperty(diamond).addProperty(jack)
				.addCard().addProperty(diamond).addProperty(queen)
				.addCard().addProperty(diamond).addProperty(king)

				.addCard().addProperty(heart).addProperty(ace)
				.addCard().addProperty(heart).addProperty(two)
				.addCard().addProperty(heart).addProperty(three)
				.addCard().addProperty(heart).addProperty(four)
				.addCard().addProperty(heart).addProperty(five)
				.addCard().addProperty(heart).addProperty(six)
				.addCard().addProperty(heart).addProperty(seven)
				.addCard().addProperty(heart).addProperty(eight)
				.addCard().addProperty(heart).addProperty(nine)
				.addCard().addProperty(heart).addProperty(ten)
				.addCard().addProperty(heart).addProperty(jack)
				.addCard().addProperty(heart).addProperty(queen)
				.addCard().addProperty(heart).addProperty(king)

				.addCard().addProperty(spade).addProperty(ace)
				.addCard().addProperty(spade).addProperty(two)
				.addCard().addProperty(spade).addProperty(three)
				.addCard().addProperty(spade).addProperty(four)
				.addCard().addProperty(spade).addProperty(five)
				.addCard().addProperty(spade).addProperty(six)
				.addCard().addProperty(spade).addProperty(seven)
				.addCard().addProperty(spade).addProperty(eight)
				.addCard().addProperty(spade).addProperty(nine)
				.addCard().addProperty(spade).addProperty(ten)
				.addCard().addProperty(spade).addProperty(jack)
				.addCard().addProperty(spade).addProperty(queen)
				.addCard().addProperty(spade).addProperty(king)
				.finish().getDeck();
	}
}
