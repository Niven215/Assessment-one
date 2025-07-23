// Base class representing a generic health professional
public class Healthprofessional {
    protected int id;
    protected String name;
    protected String department;

    // Default constructor
    public Healthprofessional() {}

    // Constructor to initialize all variables
    public Healthprofessional(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // toString method to display health professional details
    @Override
    public String toString() {
        return "ID: " + id + "\n"
                + "Name: " + name + "\n"
                + "Department: " + department;
    }
}
