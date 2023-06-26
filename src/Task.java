public class Task {
    public final String taskID;
    public String name;
    public String description;

    public Task(String taskID, String name, String description) {


        //required
        if(taskID == null || taskID.length() > 10) {
            throw new IllegalArgumentException("Invalid taskID or you forgot to add one");
        }

        // name check
        if(name == null || name.length() > 20) {
            throw new IllegalArgumentException("Invalid taskID or you forgot to add one");
        }

        // description check
        if(description == null || description.length() > 50) {
            throw new IllegalArgumentException("Invalid taskID or you forgot to add one");
        }


        this.taskID = taskID;
        this.name = name;
        this.description = description;

    }

    @Override
    public String toString() {
        return "taskID: " + taskID + ", Name: " + name + ", description: " + description;
    } // generated this method with ChatGPT so that I can see the values contained in my object, when looking inside
    // the arrayList

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
