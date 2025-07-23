// Class representing an appointment, implements the Bookings interface
public class Appointment implements Bookings {
    private String patientName;
    private String patientPhone;
    private String timeSlot;
    private Healthprofessional doctor; // Can be GP or Neurosurgeon

    // Default constructor
    public Appointment() {}

    // Constructor initializing all variables
    public Appointment(String patientName, String patientPhone, String timeSlot, Healthprofessional doctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // Getter to access patient phone (used in cancellation)
    public String getPatientPhone() {
        return patientPhone;
    }

    // String representation of appointment details
    @Override
    public String toString() {
        return "Patient Name: " + patientName + "\n"
                + "Phone: " + patientPhone + "\n"
                + "Time Slot: " + timeSlot + "\n"
                + doctor.toString() + "\n"
                + "------------------------------";
    }

    // Implementation of confirmBooking from Bookings
    @Override
    public void confirmBooking() {
        System.out.println("Booking confirmed for " + patientName + " at " + timeSlot);
    }

    // Implementation of cancelBooking from Bookings
    @Override
    public void cancelBooking() {
        System.out.println("Booking for " + patientName + " has been cancelled.");
    }
}
