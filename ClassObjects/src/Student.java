
public class Student {
	String name;
	int rollno;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S1= new Student();
		S1.setDetails("Bangad Billa",21);
		S1.display();
		Student S2= new Student();
		S2.setDetails("sanjana",22);
		S2.display();
	}
	public void setDetails(String name, int roll) {
		this.name=name;
		rollno=roll;
	}
	public void display() {
	System.out.print(rollno);
	System.out.println(name);
}
}
