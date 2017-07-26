package User;

public class User {
    private String nickName;
    //may be List
    private Animal[] animals = new Animal[10];


    public void User(String nickName) {
        this.nickName = nickName;
    }

    public int getScore() {
        int score = 0;
        // may be cycle for the List
        for(int i = 0; i < animals.length; i++) {
            score += animals[i].getScore();
        }
        return score;
    }

    public void setProperty(Animal animal) {

    }

    public void putAnimal() {
        Animal animal = new Animal();
        //put animal on table
    }
}