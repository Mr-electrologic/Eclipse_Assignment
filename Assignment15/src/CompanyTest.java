import java.util.ArrayList;
import java.util.Collections;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Department>dept= new ArrayList<Department>();
		dept.add(new Department("Production",11));
		dept.add(new Department("HR",20));
		dept.add(new Department("Sales",26));
		dept.add(new Department("Advertisement",07));
		dept.add(new Department("Accounts",13));
		System.out.println("Unsorted  Depts.");
		for(Department e:dept) {
			System.out.println(e);
		}
		//dept.sort();
		Collections.sort(dept,Collections.reverseOrder());
		System.out.println("\nSorted Depts.");
		for(Department e:dept) {
			System.out.println(e);
		}
}
}


class Department implements Comparable<Department>{
	String dname;
	int dno;
	public Department(String dname,int dno) {
		// TODO Auto-generated constructor stub
		this.dname=dname;
		this.dno=dno;
	}
	public String toString() {
		return dname+":"+dno;
		
	}
	@Override
	public int compareTo(Department argO) {
		// TODO Auto-generated method stub
		return (this.dno-argO.dno);

	}
	public void display() {
		System.out.println(dname);
		System.out.println(dno);

	}
}