package Users;

import Cards.Deck;
import Cards.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private String nickName;
    private List<Animal> animals = new ArrayList<>();
    private Hand hand;
    private boolean passed = false;

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

    public void move() {
        Scanner in = new Scanner(System.in);
        boolean checker = true;
        while ( checker ) {
            switch (in.nextLine()) {
                case "pass": pass();
                    break;
                case "put animal"://release later with parsing
                    break;
                case "set property???"://release later with parsing
                    break;
                default:
                    System.out.println("WRONG COMMAND!!!");
            }
        }
        if( hand.size() == 0 ) pass();
    }

    public void pass() {
        passed = true;
    }

    public boolean isPassed() {
        return passed;
    }
}