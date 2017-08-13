package example.util.deck.fiftytwoclassicdeck.property;

import card.property.SimpleProperty;
import card.property.ValueCardProperty;

public class SymbolProperty extends ValueCardProperty<ClassicPriority, Symbol>
{
	private static final SimpleProperty SYMBOL_SIMPLE_PROPERTY = new SimpleProperty("Symbol",
			"Card symbol : club, diamond, heart or spade");

	public SymbolProperty(Symbol symbol)
	{
		super(SYMBOL_SIMPLE_PROPERTY, ClassicPriority.SYMBOL, symbol);
	}

}
