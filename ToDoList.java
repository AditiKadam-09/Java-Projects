//The To-Do List Console-Based Application is a simple yet effective Java program that allows users to manage their tasks efficiently. 
//This application provides a text-based interface where users can add, view,mark as complete and remove tasks from their to-do list.

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    // ArrayList to store the tasks
    private ArrayList<String> tasks;
    // ArrayList to store the completion status of tasks
    private ArrayList<Boolean> taskCompleted;
    // Scanner to read user input
    private Scanner scanner;

    // Constructor to initialize the tasks list, completion status list, and scanner
    public ToDoList() {
        tasks = new ArrayList<>();
        taskCompleted = new ArrayList<>(); // Initialize the completion status list
        scanner = new Scanner(System.in);
    }

    // Method to display the menu options
    public void showMenu() {
        System.out.println("===== To-Do List Application =====");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Remove Task");
        System.out.println("4. Mark Task as Completed");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    // Method to add a new task
    public void addTask() {
        System.out.print("Enter task description: ");
        String task = scanner.nextLine(); // Read the task description from user
        tasks.add(task); // Add the task to the list
        taskCompleted.add(false); // Initialize the task as not completed
        System.out.println("Task added: " + task);
    }

    // Method to view all tasks
    public void viewTasks() {
        // Check if the task list is empty
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the to-do list.");
        } else {
            System.out.println("===== Your Tasks =====");
            // Loop through the tasks and display them
            for (int i = 0; i < tasks.size(); i++) {
                String status = taskCompleted.get(i) ? "[Completed]" : "[Pending]"; // Determine completion status
                System.out.println((i + 1) + ". " + tasks.get(i) + " " + status); // Display task number, description,
                                                                                  // and status
            }
        }
    }

    // Method to remove a task
    public void removeTask() {
        viewTasks(); // Display current tasks
        // Check if there are tasks to remove
        if (!tasks.isEmpty()) {
            System.out.print("Enter task number to remove: ");
            int taskNumber = scanner.nextInt(); // Read the task number to remove
            scanner.nextLine(); // Consume the newline character after the integer input
            // Check if the task number is valid
            if (taskNumber > 0 && taskNumber <= tasks.size()) {
                String removedTask = tasks.remove(taskNumber - 1); // Remove the task from the list
                taskCompleted.remove(taskNumber - 1); // Remove the corresponding completion status
                System.out.println("Removed task: " + removedTask);
            } else {
                System.out.println("Invalid task number.");
            }
        }
    }

    // Method to mark a task as completed
    public void markTaskCompleted() {
        viewTasks(); // Display current tasks
        // Check if there are tasks to mark as completed
        if (!tasks.isEmpty()) {
            System.out.print("Enter task number to mark as completed: ");
            int taskNumber = scanner.nextInt(); // Read the task number to mark as completed
            scanner.nextLine(); // Consume the newline character after the integer input
            // Check if the task number is valid
            if (taskNumber > 0 && taskNumber <= tasks.size()) {
                taskCompleted.set(taskNumber - 1, true); // Mark the task as completed
                System.out.println("Task marked as completed: " + tasks.get(taskNumber - 1));
            } else {
                System.out.println("Invalid task number.");
            }
        }
    }

    // Method to start the application
    public void start() {
        int choice; // Variable to hold user choice
        // Loop until the user chooses to exit
        do {
            showMenu(); // Show the menu options
            choice = scanner.nextInt(); // Read the user's choice
            scanner.nextLine(); // Consume the newline character
            // Perform actions based on user choice
            switch (choice) {
                case 1:
                    addTask(); // Add a new task
                    break;
                case 2:
                    viewTasks(); // View all tasks
                    break;
                case 3:
                    removeTask(); // Remove a task
                    break;
                case 4:
                    markTaskCompleted(); // Mark a task as completed
                    break;
                case 5:
                    System.out.println("Exiting the application. Goodbye!"); // Exit message
                    break;
                default:
                    System.out.println("Invalid option. Please try again."); // Invalid option message
            }
        } while (choice != 5); // Continue until the user chooses to exit
    }

    // Main method to run the application
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList(); // Create an instance of ToDoList
        toDoList.start(); // Start the application
    }
}

