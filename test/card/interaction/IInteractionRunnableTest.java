package card.interaction;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class IInteractionRunnableTest
{
	private IInteractionContext context;

	@Before
	public void before()
	{
		context = new IInteractionContext()
		{
			private static final long serialVersionUID = 1L;

			@Override
			public List<IInteractionTarget> getTargets()
			{
				return new ArrayList<>();
			}
		};
	}

	@Test(expected = PropertyRunnableException.class)
	public void testRunThrowException() throws PropertyRunnableException
	{
		IInteractionRunnable runnable = new IInteractionRunnable()
		{

			@Override
			public void runInternal(List<IInteractionTarget> targets)
			{
				// do nothing
			}

			@Override
			public boolean isAllowToRun(IInteractionContext context)
			{
				return false;
			}
		};

		runnable.run(context);
	}

	@Test
	public void testRunSuccess() throws PropertyRunnableException
	{
		final String test = "test";
		final StringBuilder sb = new StringBuilder();
		IInteractionRunnable runnable = new IInteractionRunnable()
		{

			@Override
			public void runInternal(List<IInteractionTarget> targets)
			{
				sb.append(test);
			}

			@Override
			public boolean isAllowToRun(IInteractionContext context)
			{
				return true;
			}
		};

		runnable.run(context);
		Assert.assertEquals(test, sb.toString());
	}
}
