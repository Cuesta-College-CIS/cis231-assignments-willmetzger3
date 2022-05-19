import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class final3 {
    public interface CourseActivity {
        void decideGrade();
            // Based on the scores, 
            // determine the letter grade ‘A’, ‘B’, and so on.
            // There is no strict rule to implement
        void printCourseinfo();
            // Print the brief Course information
            // Any code segment is fine to print information.
    }
    public class Course implements CourseActivity {
        String 	cid;
        String 	cname;
        Integer gradeNum;
        String 	grade;
        // Class Properties
        public void Course(String cID, String name, Integer gradeN){
            cid = cID;
            cname = name;
            gradeNum = gradeN;
        }
        // Member Methods
        public void decideGrade(){
            if (gradeNum<100)
                grade = "a";
            if (gradeNum<90)
                grade = "b";
            if (gradeNum<80)
                grade = "c";
            if (gradeNum<70)
                grade = "d";
            if (gradeNum<60)
                grade = "f";
        }
        public void printCourseinfo(){
            System.out.print("ID: " + cid + "name: " + cname + "Score: " + gradeNum + "Grade: " + grade);
        }
        // Implement the inherited methods from the interface
    }
    public abstract class Person {
        // Member Variables
        String name;
        String DOB;
        // Constructor, and Member methods if needed
        public void Person(String pDOB, String pName){
            DOB = pDOB;
            name = pName;
        }
        // Abstract Method PrintPerson() ;
    }
    public class Student extends Person {
        // Member Variables
        Integer sid;
        Integer credits;
        ArrayList<Course> clist;
	    // Constructor, and Member methods if needed
        public void Student(String sName, String sDOB, Integer id, Integer sCredits){
            clist = new ArrayList<Course>();
            name = sName;
            DOB = sDOB;
            sid = id;
            credits = sCredits;
        }
	    // Implement the inherited abstract method
		// print the brief information for the student
        public void printPerson(){
            System.out.print("name: " + name + "date of birth: " + DOB + "\n" + "ID: " + sid + "credit: " + credits);
            for (int i = 0; i < clist.size(); ++i)
            {
                clist.get(i).printCourseinfo();
            }
        }
		// no particular requirement to implement this inherited method
    }
    public static ArrayList<Student> fillupStudent(Scanner sc){
        ArrayList<Student> slist = new ArrayList<Student>();
        Integer sCredits, id, gradeNum;
        String sName, cname, sDOB, cid;
        int snum = sc.nextInt();
        for(int j=0; j<snum; ++j){
            System.out.println("enter student name: ");
            sName = sc.next();
            System.out.println("enter student date of birth: ");
            sDOB = sc.next();
            System.out.println("enter student id: ");
            id = sc.nextInt();
            System.out.println("enter total credits: ");
            sCredits = sc.nextInt();
            Student student = new final3().new Student();
            student.Student(sName, sDOB, id, sCredits);
            System.out.println("enter number of courses: ");
            int coursenum = sc.nextInt();
            for(int i = 0; i < coursenum; ++i){
                System.out.println("enter course id: ");
                cid = sc.next();
                System.out.println("enter the name of the course: ");
                cname = sc.next();          
                System.out.println("enter course grade percentage: ");
                gradeNum = sc.nextInt();
                Course course = new final3().new Course();
                course.Course(cid, cname, gradeNum);
                student.clist.add(course);
                }
                slist.add(student);
            }
            return slist;
    }
            public static void printStudent(ArrayList<Student> slist) {
                for (int i = 0; i < slist.size(); i++) {
                    System.out.println(slist.get(i));
                }
            }
            
            public static void main(String[] args) throws FileNotFoundException {
                Scanner sc = new Scanner(System.in);
                ArrayList<Student> slist;
                System.out.println("Enter number of students: ");
                slist = fillupStudent(sc);
                printStudent(slist);
                // More code to test the methods in each Class Object
            }
    }

