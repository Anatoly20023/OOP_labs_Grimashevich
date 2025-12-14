package lab1;

public class Screening {
    private String screeningName;
    private double profit;
    private Date screeningDate;


    public Screening() {
        this.screeningName = "";
        this.profit = 0.0;
        this.screeningDate = new Date();
    }


    public Screening(String screeningName, double profit, Date screeningDate) {
        this.screeningName = screeningName;
        this.profit = profit;
        this.screeningDate = screeningDate;
    }

    public void printInfo() {
        System.out.println("Screening: " + screeningName);
        System.out.println("Profit: " + profit);
        System.out.print("Date: ");
        screeningDate.printInfo();
    }


    public String getScreeningName() {
        return screeningName;
    }

    public void setScreeningName(String screeningName) {
        this.screeningName = screeningName;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public Date getScreeningDate() {
        return screeningDate;
    }

    public void setScreeningDate(Date screeningDate) {
        this.screeningDate = screeningDate;
    }
}