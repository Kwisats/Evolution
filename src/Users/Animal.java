package Users;

import Cards.Card;
import Cards.Property;

import java.util.List;

public class Animal {
    String name;
    List<Property> propertyList;

    public int getScore() {
        //score counter
        return 0;
    }

    public void addProperty(Card card) {
        propertyList.add(card.getProperty());
    }

    public void showProperties() {
        //show them all

    }
}
