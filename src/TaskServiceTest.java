import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskServiceTest {

    private TaskService taskService;
    private Task task;

    @BeforeEach
    void setup() {
        // setup
        taskService = new TaskService();
        task = new Task("1", "Clean room", "I will clean my room");
        taskService.addTask(task);


    }

    @AfterEach
    void tearDown() {
        // Teardown
        taskService.deleteTask("1");
    }
    @Test
    void testUpdateName() {
        // execute
        taskService.updateTask("1", "name", "Clean house");

        assertTrue(task.getName().equals("Clean house"));

    }

    @Test
    void testUpdateDescription() {


        // execute
        taskService.updateTask("1", "description", "I will sweep my room");

        assertTrue(task.getDescription().equals("I will sweep my room"));
    }


    @Test
    void testAddTask() {




        // execute test that the length of the array is 1
        assertTrue(taskService.getLengthOfTasks() == 1);

        }

    @Test
    void testDeleteTask() {
        taskService.deleteTask("1");

        // execute test that the length of the array is 1
        assertTrue(taskService.getLengthOfTasks() == 0);
    }
    // creating the below method to prove that I can change the red coverage
    // indicator to green if i make this test
    @Test
    void testIncorrectFieldUpdated() {
        // execute
        taskService.updateTask("1", "descriptionn", "I will sweep my room");

        assertTrue(task.getDescription().equals("I will clean my room"));
    }
}
