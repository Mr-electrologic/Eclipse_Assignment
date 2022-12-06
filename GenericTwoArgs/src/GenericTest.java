public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee<String,Integer> e1=new Employee<String,Integer>("Sarah",21);
		Employee<String,String> e2=new Employee<String,String>("Shrutik","Margao");
		e1.display();
		e2.display();
	}

}
 class Employee<T,U>{
	 T val1;
	 U val2;
	public Employee(T val1, U val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	 public void display() {
		 System.out.println(val1);
		 System.out.println(val2);

	 }
 }