// Output:
/*
 * ===== To-Do List Application =====
 * 1. Add Task
 * 2. View Tasks
 * 3. Remove Task
 * 4. Mark Task as Completed
 * 5. Exit
 * Choose an option: 1
 * Enter task description: doing 5 programs of java
 * Task added: doing 5 programs of java
 * 
 * ===== To-Do List Application =====
 * 1. Add Task
 * 2. View Tasks
 * 3. Remove Task
 * 4. Mark Task as Completed
 * 5. Exit
 * Choose an option: 1
 * Enter task description: Complete write-up of OS
 * Task added: Complete write-up of OS
 * 
 * ===== To-Do List Application =====
 * 1. Add Task
 * 2. View Tasks
 * 3. Remove Task
 * 4. Mark Task as Completed
 * 5. Exit
 * Choose an option: 1
 * Enter task description: Complete 2 courses from IBM
 * Task added: Complete 2 courses from IBM
 * 
 * ===== To-Do List Application =====
 * 1. Add Task
 * 2. View Tasks
 * 3. Remove Task
 * 4. Mark Task as Completed
 * 5. Exit
 * Choose an option: 1
 * Enter task description: Watching TV
 * Task added: Watching TV
 * 
 * ===== To-Do List Application =====
 * 1. Add Task
 * 2. View Tasks
 * 3. Remove Task
 * 4. Mark Task as Completed
 * 5. Exit
 * Choose an option: 1
 * Enter task description: Playing outdoor games
 * Task added: Playing outdoor games
 * 
 * ===== To-Do List Application =====
 * 1. Add Task
 * 2. View Tasks
 * 3. Remove Task
 * 4. Mark Task as Completed
 * 5. Exit
 * Choose an option: 2
 * ===== Your Tasks =====
 * 1. doing 5 programs of java [Pending]
 * 2. Complete write-up of OS [Pending]
 * 3. Complete 2 courses from IBM [Pending]
 * 4. Watching TV [Pending]
 * 5. Playing outdoor games [Pending]
 * 
 * ===== To-Do List Application =====
 * 1. Add Task
 * 2. View Tasks
 * 3. Remove Task
 * 4. Mark Task as Completed
 * 5. Exit
 * Choose an option: 3
 * ===== Your Tasks =====
 * 1. doing 5 programs of java [Pending]
 * 2. Complete write-up of OS [Pending]
 * 3. Complete 2 courses from IBM [Pending]
 * 4. Watching TV [Pending]
 * 5. Playing outdoor games [Pending]
 * Enter task number to remove: 4
 * Removed task: Watching TV
 * 
 * ===== To-Do List Application =====
 * 1. Add Task
 * 2. View Tasks
 * 3. Remove Task
 * 4. Mark Task as Completed
 * 5. Exit
 * Choose an option: 2
 * ===== Your Tasks =====
 * 1. doing 5 programs of java [Pending]
 * 2. Complete write-up of OS [Pending]
 * 3. Complete 2 courses from IBM [Pending]
 * 4. Playing outdoor games [Pending]
 * 
 * ===== To-Do List Application =====
 * 1. Add Task
 * 2. View Tasks
 * 3. Remove Task
 * 4. Mark Task as Completed
 * 5. Exit
 * Choose an option: 4
 * ===== Your Tasks =====
 * 1. doing 5 programs of java [Pending]
 * 2. Complete write-up of OS [Pending]
 * 3. Complete 2 courses from IBM [Pending]
 * 4. Playing outdoor games [Pending]
 * Enter task number to mark as completed: 1
 * Task marked as completed: doing 5 programs of java
 * 
 * ===== To-Do List Application =====
 * 1. Add Task
 * 2. View Tasks
 * 3. Remove Task
 * 4. Mark Task as Completed
 * 5. Exit
 * Choose an option: 2
 * ===== Your Tasks =====
 * 1. doing 5 programs of java [Completed]
 * 2. Complete write-up of OS [Pending]
 * 3. Complete 2 courses from IBM [Pending]
 * 4. Playing outdoor games [Pending]
 * 
 * ===== To-Do List Application =====
 * 1. Add Task
 * 2. View Tasks
 * 3. Remove Task
 * 4. Mark Task as Completed
 * 5. Exit
 * Choose an option: 5
 * Exiting the application. Goodbye!
 */