import java.util.Scanner;

public class StudentInformationSystem {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentManager manager = new StudentManager();

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n=== STUDENT INFORMATION SYSTEM ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> manager.viewStudents();
                case 3 -> searchStudent();
                case 4 -> {
                    running = false;
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Student ID: ");
        String id = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Grade: ");
        double grade = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Contact: ");
        String contact = scanner.nextLine();

        if (!ValidationUtils.isValidAge(age)) {
            System.out.println("❌ Invalid age!");
            return;
        }

        if (!ValidationUtils.isValidGrade(grade)) {
            System.out.println("❌ Grade must be between 0 and 100!");
            return;
        }

        Student student = new Student(name, age, grade, id, contact);
        manager.addStudent(student);
    }

    private static void searchStudent() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();

        Student student = manager.searchById(id);
        if (student == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println("Student Found:");
            student.display();
        }
    }
}
