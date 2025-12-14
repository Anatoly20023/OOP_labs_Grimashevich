package lab3;

public class Main {

    static class User {
        private int id;
        private String username;
        private int score;

        public User(int id, String username, int score) {
            this.id = id;
            this.username = username;
            this.score = score;
        }

        public int getId() { return id; }
        public String getUsername() { return username; }
        public int getScore() { return score; }

        public String toString() {
            return "ID: " + id + ", " + username + " : " + score;
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            User other = (User) obj;
            return id == other.id;
        }

        public int hashCode() {
            return Integer.hashCode(id);
        }
    }

    static class ScoreComparator implements java.util.Comparator<User> {
        public int compare(User u1, User u2) {
            int score1 = u1.getScore();
            int score2 = u2.getScore();
            if (score1 < score2) return 1;
            else if (score1 > score2) return -1;
            else return 0;
        }
    }

    public static void main(String[] args) {
        java.util.ArrayList<User> users = new java.util.ArrayList<User>();
        users.add(new User(1, "Gleb", 120));
        users.add(new User(2, "Vova", 90));
        users.add(new User(3, "Charlie", 150));
        users.add(new User(1, "Alex", 200));
        users.add(new User(2, "Alina", 110));

        System.out.println("До сортування:");
        for (User user : users) System.out.println(user);

        java.util.Collections.sort(users, new ScoreComparator());

        System.out.println("\nПісля сортування за балами (спадання):");
        for (User user : users) System.out.println(user);

        java.util.HashSet<User> userSet = new java.util.HashSet<User>();
        for (User user : users) userSet.add(user);

        System.out.println("\nУнікальні користувачі (дублікати):");
        for (User user : userSet) System.out.println(user);
    }
}
