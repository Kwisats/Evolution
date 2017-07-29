package Users;

import Cards.Property;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private List<Property> propertyList = new ArrayList<>();

    public int getScore() {
        //обрабатывать свойства по-отдельности
        return 2 + propertyList.size();
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
