package lab2;

public class FilmDirector extends Director {

    private int numberOfAwards;
    private String famousMovie;

    public FilmDirector() {
        super();
        this.numberOfAwards = 0;
        this.famousMovie = "";
    }

    public FilmDirector(String name, String surname, Date birthdate,
                        int numberOfAwards, String famousMovie) {
        super(name, surname, birthdate);
        this.numberOfAwards = numberOfAwards;
        this.famousMovie = famousMovie;
    }

    public String toString() {
        return super.toString() +
                "\nNumber of awards: " + numberOfAwards +
                "\nFamous movie: " + famousMovie;
    }
}
