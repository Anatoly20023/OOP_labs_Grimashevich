package lab2;

public class Screening {

    private String screeningName;
    private double profit;
    private Date screeningDate;

    public Screening() {
        this("", 0.0, new Date());
    }

    public Screening(String screeningName, double profit, Date screeningDate) {
        this.screeningName = screeningName;
        this.profit = profit;
        this.screeningDate = screeningDate;
    }

    public String toString() {
        return "Screening: " + screeningName +
                "\nProfit: " + profit +
                "\nDate: " + screeningDate;
    }

    public double getProfit() {
        return profit;
    }
}