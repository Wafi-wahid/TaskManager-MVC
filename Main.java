import java.util.Scanner;

import controller.TaskController;
import view.TaskView;   
public class Main {
     public static void main(String[] args) {
        TaskView view = new TaskView();
        TaskController controller = new TaskController(view);
        Scanner scanner = new Scanner(System.in);
        
        int option;
        do {
            System.out.println("\nTask Management System:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    int id = view.getIdInput();
                    String title = view.getTitleInput();
                    String description = view.getDescriptionInput();
                    controller.addTask(id, title, description);
                    break;
                case 2:
                    controller.displayTasks();
                    break;
                case 3:
                    int taskId = view.getIdInput();
                    controller.markTaskAsCompleted(taskId);
                    break;
                case 4:
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 4);
        
        scanner.close();
    }
}
