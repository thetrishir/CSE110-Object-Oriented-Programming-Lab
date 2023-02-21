package Lab6ClassRelationships;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Course> courses = new ArrayList<Course>();
    static ArrayList<Student> students = new ArrayList<Student>();
    static ArrayList<Faculty> faculty = new ArrayList<Faculty>();
    static Scanner input = new Scanner(System.in);
    static int option;


    //main method


    public static void main(String[] args) {

        courses.add(new Course("MAT104", "Vector Algebra", 3));
        courses.add(new Course("CSE110", "OOP", 4.5));
        courses.add(new Course("Che109", "Chemistry", 3));
        courses.add(new Course("Eng101", "Basic Grammar", 3));

        students.add(new Student("Trishir", 1, 3));
        students.add(new Student("Neil", 4, 2.7));
        students.add(new Student("Ann", 5, 3.1));
        students.add(new Student("Ajax", 2, 4));
        students.add(new Student("Mulan", 3, 2.6));

        faculty.add(new Faculty(1, "Tanni Mitra", "Senior Lecturer"));
        faculty.add(new Faculty(2, "Muhit Emon", "Senior Lecturer"));
        faculty.add(new Faculty(3, "Azad", "Professor"));


        while (true) {
            System.out.println("1. Add \n2. Delete \n3. Update \n4. Print \n5. Search \n6. Exit \nChoose your option: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("1. Add Student \n2. Add Course \n3. Add Faculty \nChoose your option: ");
                    int opt = input.nextInt();

                    switch (opt) {
                        case 1:
                            System.out.println("Please Enter a Course ID & Student ID : ");
                            addStudentToCourse(input.next(), input.nextInt());

                            System.out.println("Enter Student Name, ID & CGPA : ");
                            students.add(new Student(input.next(), input.nextInt(), input.nextDouble()));
                            System.out.println("Student Added Successfully");
                            break;
                        case 2:
                            System.out.println("Enter Course ID Title & Credit");
                            courses.add(new Course(input.next(), input.next(), input.nextDouble()));
                            System.out.println("Course Added Successfully");
                            break;
                        case 3:
                            System.out.println("Enter Course ID & Faculty ID: ");
                            addFacultyToCourse(input.next(), input.nextInt());
                            break;
                        default:
                            System.out.println("Wrong Input.");
                            break;
                    }

                    break;

                case 2:
                    System.out.println("1. Delete Student \n2. Delete Course \n3. Delete Faculty \nChoose your option: ");
                    option = input.nextInt();

                    switch (option) {
                        case 1:
                            System.out.println("Enter Student ID: ");
                            int id = input.nextInt();
                            for (int i = 0; i < courses.size(); i++) {
                                for (int j = 0; j < courses.get(i).getStudentList().size(); j++) {
                                    if (courses.get(i).getStudentList().get(j).getStudentId() == id) {
                                        courses.get(i).getStudentList().remove(j);
                                    }
                                }
                            }
                            for (int i = 0; i < students.size(); i++) {
                                if (students.get(i).getStudentId() == id) {
                                    students.remove(i);
                                }
                            }
                            System.out.println("Student Deleted ");
                            break;
                        case 2:
                            System.out.println("Enter Course ID :");
                            String x=input.next();

                            for (int i = 0; i < courses.size(); i++) {
                                if (courses.get(i).getCourseId().equals(x)) {
                                    courses.remove(i);
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Enter Faculty ID :");
                            id= input.nextInt();

                            for (int i = 0; i < faculty.size(); i++) {
                                if (faculty.get(i).getFacultyId() == id) {
                                    faculty.remove(i);
                                }
                            }
                            break;
                        default:
                            System.out.println("Wrong Input");
                            break;
                    }

                    break;
                case 3:
                    System.out.println("1. Update Student \n2. Update Course \n3. Update Faculty \nChoose your option: ");
                    option = input.nextInt();

                    switch (option) {
                        case 1:
                            System.out.println("Enter the ID of the Student ");
                            int id = input.nextInt();
                            upStudent(id);
                            break;
                        case 2:
                            System.out.println("Enter Course ID : ");
                            upCourse(input.next());
                            break;
                        case 3:
                            System.out.println("Enter Faculty ID : ");
                            upFaculty(input.nextInt());
                            break;
                        default:
                            System.out.println("Wrong Input.");
                            break;
                    }


                    break;
                case 4:
                    System.out.println("1.  All Students \n2.  All Courses \n3.  All Faculties \n4.  Info of a Student " +
                            "\n5.  Info of a Course \n6.  Info of a Faculty \n7.  Student List & Faculty Information of a Course " +
                            "\n8.  The Courses taken by a Student \nChoose your option: ");
                    option = input.nextInt();

                    switch (option) {
                        case 1:
                            for (int i = 0; i < students.size(); i++) {
                                System.out.println(students.get(i).getStudentName());
                            }
                            break;
                        case 2:
                            for (int i = 0; i < courses.size(); i++) {
                                System.out.println(courses.get(i).getCourseId());
                            }
                            break;
                        case 3:
                            for (int i = 0; i < faculty.size(); i++) {
                                System.out.println(faculty.get(i).getFacultyName());
                            }
                            break;
                        case 4:
                            System.out.println("Enter Student ID :");
                            printStudent(input.nextInt());
                            break;
                        case 5:
                            System.out.println("Enter Course ID :");
                            printCourse(input.next());
                            break;
                        case 6:
                            System.out.println("Enter Faculty ID : ");
                            printFaculty(input.nextInt());
                            break;
                        case 7:
                            System.out.println("Enter a Course ID :");
                            printCourseInfo(input.next());
                            break;
                        case 8:
                            System.out.println("Enter Student ID :");
                            courseByStudent(input.nextInt());
                            break;
                        default:
                            break;
                    }

                    break;
                case 5:
                    System.out.println("1. Search a Student \n2. Search a Course \n3. Search a Faculty " +
                            "\n4. Search whether a Student takes a Course \n5. Search a whether a Faculty Teaches a Course " +
                            "\n6. Search Courses taken by a Student \n7. Search Courses taught by a Faculty \nChoose your option: ");
                    option = input.nextInt();

                    switch (option) {
                        case 1:
                            System.out.println("Enter a Student ID :");
                            if (checkStudent(input.nextInt()) < 0)
                                System.out.println("Student is NOT Found.");
                            else
                                System.out.println("Student is Found.");
                            break;
                        case 2:
                            System.out.println("Enter a Course ID :");
                            if (checkCourse(input.next()) >= 0)
                                System.out.println("Course is Found.");
                            else
                                System.out.println("Course is NOT Found.");
                            break;
                        case 3:
                            System.out.println("Enter a Faculty ID :");
                            if (checkFaculty(input.nextInt()) < 0)
                                System.out.println("Faculty is NOT Found.");
                            else
                                System.out.println("Faculty is Found.");
                            break;
                        case 4:
                            System.out.println("Enter a Student ID :");
                            System.out.println(courseTaken(input.nextInt()));
                            break;
                        case 5:
                            System.out.println("Enter a Faculty ID : ");
                            System.out.println(courseTeaching(input.nextInt()));
                            break;
                        case 6:
                            System.out.println("Enter a Student ID : ");
                            courseByStudent(input.nextInt());
                            break;
                        case 7:
                            System.out.println("Enter Faculty ID :");
                            courseOfFaculty(input.nextInt());
                            break;
                        default:
                            break;
                    }
                    break;
                case 6:

                    System.out.println("Thanks For Using Our Program ");

                    System.exit(0);
            }
        }
    }








    //Add student and faculty to course




    private static void addStudentToCourse(String id, int StuID) {

        int Index1 = -1;

        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(id)) {
                Index1 = i;
            }
        }


        if (Index1 != -1) {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getStudentId() == StuID) {
                    courses.get(Index1).addStudent(students.get(i));
                }
            }
            System.out.println("Student Added .");
        } else
            System.out.println("Something is missing check again .");
    }

    private static void addFacultyToCourse(String courseID, int id) {
        if (courses.isEmpty()) {
            System.out.println("Course not found.");
            return;
        }
        int Index2 = -1;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(courseID)) {
                Index2 = i;
            }
        }
        for (int i = 0; i < faculty.size(); i++) {
            if (faculty.get(i).getFacultyId() == id) {
                courses.get(Index2).addFaculty(faculty.get(i));
            }
        }

        if (Index2 == -1) System.out.println("Course or Faculty not Found.");
        else {
            System.out.println("Faculty Added Successfully.");
        }
    }




