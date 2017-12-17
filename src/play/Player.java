package play;

import deck.Deck;

public abstract class Player {

    private String name;
    private Deck deck;

    public Player(String name, Deck deck) {
        this.name = name;
        this.deck = deck;
    }

	public Deck getDeck() {
		return deck;
	}

	public String getName() {
        return name;
    }
}
