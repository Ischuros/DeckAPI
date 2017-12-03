package example.util.deck.fiftytwoclassicdeck.property;

import card.property.ValueCardProperty;

public class NumberProperty extends ValueCardProperty<Number> {

    public NumberProperty(Number value) {
        super("Value", "Card value : from ace to king", value);
    }

}
