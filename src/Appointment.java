import java.util.Date;


public class Appointment {
    public final String appointmentID;
    public Date date;
    public String description;

    public Appointment(String appointmentID, Date date, String description) {


        //required
        if(appointmentID == null || appointmentID.length() > 10) {
            throw new IllegalArgumentException("Invalid appointmentID or you forgot to add one");
        }

        // date check
        // TODO: make sure new date works
        if(date == null || date.before(new Date())) {
            throw new IllegalArgumentException("Invalid date or you forgot to add one");
        }

        // description check
        if(description == null || description.length() > 50) {
            throw new IllegalArgumentException("Invalid description or you forgot to add one");
        }


        this.appointmentID = appointmentID;
        this.date = date;
        this.description = description;

    }

    @Override
    public String toString() {
        return "appointmentID: " + appointmentID + ", Date: " + date + ", description: " + description;
    } // generated this method with ChatGPT so that I can see the values contained in my object, when looking inside
    // the arrayList

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
