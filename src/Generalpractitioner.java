// Child class representing a General Practitioner (GP)
public class Generalpractitioner extends Healthprofessional {
    private String clinicRoom;

    // Default constructor
    public Generalpractitioner() {}

    // Constructor initializing base and child class variables
    public Generalpractitioner(int id, String name, String department, String clinicRoom) {
        super(id, name, department);
        this.clinicRoom = clinicRoom;
    }

    // Overriding toString to include GP-specific details
    @Override
    public String toString() {
        return "Health Professional Type: General Practitioner\n"
                + super.toString() + "\n"
                + "Clinic Room: " + clinicRoom;
    }
}

