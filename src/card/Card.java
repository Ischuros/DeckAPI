package card;

import card.property.CardProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Card {
	private final List<CardProperty> properties = new ArrayList<>();

	public void addProperty(CardProperty property)
	{
		properties.add(property);
	}

	@Override
	public String toString()
	{
		StringJoiner sj = new StringJoiner(" ");
		properties.forEach(p -> sj.add(p.toString()));
		return sj.toString();
	}

}