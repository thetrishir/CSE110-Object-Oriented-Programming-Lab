package Lab6ClassRelationships;

public class Student {
    private String studentName;
    private int studentId;
    private double studentCGPA;

    public Student() {}
    public Student(String n, int i, double c) {
        studentName = n;
        studentId = i;
        studentCGPA = c;
    }

    public String getStudentName() {
        return studentName;
    }
    public int getStudentId() {
        return studentId;
    }
    public double getStudentCGPA() {
        return studentCGPA;
    }
    public void setStudentName(String n) {
        studentName = n;
    }
    public void setStudentId(int i) {
        studentId = i;
    }
    public void setStudentCGPA(double c) {
        studentCGPA = c;
    }

    public String toString() {
        return "Student Name = " + studentName + "\nStudent Id = " + studentId +
                "\nStudent CGPA = " + studentCGPA;
    }
}