import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactServiceTest {
    @Test
    void testUpdateFirstName() {
        // setup
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1", "Kevin", "Shields", "4404444444",
                "4 E. St. T UT 44444");
        contactService.addContact(contact);

        // execute
        contactService.updateContact("1", "firstName", "Bob");

        assertTrue(contact.getFirstName().equals("Bob"));

        // Teardown
        contactService.deleteContact("1");
    }

    @Test
    void testUpdateLastName() {
        // setup
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1", "Kevin", "Shields", "4404444444",
                "4 E. St. T UT 44444");
        contactService.addContact(contact);

        // execute
        contactService.updateContact("1", "lastName", "Jones");

        assertTrue(contact.getLastName().equals("Jones"));

        // Teardown
        contactService.deleteContact("1");
    }
    @Test
    void testUpdatephone() {
        // setup
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1", "Kevin", "Shields", "4404444444",
                "4 E. St. T UT 44444");
        contactService.addContact(contact);

        // execute
        contactService.updateContact("1", "phone", "5555555555");

        assertTrue(contact.getPhone().equals("5555555555"));

        // Teardown
        contactService.deleteContact("1");
    }
    @Test
    void testUpdateAddress() {
        // setup
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1", "Kevin", "Shields", "4404444444",
                "4 E. St. T UT 44444");
        contactService.addContact(contact);

        // execute
        contactService.updateContact("1", "address", "9 W. St. T UT 44445");

        assertTrue(contact.getAddress().equals("9 W. St. T UT 44445"));

        // Teardown
        contactService.deleteContact("1");
    }

    @Test
    void testAddContact() {


        // setup
        ContactService contactService = new ContactService();

        Contact contact = new Contact("1", "Kevin", "Shields", "4404444444",
                "4 E. St. T UT 44444");
        contactService.addContact(contact);



        // execute test that the length of the array is 1
        assertTrue(contactService.getLengthOfContacts() == 1);

        // Teardown
        contactService.deleteContact("1");
    }

    @Test
    void testDeleteContact() {


        // setup
        ContactService contactService = new ContactService();

        Contact contact = new Contact("1", "Kevin", "Shields", "4404444444",
                "4 E. St. T UT 44444");
        contactService.addContact(contact);


        contactService.deleteContact("1");

        // execute test that the length of the array is 1
        assertTrue(contactService.getLengthOfContacts() == 0);


    }
}
