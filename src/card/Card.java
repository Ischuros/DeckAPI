package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

import card.play.IPlayTarget;
import card.property.CardProperty;

public class Card implements IPlayTarget
{
	private static final long serialVersionUID = 1L;

	private List<CardProperty> properties = new ArrayList<>();
	private CardPropertyComparator propertyComparator;

	public void addProperty(CardProperty property)
	{
		properties.add(property);
	}

	public List<CardProperty> getProperties()
	{
		List<CardProperty> sortedProperties = new ArrayList<>(properties);
		if (propertyComparator != null)
		{
			Collections.sort(sortedProperties, propertyComparator);
		}
		return sortedProperties;
	}

	public void setPropertyComparator(CardPropertyComparator propertyComparator)
	{
		this.propertyComparator = propertyComparator;
	}

	@Override
	public String toString()
	{
		StringJoiner sj = new StringJoiner(" | ");
		properties.forEach(p -> sj.add(p.toString()));
		return sj.toString();
	}
}