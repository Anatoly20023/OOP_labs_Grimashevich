package lab2;

public class Main {

    public static void main(String[] args) {

        Director director1 =
                new Director(
                        "Ivan",
                        "Petrenko",
                        new Date(10, 3, 1975)
                );

        FilmDirector director2 =
                new FilmDirector(
                        "Christopher",
                        "Nolan",
                        new Date(30, 7, 1970),
                        34,
                        "Inception"
                );

        DocumentaryDirector director3 =
                new DocumentaryDirector(
                        "David",
                        "Attenborough",
                        new Date(8, 5, 1926),
                        120,
                        "Nature"
                );

        Movie movie1 =
                new Movie(
                        "Drama Movie",
                        MovieGenre.DRAMA,
                        director1
                );

        Movie movie2 =
                new Movie(
                        "Action Movie",
                        MovieGenre.ACTION,
                        director2
                );

        Movie movie3 =
                new Movie(
                        "Documentary Movie",
                        MovieGenre.COMEDY,
                        director3
                );

        System.out.println("===== MOVIE 1 =====");
        System.out.println(movie1);

        System.out.println("\n===== MOVIE 2 =====");
        System.out.println(movie2);

        System.out.println("\n===== MOVIE 3 =====");
        System.out.println(movie3);
    }
}
