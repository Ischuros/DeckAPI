package card.property;

public class IllegalPriorityException extends Exception
{
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage()
	{
		StringBuilder sb = new StringBuilder("Incompatible property comparison. Properties "
				+ " have same priority but have different value types.");
		return sb.toString();
	}

}
