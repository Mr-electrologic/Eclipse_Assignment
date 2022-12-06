
public class AbstractTest {
	public static void main(String[] args) {
		Student S1= new Student("S12-224","pranav kamat","14-dec-2022");
		S1.processMarks();
		S1.display();
	}
}
abstract class marksheet{
	String examcode;
	public marksheet(String ec) {
		examcode=ec;
		}
		public abstract void processMarks();
		public abstract void display();
}
	class Student extends marksheet{
		String roll, name;
		public Student(String n, String r, String ec) {
			super(ec);
			roll=r;
			name=n;
		}
		@Override
		public void processMarks() {
			// TODO Auto-generated method stub
			System.out.println("processing");
		}
		@Override
		public void display() {
			// TODO Auto-generated method stub
			System.out.println("displaying");

		}
		
	}