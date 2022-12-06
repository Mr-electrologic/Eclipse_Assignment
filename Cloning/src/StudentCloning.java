public class StudentCloning implements Cloneable {
	String rollno,name;
	
	public StudentCloning(String rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
public Object clone() throws CloneNotSupportedException{
	return super.clone();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentCloning s1=new StudentCloning("S20-414", "Sanjana");
		
		try {
			StudentCloning s2=(StudentCloning) s1.clone();
			s1.name="Saiprasad";
			System.out.println("S1 data");
			System.out.println(s1.name);
			System.out.println(s1.rollno);
			System.out.println("S2 data");
			System.out.println(s2.name);
			System.out.println(s2.rollno);
		}
		catch(CloneNotSupportedException e) {
			
		}
	}
}
