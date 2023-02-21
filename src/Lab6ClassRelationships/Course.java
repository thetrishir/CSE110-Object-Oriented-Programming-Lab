package Lab6ClassRelationships;

import java.util.ArrayList;

public class Course {
    private String courseID;
    private String courseTitle;
    private double credit;
    private ArrayList<Student> studentList = new ArrayList<Student>();
    private int numberOfStudents;
    private Faculty faculty;

    public Course() {}
    public Course(String i, String t, double c) {
        courseID = i;
        courseTitle = t;
        credit = c;
    }

    public String toString() {
        return "Course Id = " + courseID + "\nCourse Title = " + courseTitle +
                "\nCredit = " + credit + "\nFaculty = " + faculty +
                "\nNumber Of Students = " + studentList.size();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }
    public void dropStudent(int studentId) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentId() == studentId) {
                studentList.remove(i);
            } else {
                System.out.println("Student not Found");
            }
        }
    }

    public void addFaculty(Faculty f) {
        faculty = f;
    }
    public void dropFaculty() {
        faculty = null;
    }

    public void printStudentList() {
        System.out.println(studentList);
    }

    public String getCourseId() {
        return courseID;
    }
    public String getCourseTitle() {
        return courseTitle;
    }
    public double getCredit(){ return credit; }
    public Faculty getFaculty() {
        return faculty;
    }
    public ArrayList<Student> getStudentList() {
        return studentList;

    }
    public void setCourseId(String i) {
        courseID = i;
    }
    public void setCourseTitle(String t) {
        courseTitle = t;
    }
    public void setCredit(double c) {
        credit = c;
    }
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
