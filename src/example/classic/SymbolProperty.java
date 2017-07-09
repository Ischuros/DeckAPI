package example.classic;

import card.property.SimpleProperty;
import card.property.ValueCardProperty;

public class SymbolProperty extends ValueCardProperty<Symbol>
{

	public SymbolProperty(Symbol symbol)
	{
		super(new SimpleProperty("Symbol", "Card symbol : club, diamond, heart or spade"), symbol);
	}

}
