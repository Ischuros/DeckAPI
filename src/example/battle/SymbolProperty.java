package example.battle;

import card.property.PriorityAndValueCardProperty;
import card.property.SimpleProperty;

public class SymbolProperty extends PriorityAndValueCardProperty<BattlePriority, Symbol>
{
	private static final SimpleProperty SYMBOL_SIMPLE_PROPERTY = new SimpleProperty("Symbol",
			"Card symbol : club, diamond, heart or spade");

	public SymbolProperty(Symbol symbol)
	{
		super(SYMBOL_SIMPLE_PROPERTY, BattlePriority.SYMBOL, symbol);
	}

}
