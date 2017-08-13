package card.property;

import java.util.List;
import java.util.stream.Collectors;

public class PropertyChecker
{
	private PropertyChecker()
	{

	}

	public static <P extends Comparable<P>> void checkProperties(
			List<ValueCardProperty<P, ?>> properties) throws IllegalPriorityException
	{
		if (properties.isEmpty())
		{
			return;
		}

		boolean illegalPriority = properties.stream()
				.collect(Collectors.groupingBy(ValueCardProperty::getPriority)).values().stream()
				.anyMatch(c -> c.stream().map(ValueCardProperty::getValue)
						.collect(Collectors.groupingBy(o -> o.getClass().getName())).size() > 1);

		if (illegalPriority)
		{
			throw new IllegalPriorityException();
		}
	}
}
