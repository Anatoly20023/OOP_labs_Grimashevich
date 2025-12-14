package lab2;

public class DocumentaryDirector extends Director {

    private int numberOfDocumentaries;
    private String specializationTopic;

    public DocumentaryDirector() {
        super();
        this.numberOfDocumentaries = 0;
        this.specializationTopic = "";
    }

    public DocumentaryDirector(String name, String surname, Date birthdate,
                               int numberOfDocumentaries, String specializationTopic) {
        super(name, surname, birthdate);
        this.numberOfDocumentaries = numberOfDocumentaries;
        this.specializationTopic = specializationTopic;
    }

    public String toString() {
        return super.toString() +
                "\nNumber of documentaries: " + numberOfDocumentaries +
                "\nSpecialization topic: " + specializationTopic;
    }
}