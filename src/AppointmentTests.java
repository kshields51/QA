import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Date;


import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;
//new Date(System.currentTimeMillis() - 1)
class AppointmentTest {
    @Test
    void testAppointmentIDNotLongerThan10() {

        // TODO: is a test required to prove that in the case that something is under 10 that the exception does not fire
        // test ID not longer thahn 10 chars
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("12345678901", new Date(), "This is an appointment to do something 50 chars!!!"
            );
        });
    }

    @Test
    void testDateNotInThePast() {

        // date too long
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("1234567890", new Date(System.currentTimeMillis() - 1), "This is an appointment to do something 50 chars!!!"
            );
        });
    }

    @Test
    void testDescriptionNotLongerThan50() {

        // last description too long
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("1234567890", new Date(), "This is an appointment to do something 51 chars!!!!"
            );
        });
    }
}