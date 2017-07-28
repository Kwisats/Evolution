package game;

import Cards.Deck;
import Cards.Property;

import java.util.HashMap;

public class Main {
    public static void main (String[] args) {
        HashMap<String, Integer> availableProperties = new HashMap<String, Integer>();
        availableProperties.put("name1", 2);
        availableProperties.put("name2", 2);
        HashMap<String, String> propertiesDescriptions = new HashMap<String, String>();
        propertiesDescriptions.put("name1", "description1");
        propertiesDescriptions.put("name2", "description2");
        Deck deck = new Deck(availableProperties, propertiesDescriptions);
        System.out.println(deck);
        System.out.println(deck.giveCard());
        System.out.println(deck);

        Property property = new Property("someName", "someDescription");
        System.out.println(property);

    }
}
