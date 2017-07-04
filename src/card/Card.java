package card;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import card.play.AbstractPlay;
import card.play.IPlayContext;
import card.play.IPlayTarget;
import card.play.PlayNotAllowedException;
import card.property.CardProperty;

public class Card implements IPlayTarget
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

	public void play(AbstractPlay play, IPlayContext context) throws PlayNotAllowedException
	{
		play.run(context, properties);
	}

	@Override
	public String toString()
	{
		StringJoiner sj = new StringJoiner(" | ");
		properties.forEach(p -> sj.add(p.toString()));
		return sj.toString();
	}
}