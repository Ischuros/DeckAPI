package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import card.play.IPlayTarget;
import card.property.CardProperty;
import card.property.PriorityAndValueCardProperty;

public class Card implements IPlayTarget
{
	private List<CardProperty> properties = new ArrayList<>();

	public void addProperty(CardProperty property)
	{
		properties.add(property);
	}

	public List<CardProperty> getProperties()
	{
		return properties;
	}

	public List<PriorityAndValueCardProperty> getOrderedProperties()
	{
		// TODO : to complete
		List<PriorityAndValueCardProperty> priorities = properties.stream()
				.filter(p -> p instanceof PriorityAndValueCardProperty)
				.map(p -> (PriorityAndValueCardProperty) p).collect(Collectors.toList());

		Collections.sort(priorities);
		return priorities;
	}

	@Override
	public String toString()
	{
		StringJoiner sj = new StringJoiner(" | ");
		properties.forEach(p -> sj.add(p.toString()));
		return sj.toString();
	}
}