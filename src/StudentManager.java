import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public boolean isValidAge(int age) {
        return age > 0;
    }

    public boolean isValidGrade(String grade) {
        return grade.matches("[A-F]");
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
