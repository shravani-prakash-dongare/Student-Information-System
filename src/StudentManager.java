import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("✅ Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.printf("%-10s %-20s %-5s %-6s %-15s%n",
                "ID", "Name", "Age", "Grade", "Contact");
        System.out.println("-".repeat(60));

        for (Student s : students) {
            s.display();
        }
    }

    public Student searchById(String id) {
        for (Student s : students) {
            if (s.getStudentId().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }
}
