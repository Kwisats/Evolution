package game;

import Cards.Deck;
import Cards.Property;
import Users.Animal;

import java.util.HashMap;

public class Main {
    public static void main (String[] args) {
        //test Deck
        HashMap<String, Integer> availableProperties = new HashMap<>();
        availableProperties.put("name1", 2);
        availableProperties.put("name2", 2);
        HashMap<String, String> propertiesDescriptions = new HashMap<>();
        propertiesDescriptions.put("name1", "description1");
        propertiesDescriptions.put("name2", "description2");
        Deck deck = new Deck(availableProperties, propertiesDescriptions);
        System.out.println(deck);
        System.out.println(deck.giveCard());
        System.out.println(deck);

        //test Property
        Property property = new Property("barkable", "can bark");
        System.out.println(property);

        //test Animal
        Animal dog = new Animal();
        dog.addProperty(property);
        System.out.println(dog.getScore());
    }
}
