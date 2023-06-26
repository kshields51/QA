import java.util.ArrayList;

public class ContactService {

    // add contacts by id
    public static ArrayList<Contact> contactList = new ArrayList<Contact>();

    public int getLengthOfContacts () {
        return contactList.size();
    }

    public void addContact(Contact someContact) {
        contactList.add(someContact);
        System.out.println("Contact Added");

    }

    public void deleteContact(String contactID) {
        // find the contact

        int i = 0;
        for (Contact element : ContactService.contactList) {
            if (element.contactID.equals(contactID)) {
                contactList.remove(i);
                System.out.println("Contact Removed");
                break;
            }
            i++;
        }
    }

    public void updateContact(String contactID, String fieldName, String valueToUpdate) {
        // find the contact
        int i = 0;
        for (Contact element : ContactService.contactList) {
            if (element.contactID.equals(contactID)) {
                // update the objects field with the value
                switch (fieldName) {
                    case "firstName":
                        element.setFirstName(valueToUpdate);
                        break;
                    case "lastName":
                        element.setLastName(valueToUpdate);
                        break;
                    case "phone":
                        element.setPhone(valueToUpdate);
                        break;
                    case "address":
                        element.setAddress(valueToUpdate);
                        break;
                    default:
                        System.out.println("Invalid Entry");
                }
                break;
            }
            i++;
        }
    }


    // delete contacts by id

    // update contact by id

        // update first name

        // update last name

        // update number

        // update address
}
