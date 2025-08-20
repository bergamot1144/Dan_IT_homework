package java_hw_8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Map<String, Person> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu: ↓");
            System.out.println("1. Add new person\n2. Find a person by surname\n3. Exit\nInput your choice:");
            String userNumber = scanner.nextLine();

            switch (userNumber) {
                case "1":
                    System.out.println("Input Name:");
                    String newPersonName = scanner.nextLine();

                    System.out.println("Input Surname:");
                    String newPersonSurNameKey = scanner.nextLine();

                    int ageInput;
                    while (true) {
                        System.out.println("Enter age:");
                        String ageString = scanner.nextLine();
                        try {
                            ageInput = Integer.parseInt(ageString);
                            if (ageInput < 0) {
                                System.out.println("Age must be a positive number.");
                                continue;
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number!");
                        }
                    }

                    if (map.containsKey(newPersonSurNameKey)) {
                        System.out.println("Person with this surname already exists. Do you want to update? (1-Yes, 2-No)");
                        String choice = scanner.nextLine();
                        if (!choice.equals("1")) {
                            System.out.println("Back to menu.");
                            break;
                        }

                        Person updated = new Person(newPersonName, newPersonSurNameKey, ageInput);
                        map.put(newPersonSurNameKey, updated);
                        System.out.println("Person updated successfully!");
                        break;
                    }

                    Person person = new Person(newPersonName, newPersonSurNameKey, ageInput);
                    map.put(newPersonSurNameKey, person);
                    System.out.println("Person added successfully!");
                    break;

                case "2":
                    System.out.print("Enter surname to search: ");
                    String searchKey = scanner.nextLine();

                    Person found = map.get(searchKey);
                    if (found != null) {
                        System.out.println("Found: " + found);
                    } else {
                        System.out.println("No person found with that surname.");
                        System.out.println("List of all added persons:");
                        for (String surname : map.keySet()) {
                            System.out.println(map.get(surname));
                        }
                    }
                    break;

                case "3":
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Wrong input! Try number 1–3.");
            }
        }
    }
}
