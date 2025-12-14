package lab2;

public class Date {

    int day;
    int month;
    int year;

    public Date() {
        this(0, 0, 0);
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return day + "." + month + "." + year;
    }
}