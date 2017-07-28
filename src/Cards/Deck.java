package Cards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Deck {
    private HashMap<String, Integer> availableProperties;
    private HashMap<String, String> propertiesDescriptions;
    private static int countOfDecks = 0;

    public Deck (HashMap<String, Integer> availableProperties, HashMap<String, String> propertiesDescriptions) {
        //не создавай если дека уже существует

        countOfDecks = 1;
        this.availableProperties = availableProperties;
        this.propertiesDescriptions = propertiesDescriptions;
    }

    public Card giveCard() {
        List<String> keys = new ArrayList<>(availableProperties.keySet());
        String chosenKey = keys.get((new Random()).nextInt(availableProperties.size()));
        Property property = new Property(chosenKey, propertiesDescriptions.get(chosenKey));
        if (availableProperties.put(chosenKey, availableProperties.get(chosenKey) - 1) == 1) {
            availableProperties.remove(chosenKey);
        }
        return new Card(property);
    }

    public String toString () {
        return availableProperties + "\n" + propertiesDescriptions + "\n";
    }
}
