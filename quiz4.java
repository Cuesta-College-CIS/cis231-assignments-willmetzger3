import java.util.ArrayList;
import java.util.Scanner;
public class quiz4 {
    public static ArrayList<Student> fillupStudent(Scanner sc){
        ArrayList<Student> slist = new ArrayList<Student>();
        Integer sid, coursenum,credit;
        String cid, cname, grade, sname;
        int snum = sc.nextInt();
        for(int j=0; j<snum; ++j){
            System.out.println("enter student id: ");
            sid = sc.nextInt();
            System.out.println("enter student name: ");
            sname = sc.next();
            System.out.println("enter number of courses: ");
            coursenum = sc.nextInt();
            ArrayList<Course> cl = new ArrayList<Course>();
            for(int i = 0; i < coursenum; ++i){
                System.out.println("enter course id: ");
                cid = sc.next();
                System.out.println("enter the name of the course: ");
                cname = sc.next();
                System.out.println("enter course credit: ");
                credit = sc.nextInt();              
                System.out.println("enter course grade: ");
                grade = sc.next();
                Course c = new Course(cid, cname, credit, grade);
                cl.add(c);
            }
            Student s = new Student(sid, sname, cl);
            slist.add(s);
            }
            return slist;
    }
    public static void printStudent(ArrayList<Student> slist) {
        
        for(Student student: slist){         		      
            System.out.println(student.toString(slist)); 	
            System.out.println("Total credits: " + student.getTotalCredits() + "\n\n");
        }  
    }
    public static void printStudent(ArrayList<Student> slist, Integer id) {
        Student student = new Student(id, "temp", null);
            for(Student i: slist){
                if (i.getID() == id){
                    student = i;
                    System.out.println("The student with the highest credits is :\n"  + student.toString(slist));
                    System.out.println("Total credits: " + student.getTotalCredits() + "\n\n");
                }
            }
    }
    public static Integer findStudent(ArrayList<Student> slist, Integer id) {
        Student student = new Student(id, "temp", null);
        Integer tmp = 0;
            for(Student i: slist){
                if (i.getTotalCredits()>tmp){
                    tmp = i.getTotalCredits();
                    student = i;
                }
            }
        return student.getID();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer sid=0;
        ArrayList<Student> slist;
        System.out.println("Enter number of students: ");
        slist = fillupStudent(sc);
        printStudent(slist);
        sid = findStudent(slist, sid);
        printStudent(slist,sid);
        sc.close();
    }
}
