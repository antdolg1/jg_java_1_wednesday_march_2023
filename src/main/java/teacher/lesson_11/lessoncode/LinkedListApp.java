package teacher.lesson_11.lessoncode;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListApp {
    public static void main(String[] args) {

        List<String> names = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        names.add("Alice");
        names.add("Bob");
        names.add("Susan");
        names.add("Wolfgan");
        names.add("Guntar");

        while (true) {
            System.out.println("1. Add a name");
            System.out.println("2. Remove a name");
            System.out.println("3. Search for a name");
            System.out.println("4. Print all names");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a name to add: ");
                    String newName = scanner.next();
                    names.add(newName);
                    System.out.println("Name added successfully!");
                    break;
                case 2:
                    System.out.println("Enter a name to remove: ");
                    String nameToRemove = scanner.next();
                    boolean removed = names.remove(nameToRemove);
                    if (removed) {
                        System.out.println("Name removed successfully!");
                    } else {
                        System.out.println("Name not found in the list.");
                    }
                    break;
                case 3:
                    System.out.println("Enter a name to search: ");
                    String nameToSearch = scanner.next();
                    boolean found = names.contains(nameToSearch);
                    if (found) {
                        System.out.println("Name found in the list!");
                    } else {
                        System.out.println("Name not found in the list.");
                    }
                    break;
                case 4:
                    System.out.println("Names in the list:");
                    for (String name : names) {
                        System.out.println(name);
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }
}
