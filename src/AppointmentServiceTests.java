import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AppointmentServiceTest {

    private AppointmentService appointmentService;
    private Appointment appointment;

    @BeforeEach
    void setup() {
        // setup
        appointmentService = new AppointmentService();
        appointment = new Appointment("1", new Date(), "This is an appointment to do something 50 chars!!!"
        );
        appointmentService.addAppointment(appointment);


    }

    @AfterEach
    void tearDown() {
        // Teardown
        appointmentService.deleteAppointment("1");
    }
    @Test
    void testAddAppointment() {




        // execute test that the length of the array is 1
        assertTrue(appointmentService.getLengthOfAppointments() == 1);

    }

    @Test
    void testDeleteAppointment() {
        appointmentService.deleteAppointment("1");

        // execute test that the length of the array is 1
        assertTrue(appointmentService.getLengthOfAppointments() == 0);
    }

}

