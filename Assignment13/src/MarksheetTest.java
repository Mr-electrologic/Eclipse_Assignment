
public class MarksheetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marksheet s1=new Marksheet();
		s1.setStudentDetails("Saiprsad", "S20402", "TYBSC");
		s1.month();
		s1.year();
		s1.sem();
		s1.getExamInstructions();
		s1.getStudentDetails();
		s1.displayExamDetails();
		s1.displayStudentDetails();
	}

}
interface Exam{
	public default void month() {
		System.out.println("July Month");
	}
	public default void year(){
		System.out.println("2022");
	}
	public default void sem() {
		System.out.println("Sem V");
	}
	public abstract void getExamInstructions();
	public abstract void displayExamDetails();
}
abstract class Student{
	String rollno, name;
	String Class;
	
	public Student() {
	}
	public void setStudentDetails(String r, String n, String c){
		rollno=r;
		name=n;
		Class=c;
	}
	public abstract void getStudentDetails();
	public abstract void displayStudentDetails();
}
class Marksheet extends Student implements Exam{

	@Override
	public void getExamInstructions() {
		// TODO Auto-generated method stub
		System.out.println("Displaying Exam Instructions");
	}

	@Override
	public void displayExamDetails() {
		// TODO Auto-generated method stub
		System.out.println("Displaying Exam Details");

	}	
	@Override
	public void displayStudentDetails() {
		// TODO Auto-generated method stub
		System.out.println("Displaying Student details");
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(Class);

	}

	@Override
	public void getStudentDetails() {
		// TODO Auto-generated method stub
		return;
	}
	
}