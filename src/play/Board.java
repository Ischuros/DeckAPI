package play;

import card.Card;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<CardPlayerLink> cards = new ArrayList<>();

    public void playCard(Card card, Player player) {
        cards.add(new CardPlayerLink(card, player));
    }

    private class CardPlayerLink {

        public CardPlayerLink(Card card, Player player) {
            this.card = card;
            this.player = player;
        }

        private Card card;
        private Player player;
    }
}
