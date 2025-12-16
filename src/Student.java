public class Student {
    private String studentId;
    private String name;
    private int age;
    private String grade;
    private String contact;

    public Student(String studentId, String name, int age, String grade, String contact) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.contact = contact;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return String.format(
            "ID: %s | Name: %s | Age: %d | Grade: %s | Contact: %s",
            studentId, name, age, grade, contact
        );
    }
}
