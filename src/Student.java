public class Student {
    private String name;
    private int age;
    private double grade;
    private String studentId;
    private String contact;

    public Student(String name, int age, double grade, String studentId, String contact) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.studentId = studentId;
        this.contact = contact;
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGrade() { return grade; }
    public String getContact() { return contact; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGrade(double grade) { this.grade = grade; }
    public void setContact(String contact) { this.contact = contact; }

    public void display() {
        System.out.printf("%-10s %-20s %-5d %-6.2f %-15s%n",
                studentId, name, age, grade, contact);
    }
}
