package example.snap;

import card.Card;
import deck.Deck;

import java.util.List;

public class SnapDeckUtil {

    public static boolean isSnap(SnapPlayContext context) {
        Deck toCheck = SnapDeckUtil.getLastCards(context.getOnBoardCards(), context.getNbPlayers());

        //TODO
        return false;
    }

    private static Deck getLastCards(Deck deck, int nbLastCards) {
        Deck result = new Deck();
        List<Card> lastCards = deck.subList(deck.size()-1-nbLastCards, deck.size());
        result.addAll(lastCards);

        return result;
    }
}