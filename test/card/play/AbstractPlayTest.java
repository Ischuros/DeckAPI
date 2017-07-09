package card.play;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import card.Card;
import card.event.IAfterPlayEvent;
import card.event.IBeforePlayEvent;
import junit.framework.Assert;

public class AbstractPlayTest
{
	private static final String TEST = "test";
	private IPlayContext context;
	private AbstractPlay<IntBeforeEvent, IntAfterEvent> play;
	private StringBuilder sb;
	private boolean allowToRun = true;

	@Before
	public void before()
	{
		this.sb = new StringBuilder();
		this.context = new IPlayContext()
		{

			@Override
			public List<IPlayTarget> getTargets()
			{
				return new ArrayList<>();
			}
		};
		this.play = new AbstractPlay<IntBeforeEvent, IntAfterEvent>()
		{

			@Override
			protected void runInternal(IPlayContext context, Card cardPlayed)
			{
				sb.append(TEST);
			}

			@Override
			protected boolean isAllowToRun(IPlayContext context)
			{
				return allowToRun;
			}
		};
	}

	@Test(expected = PlayNotAllowedException.class)
	public void testNotAllowed() throws PlayNotAllowedException
	{
		this.allowToRun = false;
		play.run(context, new Card());
	}

	@Test
	public void testRunInternal() throws PlayNotAllowedException
	{
		play.run(context, new Card());
		Assert.assertEquals(TEST, sb.toString());
	}

	@Test
	public void testBeforeEvent() throws PlayNotAllowedException
	{
		final Integer _1 = Integer.valueOf(1);
		play.addBeforePlayEvent(new IntBeforeEvent(_1.intValue()));
		play.run(context, new Card());

		Assert.assertEquals(new StringBuilder().append(_1).append(TEST).toString(), sb.toString());
	}

	@Test
	public void testAfterEvent() throws PlayNotAllowedException
	{
		final Integer _1 = Integer.valueOf(1);

		play.addAfterPlayEvent(new IntAfterEvent(_1.intValue()));
		play.run(context, new Card());

		Assert.assertEquals(new StringBuilder().append(TEST).append(_1).toString(), sb.toString());
	}

	@Test
	public void testOrderBeforeEvents() throws PlayNotAllowedException
	{
		Integer _1 = Integer.valueOf(1);
		Integer _10 = Integer.valueOf(10);
		Integer _20 = Integer.valueOf(20);
		Integer _30 = Integer.valueOf(30);
		play.addBeforePlayEvent(new IntBeforeEvent(_1.intValue()));
		play.addBeforePlayEvent(new IntBeforeEvent(_10.intValue()));
		play.addBeforePlayEvent(new IntBeforeEvent(_20.intValue()));
		play.addBeforePlayEvent(new IntBeforeEvent(_30.intValue()));

		play.setBeforePlayComparator(Comparator.comparingInt(IntBeforeEvent::getValue).reversed());

		play.run(context, new Card());
		Assert.assertEquals(new StringBuilder().append(_30).append(_20).append(_10).append(_1)
				.append(TEST).toString(), sb.toString());
	}

	@Test
	public void testOrderAfterEvents() throws PlayNotAllowedException
	{
		Integer _1 = Integer.valueOf(1);
		Integer _10 = Integer.valueOf(10);
		Integer _20 = Integer.valueOf(20);
		Integer _30 = Integer.valueOf(30);
		play.addAfterPlayEvent(new IntAfterEvent(_1.intValue()));
		play.addAfterPlayEvent(new IntAfterEvent(_10.intValue()));
		play.addAfterPlayEvent(new IntAfterEvent(_20.intValue()));
		play.addAfterPlayEvent(new IntAfterEvent(_30.intValue()));

		play.setAfterPlayComparator(Comparator.comparingInt(IntAfterEvent::getValue).reversed());

		play.run(context, new Card());
		Assert.assertEquals(
				new StringBuilder(TEST).append(_30).append(_20).append(_10).append(_1).toString(),
				sb.toString());
	}

	private final class IntBeforeEvent implements IBeforePlayEvent
	{
		private int value;

		public IntBeforeEvent(int value)
		{
			this.value = value;
		}

		@Override
		public void run(IPlayContext context, Card cardPlayed)
		{
			Assert.assertEquals(AbstractPlayTest.this.context, context);
			sb.append("" + value);
		}

		public int getValue()
		{
			return value;
		}
	}

	private final class IntAfterEvent implements IAfterPlayEvent
	{
		private int value;

		public IntAfterEvent(int value)
		{
			this.value = value;
		}

		@Override
		public void run(IPlayContext context, Card cardPlayed)
		{
			Assert.assertEquals(AbstractPlayTest.this.context, context);
			sb.append("" + value);
		}

		public int getValue()
		{
			return value;
		}
	}
}
