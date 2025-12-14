package lab3;

import java.util.Comparator;

public class ScoreComparator implements Comparator<User> {

    public int compare(User u1, User u2) {

        int score1 = u1.getScore();
        int score2 = u2.getScore();

        if (score1 < score2) {
            return 1;
        } else if (score1 > score2) {
            return -1;
        } else {
            return 0;
        }
    }
}