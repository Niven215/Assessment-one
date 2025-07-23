import java.util.ArrayList;

// Main class containing the program entry point and appointment management logic
public class AssignmentOne {
    // A list to store all appointment objects
    static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects

        // Creating General Practitioners
        Generalpractitioner gp1 = new Generalpractitioner(101, "Dr. Smith", "General Medicine", "Room A");
        Generalpractitioner gp2 = new Generalpractitioner(102, "Dr. Adams", "General Medicine", "Room B");
        Generalpractitioner gp3 = new Generalpractitioner(103, "Dr. Taylor", "General Medicine", "Room C");

        // Creating Neurosurgeons
        Neurosurgeon ns1 = new Neurosurgeon(201, "Dr. Lee", "Neurosurgery", "Theatre 1");
        Neurosurgeon ns2 = new Neurosurgeon(202, "Dr. Brown", "Neurosurgery", "Theatre 2");

        // Printing health professionals
        System.out.println(gp1);
        System.out.println("------------------------------");
        System.out.println(gp2);
        System.out.println("------------------------------");
        System.out.println(gp3);
        System.out.println("------------------------------");
        System.out.println(ns1);
        System.out.println("------------------------------");
        System.out.println(ns2);
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments

        // Creating appointments for GPs and Neurosurgeons
        createAppointment("Alice", "0400000001", "08:00", gp1);
        createAppointment("Bob", "0400000002", "09:00", gp2);
        createAppointment("Charlie", "0400000003", "10:30", ns1);
        createAppointment("Diana", "0400000004", "11:15", ns2);

        // Displaying all appointments
        System.out.println("---- All Appointments ----");
        printExistingAppointments();

        // Cancelling one appointment (Charlie's)
        cancelBooking("0400000003");

        // Displaying remaining appointments
        System.out.println("---- After Cancellation ----");
        printExistingAppointments();

        // End of program
        System.out.println("------------------------------");
    }

    // Creates an appointment and adds it to the list
    public static void createAppointment(String name, String phone, String time, Healthprofessional doctor) {
        if (name == null || phone == null || time == null || doctor == null) {
            System.out.println("Invalid appointment details.");
            return;
        }
        Appointment appointment = new Appointment(name, phone, time, doctor);
        appointments.add(appointment);
        appointment.confirmBooking(); // Interface method
    }

    // Prints all existing appointments
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment a : appointments) {
                System.out.println(a); // Uses toString
            }
        }
    }

    // Cancels an appointment using patient phone number
    public static void cancelBooking(String phone) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            Appointment appt = appointments.get(i);
            if (appt.getPatientPhone().equals(phone)) {
                appt.cancelBooking(); // Interface method
                appointments.remove(i); // Remove from list
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found with phone: " + phone);
        }
    }
}
