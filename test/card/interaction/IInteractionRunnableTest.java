package card.interaction;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.Assert;

public class IInteractionRunnableTest
{
	@Test(expected = PropertyRunnableException.class)
	public void testRunThrowException() throws PropertyRunnableException
	{
		IInteractionRunnable runnable = new IInteractionRunnable()
		{

			@Override
			public void runInternal(IInteractionTarget... targets)
			{
				// do nothing
			}

			@Override
			public boolean isAllowToRun(IInteractionContext... circumstances)
			{
				return false;
			}
		};

		runnable.run(new ArrayList<>(), new ArrayList<>());
	}

	@Test
	public void testRunSuccess() throws PropertyRunnableException
	{
		final String test = "test";
		final StringBuilder sb = new StringBuilder();
		IInteractionRunnable runnable = new IInteractionRunnable()
		{

			@Override
			public void runInternal(IInteractionTarget... targets)
			{
				sb.append(test);
			}

			@Override
			public boolean isAllowToRun(IInteractionContext... circumstances)
			{
				return true;
			}
		};

		runnable.run(new ArrayList<>(), new ArrayList<>());
		Assert.assertEquals(test, sb.toString());
	}
}
