package Cards;

public class Property {
    private String name;
    private String description;

    public Property(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void showDescription() { System.out.println(description); }

    public void showName() {
        System.out.println(name);
    }

    public String toString() {
        showName();
        showDescription();
        return "\n";
    }
}
