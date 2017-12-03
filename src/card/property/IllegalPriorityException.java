package card.property;

class IllegalPriorityException extends Exception
{
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage()
	{
		return "Incompatible property comparison. Properties "
				+ " have same priority but have different value types.";
	}

}