//Checking values



    public static int checkFaculty(int id) {
        for (int i = 0; i < faculty.size(); i++) {
            if (faculty.get(i).getFacultyId() == id) {
                return i;
            }
        }
        return -1;
    }

    public static int checkStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == id) {
                return i;
            }
        }
        return -1;
    }

    public static int checkCourse(String id) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(id)) {
                return i;
            }
        }
        return -1;
    }




    //update






    private static void upStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == id) {
                System.out.println("Enter New Student's ID , Name & CGPA:");
                students.get(i).setStudentId(input.nextInt());
                input.nextLine();
                students.get(i).setStudentName(input.nextLine());
                students.get(i).setStudentCGPA(input.nextDouble());
                System.out.println("Student's info was Updated Successfully");
            }
        }
    }


    public static void upCourse(String id) {
        int val = checkCourse(id);
        if (val < 0) {
            System.out.println("Course Not Found");
            return;
        }
        System.out.println("Enter  ID, Title, Credit :");
        courses.get(val).setCourseId(input.next());
        courses.get(val).setCourseTitle(input.next());
        courses.get(val).setCredit(input.nextDouble());
        System.out.println("Course info was Updated ");
    }

    public static void upFaculty(int id) {
        int val = checkFaculty(id);
        if (val < 0) {
            System.out.println("Faculty not Found.");
            return;
        }
        System.out.println("Enter New Faculty ID Name & Position :");
        faculty.get(val).setFacultyId(input.nextInt());
        input.nextLine();
        faculty.get(val).setFacultyName(input.nextLine());
        faculty.get(val).setFacultyPosition(input.nextLine());
        System.out.println("Faculty info was Updated ");
    }





    //Printing





    public static void printStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == id) {
                Student s = students.get(i);
                System.out.println(s.toString());
                return;
            }
        }
        System.out.println("Student was Not Found");
    }

    public static void printCourse(String id) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(id)) {
                System.out.println(courses.get(i).toString());
                return;
            }
        }
        System.out.println("Course was Not Found");
    }

    public static void printFaculty(int id) {
        int val = checkFaculty(id);
        if (val > -1) {
            System.out.println(faculty.get(val).toString());
            return;
        }
        System.out.println("Faculty was not Found");
    }


    public static void printCourseInfo(String id) {
        int val = checkCourse(id);
        if (val < 0) {
            System.out.println("Course  Not Found.");
            return;
        }
        System.out.println("Students of " + courses.get(val).getCourseId() + " are :");
        for (int i = 0; i < courses.get(val).getStudentList().size(); i++) {
            System.out.println(courses.get(val).getStudentList().get(i).getStudentName());
        }
        if (courses.get(val).getFaculty() != null) {
            System.out.println("Faculty Info of " + courses.get(val).getCourseId() + " is :");
            System.out.println(courses.get(val).getFaculty().toString());
        } else
            System.out.println("No faculty allocated yet.");
    }

    public static void courseByStudent(int id) {
        for (int i = 0; i < courses.size(); i++) {
            for (int j = 0; j < courses.get(i).getStudentList().size(); j++) {
                if (courses.get(i).getStudentList().get(j).getStudentId() == id)
                    System.out.println(courses.get(i).getCourseId());
            }

        }
    }




    //Searching





    public static boolean courseTaken(int id) {
        for (int i = 0; i < courses.size(); i++) {
            for (int j = 0; j < courses.get(i).getStudentList().size(); j++) {
                if (courses.get(i).getStudentList().get(j).getStudentId() == id)
                    return true;
            }

        }
        return false;
    }

    public static boolean courseTeaching(int id) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getFaculty() != null)
                if (courses.get(i).getFaculty().getFacultyId() == id)
                    return true;
        }
        return false;
    }

    public static void courseOfFaculty(int id) {
        boolean isTaking = false;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getFaculty() != null)
                if (courses.get(i).getFaculty().getFacultyId() == id) {
                    System.out.println(courses.get(i).getCourseId());
                    isTaking = true;
                }
        }
        if (isTaking) {
        } else {
            System.out.println("Not Courses have taken.");
        }
    }

}
