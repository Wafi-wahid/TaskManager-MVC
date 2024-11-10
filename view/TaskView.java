package view;
import java.util.List;
import java.util.Scanner;

import model.Task;
public class TaskView {
    private final Scanner scanner = new Scanner(System.in);

    public int getIdInput() {
        System.out.print("Enter task ID: ");
        return scanner.nextInt();
    }

    public String getTitleInput() {
        System.out.print("Enter task title: ");
        scanner.nextLine(); // Consume newline
        return scanner.nextLine();
    }

    public String getDescriptionInput() {
        System.out.print("Enter task description: ");
        return scanner.nextLine();
    }

    public void displayTaskList(List<Task> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
