package example;

import card.property.CardPropertyWithValue;

public class SymbolProperty extends CardPropertyWithValue<Symbol>
{
	public SymbolProperty(Symbol value)
	{
		super("Symbol", "Card symbol", value);
	}
}