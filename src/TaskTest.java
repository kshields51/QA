import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    void testTaskIDNotLongerThan10() {

        // TODO: is a test required to prove that in the case that something is under 10 that the exception does not fire
        // test ID not longer thahn 10 chars
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345678901", "Clean room", "Cleaning room in your house"
            );
        });
    }

    @Test
    void testNameNotLongerThan20() {

        // name too long
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Task("1234567890", "Clean everything thi!", "Cleaning room in your house"
            );
        });
    }

    @Test
    void testDescriptionNotLongerThan50() {

        // last name too long
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Task("1234567890", "Clean room", "Thisis10chThisis10chThisis10chThisis10chThisis10ch!"
            );
        });
    }
}