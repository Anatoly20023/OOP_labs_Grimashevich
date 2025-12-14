package lab1;

public class Director {
    private String name;
    private String surname;
    private Date birthdate;

    public Director() {
        this.name = "";
        this.surname = "";
        this.birthdate = new Date();
    }

    public Director(String name, String surname, Date birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public void printInfo() {
        System.out.println("Director: Name: %s, Surname: %s".formatted(name, surname));
        System.out.println("Birthday");
        birthdate.printInfo();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}