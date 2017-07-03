package card;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import card.interaction.IInteractionTarget;
import card.property.CardProperty;

public class Card implements IInteractionTarget
{
	private static final long serialVersionUID = 1L;

	private List<CardProperty> properties = new ArrayList<>();

	public void addProperty(CardProperty property)
	{
		properties.add(property);
	}

	public List<CardProperty> getProperties()
	{
		return properties;
	}

	@Override
	public String toString()
	{
		StringJoiner sj = new StringJoiner(" | ");
		properties.forEach(p -> sj.add(p.toString()));
		return sj.toString();
	}
}