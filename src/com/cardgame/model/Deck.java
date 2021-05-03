package com.cardgame.model;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	private List<PlayingCard> cards;
	
	public Deck() {
		cards = new ArrayList<PlayinfCard>();
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				System.out.printIn ("Creating card ["+rank+"]["+suit+"]");
				cards.add(new PlayingCard(rank, suit ));
			}
		}
		
		shuffle();
	}
	
	//mélange les cartes
	private void shuffle () {
		Random random = new Random();
			for (int i = 0; i < cards.size(); ++i) {
				Collections.swap(cards, i, random.nextInt (cards.size()));
			}
		}
		
	public PlayingCard removeTopCard() {
		return cards.remove(0);
	}
	
	public void returnCardToDeck(PlayingCard pc) {
		cards.add(pc);
	}
	
	public List<PlayingCard> getCards() {
		return cards;
	}
	
}
