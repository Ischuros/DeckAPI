package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

import card.play.IPlayTarget;
import card.property.IllegalPriorityException;
import card.property.PropertyChecker;
import card.property.ValueCardProperty;

public class Card<P extends Comparable<P>> implements IPlayTarget
{
	private List<ValueCardProperty<P, ?>> properties = new ArrayList<>();

	public void addProperty(ValueCardProperty<P, ?> property)
	{
		properties.add(property);
	}

	public List<ValueCardProperty<P, ?>> getPriorityOrderedProperties()
			throws IllegalPriorityException
	{
		PropertyChecker.checkProperties(properties);
		List<ValueCardProperty<P, ?>> orderedProperties = new ArrayList<>(properties);
		Collections.sort(orderedProperties);
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