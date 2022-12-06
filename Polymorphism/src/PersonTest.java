import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("E for Employee and C for Customer");
		String ptype=sc.nextLine();
		if (ptype.equalsIgnoreCase("E")||ptype.equalsIgnoreCase("e")) {
			p=new Employee("Saiprasad", "Curchorem", "E101", 40000);
		}
		else if (ptype.equalsIgnoreCase("C")||ptype.equalsIgnoreCase("c")) {
			p=new Customer("Ashley", "Sao jose de arial", "C101", 4);
		}
		else {
			System.out.println("Invalid entry");
		}
		if (ptype!=null) {
			p.display();
		}
	}
}
class Person{
	String name;
	String address;
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	protected void display() {
		System.out.println(name);
		System.out.println(address);
	}
} 
class Employee extends Person{
	String eid;
	int sal;
	public Employee(String name, String address, String eid, int sal) {
		super(name, address);
		this.eid = eid;
		this.sal = sal;
	}
	public void display() {
		super.display();
		System.out.println(eid);
		System.out.println(sal);
	}
}
class Customer extends Person{
	String cid;
	int rating;
	public Customer(String name, String address, String cid, int rating) {
		super(name, address);
		this.cid = cid;
		this.rating = rating;
	}
	public void display() {
		super.display();
		System.out.println(cid);
		System.out.println(rating);

	}
}