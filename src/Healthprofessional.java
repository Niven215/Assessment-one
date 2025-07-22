public abstract class Healthprofessional {
    // null con
    protected int id;
    protected String name;
    protected String department; // Additional basic info

    public Healthprofessional() {}

    public Healthprofessional(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
// need to convert this method into toString
@Override
public String toString() {
    return "ID: " + id + "\n"
            + "Name: " + name + "\n"
            + "Department: " + department;
}

}


