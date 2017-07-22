package example.util.deck.fiftytwoclassicdeck.property;

import card.property.PriorityAndValueCardProperty;
import card.property.SimpleProperty;

public class SymbolProperty extends PriorityAndValueCardProperty<ClassicPriority, Symbol>
{
	private static final SimpleProperty SYMBOL_SIMPLE_PROPERTY = new SimpleProperty("Symbol",
			"Card symbol : club, diamond, heart or spade");

	public SymbolProperty(Symbol symbol)
	{
		super(SYMBOL_SIMPLE_PROPERTY, ClassicPriority.SYMBOL, symbol);
	}

}
