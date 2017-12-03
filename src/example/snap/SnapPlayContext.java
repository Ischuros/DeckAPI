package example.snap;

import card.Card;
import card.play.IPlayContext;
import card.play.IPlayTarget;
import deck.Deck;

import java.util.ArrayList;
import java.util.List;

public class SnapPlayContext implements IPlayContext {

    private Deck onBoardCards = new Deck();

    private List<Deck> playersDecks;
    private Deck deckToBePlayed;

    public SnapPlayContext(List<Deck> playersDecks) {
        this.playersDecks = playersDecks;
        deckToBePlayed = playersDecks.iterator().next();
    }

    @Override
    public List<? extends IPlayTarget> getTargets() {
        List<IPlayTarget> targets = new ArrayList<>();
        targets.add(onBoardCards);
        targets.addAll(playersDecks);

        return targets;
    }

    public Deck getDeckToBePlayed() {
        return deckToBePlayed;
    }

    public void setNextDeckToBePlayed() {
        int index = playersDecks.indexOf(deckToBePlayed);
        final Deck nextDeckToBePlayed = index + 1 >= playersDecks.size() ? playersDecks.get(0) : playersDecks.get(index + 1);
        this.deckToBePlayed = nextDeckToBePlayed;
    }

    public Deck getOnBoardCards() {
        return onBoardCards;
    }

    public boolean isLastTurn() {
        return playersDecks.indexOf(deckToBePlayed) == playersDecks.size()-1;
    }

    public int getNbPlayers() {
        return playersDecks.size();
    }
}
