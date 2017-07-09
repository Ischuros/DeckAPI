package card;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import card.play.IPlayTarget;
import card.property.CardProperty;
import card.property.ComparableCardProperty;

public class Card implements IPlayTarget
{
	private List<CardProperty> properties = new ArrayList<>();

	public void addProperty(CardProperty property)
	{
		properties.add(property);
	}

	public List<ComparableCardProperty<?>> getOrderedProperties()
	{
		return properties.stream().filter(p -> p instanceof ComparableCardProperty)
				.map(p -> (ComparableCardProperty<?>) p).sorted().collect(Collectors.toList());
	}

	@Override
	public String toString()
	{
		StringJoiner sj = new StringJoiner(" | ");
		properties.forEach(p -> sj.add(p.toString()));
		return sj.toString();
	}
}