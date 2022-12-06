
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contract e1= new Contract("Saiprasad","Curchorem", "S20402", 40000, "4 years");
		e1.display();
	}
}
class Person{
	protected String name;
	protected String address;
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
}
class Employee extends Person{
	protected String empid;
	protected int salary;
	
	public Employee(String name, String address, String empid, int salary) {
		super(name, address);
		this.empid = empid;
		this.salary = salary;
	}
}
class Contract extends Employee{
	String contractperiod;

	public Contract(String name, String address, String empid, int salary, String contractperiod) {
		super(name, address, empid, salary);
		this.contractperiod = contractperiod;
	}
	public void display() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(empid);
		System.out.println(salary);
		System.out.println(contractperiod);

	}
}