package Users;

import Cards.Property;
import java.util.List;

public class Animal {
    private List<Property> propertyList;

    public int getScore() {
        //score counter
        return 0;
    }

    public void addProperty(Property property) {
        propertyList.add(property);
    }

    public void showProperties() {
        for (Property property : propertyList) {
            System.out.print(property);
        }
    }
}
