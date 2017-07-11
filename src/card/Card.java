package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

import card.play.IPlayTarget;
import card.property.PriorityAndValueCardProperty;
import card.property.PriorityComparator;

public class Card<P extends Comparable<P>> implements IPlayTarget
{
	private List<PriorityAndValueCardProperty<P, ?>> properties = new ArrayList<>();

	public void addProperty(PriorityAndValueCardProperty<P, ?> property)
	{
		properties.add(property);
	}

	public List<PriorityAndValueCardProperty<P, ?>> getPriorityOrderedProperties()
	{
		List<PriorityAndValueCardProperty<P, ?>> orderedProperties = new ArrayList<>(properties);
		Collections.sort(orderedProperties, new PriorityComparator<>());
		return orderedProperties;
	}

	@Override
	public String toString()
	{
		StringJoiner sj = new StringJoiner(" | ");
		properties.forEach(p -> sj.add(p.toString()));
		return sj.toString();
	}

}