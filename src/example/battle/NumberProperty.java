package example.battle;

import card.property.PriorityAndValueCardProperty;

public class NumberProperty extends PriorityAndValueCardProperty<BattlePriority, Number>
{

	public NumberProperty(Number value)
	{
		super("Value", "Card value : from ace to king", BattlePriority.VALUE, value);
	}

}
