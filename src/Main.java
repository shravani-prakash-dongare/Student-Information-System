import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n--- Student Information System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Student ID: ");
                String id = scanner.nextLine();

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Age: ");
                int age = scanner.nextInt();
                scanner.nextLine();

                if (!manager.isValidAge(age)) {
                    System.out.println("Invalid age. Must be positive.");
                    continue;
                }

                System.out.print("Grade (A-F): ");
                String grade = scanner.nextLine();

                if (!manager.isValidGrade(grade)) {
                    System.out.println("Invalid grade.");
                    continue;
                }

                System.out.print("Contact Info: ");
                String contact = scanner.nextLine();

                manager.addStudent(new Student(id, name, age, grade, contact));
                System.out.println("Student added successfully.");

            } else if (choice == 2) {
                manager.displayStudents();
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}
