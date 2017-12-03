package example.snap;

import card.event.IPlayEvent;
import deck.Deck;

public class SnapAfterPlayEvent implements IPlayEvent<SnapPlayContext> {

    @Override
    public void run(SnapPlayContext context) {
        if (!context.isLastTurn()) {
            return;
        }

        if (SnapDeckUtil.isSnap(context)) {
            return;
        }



    }




}
