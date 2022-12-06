
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Saiprasad","S20-402");
		s1.bloodDonation(20);
		s1.nationalDays(10);
		s1.display();
	}
}
interface NSSActivities{
	public static final int ExtraHours=5;
	public abstract void bloodDonation(int hrs);
	public abstract void nationalDays(int hrs);
	
	public default void rules() {
		System.out.println("Rule 1");
	}
} 
class Student implements NSSActivities{
	int totalhrs;
	String name;
	String rno;
	
	public Student(String name, String rno) {
		this.name = name;
		this.rno = rno;
	}

	@Override
	public void bloodDonation(int hrs) {
		// TODO Auto-generated method stub
		totalhrs=totalhrs+hrs;
	}

	@Override
	public void nationalDays(int hrs) {
		// TODO Auto-generated method stub
		totalhrs=totalhrs+hrs;
	}
	public void display() {
		rules();
		if (totalhrs>20) {
			totalhrs=totalhrs+ExtraHours;
			System.out.println(name);
			System.out.println(rno);
			System.out.println(totalhrs);

		}
	}
}