//package lab1;
//
//public class Main {
//    public static void main(String[] args) {
//
//
//        Date d = new Date(3, 2, 2008);
//        d.printInfo();
//        System.out.println("______________________");
//
//
//        Director anatolyInfo = new Director("Anatoly", "Grimashevich", d);
//        anatolyInfo.printInfo();
//        System.out.println("______________________");
//
//
//        Date screeningDate = new Date(4, 12, 2025);
//        Screening screening = new Screening("Вечірній сеанс: Фнаф 2", 32500.80, screeningDate);
//        screening.printInfo();
//        System.out.println("______________________");
//
//
//        Screening emptyScreening = new Screening();
//        emptyScreening.printInfo();}
//
//
//}

package lab1;

public class Main {
    public static void main(String[] args) {

        Date d = new Date(3, 2, 2008);
        d.printInfo();
        System.out.println("______________________");

        Director anatolyInfo = new Director("Anatoly", "Grimashevich", d);
        anatolyInfo.printInfo();
        System.out.println("______________________");

        Date screeningDate = new Date(4, 12, 2025);
        Screening screening = new Screening("Вечірній сеанс: Фнаф 2", 32500.80, screeningDate);
        screening.printInfo();
        System.out.println("______________________");

        Screening emptyScreening = new Screening();
        emptyScreening.printInfo();
        System.out.println("______________________");

        Director anatoly = new Director("Анатолий", "Гримашевич", new Date(3, 2, 2008));

        Movie movie1 = new Movie("Inception", MovieGenre.ACTION, anatoly);

        Screening scr1 = new Screening("Ранковий сеанс", 28000.00, new Date(10, 12, 2025));
        Screening scr2 = new Screening("Вечірній сеанс", 42000.50, new Date(11, 12, 2025));

        movie1.addScreening(scr1);
        movie1.addScreening(scr2);

        System.out.println("Стара назва: " + movie1.getTitle());
        movie1.setTitle("Початок");
        System.out.println("Нова назва: " + movie1.getTitle());

        System.out.println("______________________");

        movie1.printInfo();

        System.out.println("______________________");

        movie1.printShortInfo();

        System.out.println("______________________");

        Movie movie2 = new Movie();
        movie2.setTitle("Interstellar");
        movie2.setGenre(MovieGenre.DRAMA);
        movie2.setDirector(anatoly);

        Screening scr3 = new Screening("Прем'єрний показ", 55000.00, new Date(14, 12, 2025));
        movie2.addScreening(scr3);

        movie2.printShortInfo();
    }
}