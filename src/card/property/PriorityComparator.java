package card.property;

import java.util.Comparator;

public class PriorityComparator<P extends Comparable<P>>
		implements Comparator<PriorityAndValueCardProperty<P, ?>>
{

	@Override
	public int compare(PriorityAndValueCardProperty<P, ?> arg0,
			PriorityAndValueCardProperty<P, ?> arg1)
	{
		return arg0.getPriority().compareTo(arg1.getPriority());
	}

}
