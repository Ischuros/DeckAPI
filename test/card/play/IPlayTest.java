package card.play;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import card.play.IPlay;
import card.play.IPlayContext;
import card.play.IPlayTarget;
import card.play.PlayNotAllowedException;
import junit.framework.Assert;

public class IPlayTest
{
	private IPlayContext context;

	@Before
	public void before()
	{
		context = new IPlayContext()
		{
			private static final long serialVersionUID = 1L;

			@Override
			public List<IPlayTarget> getTargets()
			{
				return new ArrayList<>();
			}
		};
	}

	@Test(expected = PlayNotAllowedException.class)
		public void testPlayThrowException() throws PlayNotAllowedException
		{
			IPlay runnable = new IPlay()
			{
	
				@Override
				public void playInternal(List<IPlayTarget> targets)
				{
					// do nothing
				}
	
				@Override
				public boolean isAllowToRun(IPlayContext context)
				{
					return false;
				}
			};
	
			runnable.play(context);
		}

	@Test
		public void testPlaySuccess() throws PlayNotAllowedException
		{
			final String test = "test";
			final StringBuilder sb = new StringBuilder();
			IPlay runnable = new IPlay()
			{
	
				@Override
				public void playInternal(List<IPlayTarget> targets)
				{
					sb.append(test);
				}
	
				@Override
				public boolean isAllowToRun(IPlayContext context)
				{
					return true;
				}
			};
	
			runnable.play(context);
			Assert.assertEquals(test, sb.toString());
		}
}
