public class Course {

	String 	cid;
	String 	cname;
	Integer credit;
	String 	grade;

	Course(String id, String name, Integer c, String g) {
		this.cid = id;
        this.cname = name;
        this.credit = c;
        this.grade = g;
	}
    public Integer getCredit(){
        return credit;
    }
	public String toString() {
		// Overide the toString() to print the course object
        return "Course: " + " " + cid + " " + cname + " " + credit + " " + grade + "\n";
	}

}   
