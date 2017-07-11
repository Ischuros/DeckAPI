package example.battle;

import card.property.PriorityAndValueCardProperty;

public class SymbolProperty extends PriorityAndValueCardProperty<BattlePriority, Symbol>
{

	public SymbolProperty(Symbol symbol)
	{
		super("Symbol", "Card symbol : club, diamond, heart or spade", BattlePriority.SYMBOL,
				symbol);
	}

}
