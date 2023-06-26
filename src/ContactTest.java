import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    @Test
    void testContactIDNotLongerThan10() {

        // TODO: is a test required to prove that in the case that something is under 10 that the exception does not fire
        // test ID not longer thahn 10 chars
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "Kevin", "Shields", "4405555555",
                    "12 A St. Apt. 4, Bob OH 44444"
            );
        });
    }

    @Test
    void testFirstNameNotLongerThan10() {

        // first name too long
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "KevinNAMEISLONGERTHAN10", "Shields", "4405555555",
                    "12 A St. Apt. 4, Bob OH 44444"
            );
        });
    }

    @Test
    void testLastNameNotLongerThan10() {

        // last name too long
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "Kevin", "ShieldsLONGERTHAN10", "4405555555",
                    "12 A St. Apt. 4, Bob OH 44444"
            );
        });
    }

    @Test
    void testPhoneExactlyTen() {

        // 11
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "Kevin", "Shields", "44055555550",
                    "12 A St. Apt. 4, Bob OH 44444"
            );
        });

        // only 9
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "Kevin", "Shields", "440555555",
                    "12 A St. Apt. 4, Bob OH 44444"
            );
        });
    }

    @Test
    void testAddressNoLongerThan30() {

        // 31 chars
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "Kevin", "Shields", "4405555555",
                    "12 A St. Apt. 4, Bob OH 44444TH"
            );
        });
    }
}