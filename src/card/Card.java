package card;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import card.play.IPlayTarget;
import card.property.ValueCardProperty;

public class Card implements IPlayTarget
{
	private final List<ValueCardProperty<? extends Comparable<?>>> properties = new ArrayList<>();

	public <T extends ValueCardProperty<? extends Comparable<?>>> void addProperty(T property)
	{
		properties.add(property);
	}

	@Override
	public String toString()
	{
		StringJoiner sj = new StringJoiner(" | ");
		properties.forEach(p -> sj.add(p.toString()));
		return sj.toString();
	}

}