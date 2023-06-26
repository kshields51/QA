public class Contact {
    public final String contactID;
    public String firstName;
    public String lastName;
    public String phone;
    public String address;

    public Contact(String contactID, String firstName, String lastName, String phone, String address) {


        //required
        if(contactID == null || contactID.length() > 10) {
            throw new IllegalArgumentException("Invalid contactID or you forgot to add one");
        }

        // firstname check
        if(firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid contactID or you forgot to add one");
        }

        // last name check
        if(lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid contactID or you forgot to add one");
        }

        // phone check
        if(phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Invalid contactID or you forgot to add one");
        }

        // address check
        if(address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid contactID or you forgot to add one");
        }

        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;


        // TODO: is null the same as required?

        contactID = contactID;
    }

    @Override
    public String toString() {
        return "ContactID: " + contactID + ", Name: " + firstName + ", lastName: " + lastName + ", phone: " + phone + ", address: " + address;
    } // generated this method with ChatGPT so that I can see the values contained in my object, when looking inside
    // the arrayList

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


}
