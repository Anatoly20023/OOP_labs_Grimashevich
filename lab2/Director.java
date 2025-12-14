package lab2;

public class Director {

    private String name;
    private String surname;
    private Date birthdate;

    public Director() {
        this("", "", new Date());
    }

    public Director(String name, String surname, Date birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public String toString() {
        return "Director: " + name + " " + surname +
                "\nBirthday: " + birthdate;
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
}

