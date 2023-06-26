import java.util.ArrayList;

public class AppointmentService {

    // add appointments by id
    public static ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();

    public int getLengthOfAppointments () {
        return appointmentList.size();
    }

    public void addAppointment(Appointment someAppointment) {
        appointmentList.add(someAppointment);
        System.out.println("Appointment Added");

    }

    public void deleteAppointment(String appointmentID) {
        // find the appointment

        int i = 0;
        for (Appointment element : AppointmentService.appointmentList) {
            if (element.appointmentID.equals(appointmentID)) {
                appointmentList.remove(i);
                System.out.println("Appointment Removed");
                break;
            }
            i++;
        }
    }
}
