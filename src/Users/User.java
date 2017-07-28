package Users;

import Cards.Deck;

public class User {
    private String nickName;
    //may be List
    private Animal[] animals = new Animal[10];
    private Hand hand;
    private Deck deck;

    public User(String nickName, Deck deck)
    {
        this.nickName = nickName;
        this.deck = deck;
        hand = new Hand(deck);
    }

    public int getScore() {
        int score = 0;
        // may be cycle for the List
        for(int i = 0; i < animals.length; i++) {
            score += animals[i].getScore();
        }
        return score;
    }

    public void setProperty(Animal animal) {

    }

    public void putAnimal() {
        Animal animal = new Animal();
        //put animal on table
    }
}