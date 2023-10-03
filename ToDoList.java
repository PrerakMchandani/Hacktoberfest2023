import java.util.ArrayList;
import java.util.Scanner;

public class TodoListManager {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Todo List:");
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i + 1) + ". " + todoList.get(i));
            }

            System.out.println("\nOptions:");
            System.out.println("1. Add Todo");
            System.out.println("2. Remove Todo");
            System.out.println("3. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the new todo item:");
                    scanner.nextLine(); // Consume the newline character
                    String newItem = scanner.nextLine();
                    todoList.add(newItem);
                    break;
                case 2:
                    System.out.println("Enter the index of the todo item to remove:");
                    int indexToRemove = scanner.nextInt();
                    if (indexToRemove >= 1 && indexToRemove <= todoList.size()) {
                        todoList.remove(indexToRemove - 1);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
