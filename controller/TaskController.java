package controller;

import java.util.ArrayList;
import java.util.List;

import model.Task;
import view.TaskView;

public class TaskController {
    private final List<Task> tasks = new ArrayList<>();
    private final TaskView view;

    public TaskController(TaskView view) {
        this.view = view;
    }

    public void addTask(int id, String title, String description) {
        Task task = new Task(id, title, description);
        tasks.add(task);
        view.displayMessage("Task added successfully.");
    }

    public void displayTasks() {
        view.displayTaskList(tasks);
    }

    public void markTaskAsCompleted(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(true);
                view.displayMessage("Task marked as completed.");
                return;
            }
        }
        view.displayMessage("Task with ID " + id + " not found.");
    }
}
