
public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempEmp t1= new TempEmp("Saiprasad","S20402", 400000, 5000);
		t1.display();
		TempEmp t2= new TempEmp(450000,10000);
		t2.setDetails("Bangad Billa", "S20414");
		t2.display();
	}
}
class Employee{
	protected String id;
	protected String name;
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}
	protected void setDetails(String n,String id) {
		name=n;
		this.id=id;
	}
	public Employee() {
		System.out.println("in parent class");
	}
	protected void display() {
		System.out.println(name);
		System.out.println(id);
	}
}
class TempEmp extends Employee{
	int salary;
	int bonus;
	public TempEmp(String id, String name, int salary, int bonus) {
		super(id, name);
		this.salary = salary;
		this.bonus = bonus;
	}
	public TempEmp(int salary, int bonus) {
		this.salary = salary;
		this.bonus = bonus;
	}
	public void display() {
		super.display();
		System.out.println(salary);
		System.out.println(bonus);
		}
	
}