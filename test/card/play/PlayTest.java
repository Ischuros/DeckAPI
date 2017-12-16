package card.play;

import card.event.PlayEvent;
import game.Game;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import play.Play;
import play.PlayNotAllowedException;

import java.util.Comparator;

public class PlayTest
{
	private static final String TEST = "test";
	private IntPlayGame context;
	private Play<IntBeforeEvent, IntAfterEvent, IntPlayGame> play;
    private StringBuilder sb;
	private boolean allowToRun = true;

	@Before
	public void before()
	{
		this.sb = new StringBuilder();
        this.context = new IntPlayGame();
		this.play = new Play<IntBeforeEvent, IntAfterEvent, IntPlayGame>()
		{

			@Override
			protected void runInternal(IntPlayGame context)
			{
				sb.append(TEST);
			}

			@Override
			protected boolean isAllowToRun(IntPlayGame context)
			{
				return allowToRun;
			}
		};
	}

	@Test(expected = PlayNotAllowedException.class)
	public void testNotAllowed() throws PlayNotAllowedException
	{
		this.allowToRun = false;
		play.run(context);
	}

	@Test
	public void testRunInternal() throws PlayNotAllowedException
	{
		play.run(context);
		Assert.assertEquals(TEST, sb.toString());
	}

	@Test
	public void testBeforeEvent() throws PlayNotAllowedException
	{
		final Integer _1 = 1;
		play.addBeforePlayEvent(new IntBeforeEvent(_1));
		play.run(context);

		Assert.assertEquals(String.valueOf(_1) + TEST, sb.toString());
	}

	@Test
	public void testAfterEvent() throws PlayNotAllowedException
	{
		final Integer _1 = 1;

		play.addAfterPlayEvent(new IntAfterEvent(_1));
		play.run(context);

		Assert.assertEquals(TEST + _1, sb.toString());
	}

	@Test
	public void testOrderBeforeEvents() throws PlayNotAllowedException
	{
		Integer _1 = 1;
		Integer _10 = 10;
		Integer _20 = 20;
		Integer _30 = 30;
		play.addBeforePlayEvent(new IntBeforeEvent(_1));
		play.addBeforePlayEvent(new IntBeforeEvent(_10));
		play.addBeforePlayEvent(new IntBeforeEvent(_20));
		play.addBeforePlayEvent(new IntBeforeEvent(_30));

		play.setBeforePlayComparator(Comparator.comparingInt(IntBeforeEvent::getValue).reversed());

		play.run(context);
		Assert.assertEquals(String.valueOf(_30) + _20 + _10 + _1 +
				TEST, sb.toString());
	}

	@Test
	public void testOrderAfterEvents() throws PlayNotAllowedException
	{
		Integer _1 = 1;
		Integer _10 = 10;
		Integer _20 = 20;
		Integer _30 = 30;
		play.addAfterPlayEvent(new IntAfterEvent(_1));
		play.addAfterPlayEvent(new IntAfterEvent(_10));
		play.addAfterPlayEvent(new IntAfterEvent(_20));
		play.addAfterPlayEvent(new IntAfterEvent(_30));

		play.setAfterPlayComparator(Comparator.comparingInt(IntAfterEvent::getValue).reversed());

		play.run(context);
		Assert.assertEquals(
				TEST + _30 + _20 + _10 + _1,
				sb.toString());
	}

	private final class IntBeforeEvent implements PlayEvent<IntPlayGame>
	{
		private final int value;

		IntBeforeEvent(int value)
		{
			this.value = value;
		}

		@Override
		public void run(IntPlayGame game)
		{
			Assert.assertEquals(PlayTest.this.context, game);
			sb.append("").append(value);
		}

		int getValue()
		{
			return value;
		}
	}

	private final class IntAfterEvent implements PlayEvent<IntPlayGame>
	{
		private final int value;

		IntAfterEvent(int value)
		{
			this.value = value;
		}

		@Override
		public void run(IntPlayGame game)
		{
			Assert.assertEquals(PlayTest.this.context, game);
			sb.append("").append(value);
		}

		int getValue()
		{
			return value;
		}
	}

	private final class IntPlayGame extends Game {

	}
}