package Week3.day2;

public class newStudent extends Student {
	newStudent(int id, String email, long phno) {
		super(id, email, phno);
		// TODO Auto-generated constructor stub
	}
	public void getStudentInfo(){
		System.out.println("Info");
		}
public static void main(String[] args) {
	Student stuobj=new Student(7075, "brchandran0411@gmail.com", 2441741);
	stuobj.getstudentinfo();
	
	}
}
class Student{
	int id;
	String email;
	long phno;
	Student(int id,String email,long phno){
		this.email=email;
		this.id=id;
		this.phno=phno;
	}
	public void getstudentinfo() {
		System.out.println(this.id+" "+this.email+" "+this.phno);
	}
}