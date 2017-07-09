package example.classic;

import deck.DeckGenerator;

public class ClassicDeckGenerator extends DeckGenerator
{
	public ClassicDeckGenerator()
	{
		SymbolProperty clubProperty = new SymbolProperty(Symbol.CLUB);
		SymbolProperty diamondProperty = new SymbolProperty(Symbol.DIAMOND);
		SymbolProperty heartProperty = new SymbolProperty(Symbol.HEART);
		SymbolProperty spadeProperty = new SymbolProperty(Symbol.SPADE);

		ValueProperty ace = new ValueProperty(Value.ACE);
		ValueProperty two = new ValueProperty(Value.TWO);
		ValueProperty three = new ValueProperty(Value.THREE);
		ValueProperty four = new ValueProperty(Value.FOUR);
		ValueProperty five = new ValueProperty(Value.FIVE);
		ValueProperty six = new ValueProperty(Value.SIX);
		ValueProperty seven = new ValueProperty(Value.SEVEN);
		ValueProperty eight = new ValueProperty(Value.EIGHT);
		ValueProperty nine = new ValueProperty(Value.NINE);
		ValueProperty ten = new ValueProperty(Value.TEN);
		ValueProperty jack = new ValueProperty(Value.JACK);
		ValueProperty queen = new ValueProperty(Value.QUEEN);
		ValueProperty king = new ValueProperty(Value.KING);

		generateCard(clubProperty, ace);
		generateCard(clubProperty, two);
		generateCard(clubProperty, three);
		generateCard(clubProperty, four);
		generateCard(clubProperty, five);
		generateCard(clubProperty, six);
		generateCard(clubProperty, seven);
		generateCard(clubProperty, eight);
		generateCard(clubProperty, nine);
		generateCard(clubProperty, ten);
		generateCard(clubProperty, jack);
		generateCard(clubProperty, queen);
		generateCard(clubProperty, king);

		generateCard(diamondProperty, ace);
		generateCard(diamondProperty, two);
		generateCard(diamondProperty, three);
		generateCard(diamondProperty, four);
		generateCard(diamondProperty, five);
		generateCard(diamondProperty, six);
		generateCard(diamondProperty, seven);
		generateCard(diamondProperty, eight);
		generateCard(diamondProperty, nine);
		generateCard(diamondProperty, ten);
		generateCard(diamondProperty, jack);
		generateCard(diamondProperty, queen);
		generateCard(diamondProperty, king);

		generateCard(heartProperty, ace);
		generateCard(heartProperty, two);
		generateCard(heartProperty, three);
		generateCard(heartProperty, four);
		generateCard(heartProperty, five);
		generateCard(heartProperty, six);
		generateCard(heartProperty, seven);
		generateCard(heartProperty, eight);
		generateCard(heartProperty, nine);
		generateCard(heartProperty, ten);
		generateCard(heartProperty, jack);
		generateCard(heartProperty, queen);
		generateCard(heartProperty, king);

		generateCard(spadeProperty, ace);
		generateCard(spadeProperty, two);
		generateCard(spadeProperty, three);
		generateCard(spadeProperty, four);
		generateCard(spadeProperty, five);
		generateCard(spadeProperty, six);
		generateCard(spadeProperty, seven);
		generateCard(spadeProperty, eight);
		generateCard(spadeProperty, nine);
		generateCard(spadeProperty, ten);
		generateCard(spadeProperty, jack);
		generateCard(spadeProperty, queen);
		generateCard(spadeProperty, king);
	}
}
