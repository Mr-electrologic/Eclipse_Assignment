import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(20);
		nums.add(12);
		nums.add(23);
		nums.add(05);
		
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
		nums.sort(null);
		System.out.println("Sorted");
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
		Collections.reverse(nums);
		System.out.println("Reversed");
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
		System.out.println("Names");
		
		ArrayList<String>names= new ArrayList<String>();
		names.add("Saiprasad");
		names.add("Sanjana");
		names.add("Simran");
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
		ArrayList<Employee>emps= new ArrayList<Employee>();
		emps.add(new Employee("Ashley",22));
		emps.add(new Employee("Allan",20));
		emps.add(new Employee("Andre",21));
		for(Employee e:emps) {
			System.out.println(e);
		}
		emps.sort(null);
		System.out.println("Sorted Emps");
		for(Employee e:emps) {
			System.out.println(e);
		}
	}
}
class Employee implements Comparable<Employee>{
	private String ename;
	private int age;
	public Employee(String ename, int age) {
		this.ename = ename;
		this.age = age;
	}
	public String toString() {
		return (ename+age);
		
	}
	@Override
	public int compareTo(Employee argO) {
		// TODO Auto-generated method stub
		return (this.age-argO.age);
	}
	
}