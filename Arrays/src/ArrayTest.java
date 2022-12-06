import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n=1;
		Employee[] emps=new Employee[n];
		for (int i=0;i<emps.length;i++) {
			System.out.println("enter SSN");
			String ssn=sc.nextLine();
			System.out.println("enter name");
			String name=sc.nextLine();
			System.out.println("enter salary");
			int sal=Integer.parseInt(sc.nextLine());
			emps[i]= new Employee(ssn,name,sal);
		}
		for (int i=0;i<emps.length;i++) {
			emps[i].display();
		}
		/*for(Employee e:emps) {
			e.display();
		}*/
	}
}
class Employee{
	String ssn;
	String name;
	int sal;
	
	public Employee(String ssn, String n, int sal) {
		this.ssn=ssn;
		name=n;
		this.sal=sal;
	}

	public void display() {
		// TODO Auto-ngenerated method stub
		System.out.println(ssn);
		System.out.println(name);
		System.out.println(sal);

	}
}