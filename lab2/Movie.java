package lab2;

public class Movie {

    private String title;
    private MovieGenre genre;
    private Director director;
    private java.util.List<Screening> screenings;

    public Movie() {
        this("", MovieGenre.COMEDY, new Director());
    }

    public Movie(String title, MovieGenre genre, Director director) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.screenings = new java.util.ArrayList<>();
    }

    public void addScreening(Screening screening) {
        screenings.add(screening);
    }

    public String toString() {
        String result =
                "Movie title: " + title +
                        "\nGenre: " + genre +
                        "\n" + director +
                        "\nNumber of screenings: " + screenings.size();

        for (Screening s : screenings) {
            result += "\n---\n" + s;
        }
        return result;
    }
}