package lab1;

public class Movie {
    private String title;
    private MovieGenre genre;
    private Director director;
    private java.util.List<Screening> screenings;

    public Movie() {
        this.title = "";
        this.genre = MovieGenre.COMEDY;
        this.director = new Director();
        this.screenings = new java.util.ArrayList<Screening>();
    }

    public Movie(String title, MovieGenre genre, Director director) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.screenings = new java.util.ArrayList<Screening>();
    }

    public void addScreening(Screening screening) {
        screenings.add(screening);
    }

    public void printInfo() {
        System.out.println("Movie title: %s".formatted(title));
        System.out.println("Genre: %s".formatted(genre));
        System.out.println("Director:");
        director.printInfo();
        System.out.println("Number of screenings: %d".formatted(screenings.size()));
        if (!screenings.isEmpty()) {
            for (Screening s : screenings) {
                System.out.print("    ");
                s.printInfo();
            }
        }
    }

    public void printShortInfo() {
        System.out.println("Movie: %s".formatted(title));
        System.out.println("Director: %s %s".formatted(director.getName(), director.getSurname()));
        System.out.println("Number of screenings: %d".formatted(screenings.size()));
        if (screenings.isEmpty()) {
            System.out.println("Average profit: no screenings");
        } else {
            double total = 0.0;
            for (Screening s : screenings) {
                total += s.getProfit();
            }
            double average = total / screenings.size();
            System.out.println("Average profit per screening: %.2f".formatted(average));
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public java.util.List<Screening> getScreenings() {
        return screenings;
    }
}