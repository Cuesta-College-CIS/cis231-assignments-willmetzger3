import java.util.ArrayList;

public class Student {

	Integer sid;
	String sname;
	ArrayList<Course> clist;

	Student(Integer id, String name, ArrayList<Course> c) {
		this.sid = id;
		this.sname = name;
		this.clist = c;
	}

	public String toString(ArrayList<Student> slist) {
        return "Student: " + sid + " " +  sname + "\n" + clist + "\n";
	}
    public Integer getID(){
        return sid;
    }
    public String getName(ArrayList<Student> slist){
    return "Student Name: " + sname;
    }
	public Integer getTotalCredits() {
		// to get the total credits for a student object
        Integer c = 0;
        for (int i=0; i<clist.size(); ++i){
            c += clist.get(i).getCredit();
        }
        //System.out.println("This is c: ");
        //System.out.println(c);
        return c;
    }
}

