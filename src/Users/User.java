package Users;

import Cards.Deck;
import Cards.Card;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String nickName;
    private List<Animal> animals = new ArrayList<>();
    private Hand hand;

    public User(String nickName, Deck deck) {
        this.nickName = nickName;
        hand = new Hand(deck);
    }

    public int getScore() {
        int score = 0;
        for(Animal animal : animals) {
            score += animal.getScore();
        }
        return score;
    }

    public void setPropertyFromCardTo(Animal animal, Card card) {
        animal.addProperty(card.getProperty());
    }

    public void putAnimal(Card card) {
        animals.add(new Animal());
        hand.remove(card);
    }

    public void takeCardFrom(Deck deck) {
        hand.add(deck.giveCard());
    }

}