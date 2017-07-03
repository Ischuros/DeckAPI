package example;

import card.property.CardPropertyWithValue;

public class SymbolProperty extends CardPropertyWithValue<Symbol>
{
	private static final long serialVersionUID = 1L;

	public SymbolProperty(Symbol value)
	{
		super("Symbol", "Card symbol", value);
	}
}