import java.util.ArrayList;

public class TaskService {

    // add tasks by id
    public static ArrayList<Task> taskList = new ArrayList<Task>();

    public int getLengthOfTasks () {
        return taskList.size();
    }

    public void addTask(Task someTask) {
        taskList.add(someTask);
        System.out.println("Task Added");

    }

    public void deleteTask(String taskID) {
        // find the task

        int i = 0;
        for (Task element : TaskService.taskList) {
            if (element.taskID.equals(taskID)) {
                taskList.remove(i);
                System.out.println("Task Removed");
                break;
            }
            i++;
        }
    }

    public void updateTask(String taskID, String fieldName, String valueToUpdate) {
        // find the task
        int i = 0;
        for (Task element : TaskService.taskList) {
            if (element.taskID.equals(taskID)) {
                // update the objects field with the value
                switch (fieldName) {
                    case "name":
                        element.setName(valueToUpdate);
                        break;
                    case "description":
                        element.setDescription(valueToUpdate);
                        break;
                    default:
                        System.out.println("Invalid Entry");
                }
                break;
            }
            i++;
        }
    }

}
