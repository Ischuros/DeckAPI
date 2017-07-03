package card.property;

import java.io.Serializable;

/**
 * One of the card property. Such as card name, life, attack, special capacity,
 * ...
 * 
 * @author Lucas PRANEUF
 *
 */
public interface ICardProperty extends Serializable
{

	String getName();

	String getDescription();
}
