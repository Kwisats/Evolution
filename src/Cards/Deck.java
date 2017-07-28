package Cards;

import java.util.HashMap;

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
        //создать свойство, затем создать карту и удалить карту из пула
        //Property property = new Property();
        //Card card = new Card();
        return null;
    }

    public String toString () {
        System.out.println(availableProperties);
        System.out.println(propertiesDescriptions);
        return "";
    }
}
