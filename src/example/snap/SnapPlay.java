package example.snap;

import card.Card;
import card.play.AbstractPlay;
import deck.Deck;

public class SnapPlay extends AbstractPlay<SnapBeforePlayEvent, SnapAfterPlayEvent, SnapPlayContext> {

    @Override
    protected boolean isAllowToRun(SnapPlayContext context) {
        return true;
    }

    @Override
    protected void runInternal(SnapPlayContext context) {
        final Deck deckToBePlayed = context.getDeckToBePlayed();
        Card playedCard = deckToBePlayed.getFirst();
        deckToBePlayed.remove(playedCard);
        context.getOnBoardCards().add(playedCard);
    }
}
