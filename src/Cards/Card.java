package Cards;

public class Card {
    private Property property;

    public Card(Property property) {
        this.property = property;
    }

    public Property getProperty() {
        return property;
    }

    public void showDescription() {
        property.showDescription();
    }

    public String toString() {
        return property.toString();
    }
}
