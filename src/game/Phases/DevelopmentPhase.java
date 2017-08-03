package game.Phases;

import Users.User;
import java.util.List;

public class DevelopmentPhase {
    private int countOfPassedUsers = 0;
    public void startDevelopmentPhase(List<User> users){
        while(countOfPassedUsers != users.size()) {
            for (User user : users) {
                user.move();
                if (user.isPassed()) countOfPassedUsers++;
            }
        }
    }
}
