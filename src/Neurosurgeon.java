// Child class representing a Neurosurgeon
public class Neurosurgeon extends Healthprofessional {
    private String operatingTheatre;

    // Default constructor
    public Neurosurgeon() {}

    // Constructor initializing base and child class variables
    public Neurosurgeon(int id, String name, String department, String operatingTheatre) {
        super(id, name, department);
        this.operatingTheatre = operatingTheatre;
    }

    // Overriding toString to include Neurosurgeon-specific details
    @Override
    public String toString() {
        return "Health Professional Type: Neurosurgeon\n"
                + super.toString() + "\n"
                + "Operating Theatre: " + operatingTheatre;
    }
}
