package example.snap;

import deck.Deck;
import play.Player;

public class SnapPlayer extends Player {

	private Deck deck;

	public SnapPlayer(String name, Deck deck) {
		super(name);
		this.deck = deck;
	}

	public Deck getDeck() {
		return deck;
	}
}
