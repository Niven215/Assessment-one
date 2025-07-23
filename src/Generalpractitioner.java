public class Generalpractitioner extends Healthprofessional {
    private String clinicRoom;

    public Generalpractitioner() {}

    public Generalpractitioner(int id, String name, String department, String clinicRoom) {
        super(id, name, department);
        this.clinicRoom = clinicRoom;
    }

    @Override
    public String toString() {
        return "Health Professional Type: General Practitioner\n"
                + super.toString() + "\n"
                + "Clinic Room: " + clinicRoom;
    }
}
