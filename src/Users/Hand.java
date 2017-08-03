package Users;

import Cards.Card;
import Cards.Deck;

import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand(Deck deck) {
        // think about "6"
        for(int i = 0; i < 6; i++) {
            cards.add(deck.giveCard());
        }
    }

    public void showHand() {
        for ( Card card: cards ) {
            card.showDescription();
        }
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void remove(Card card) {
        cards.remove(card);
    }

    public int size() {
        return cards.size();
    }
}
