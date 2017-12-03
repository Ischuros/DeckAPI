package example.deck.fiftytwoclassicdeck.property;

import card.property.ValueCardProperty;

public class SymbolProperty extends ValueCardProperty<Symbol> {

    public SymbolProperty(Symbol symbol) {
        super("Symbol","Card symbol : club, diamond, heart or spade", symbol);
    }

}
