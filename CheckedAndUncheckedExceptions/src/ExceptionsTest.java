import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionsTest te=null;
		try {
			te.display();
		}
		catch(NullPointerException ne) {
			System.out.println(ne.getMessage());
			te=new ExceptionsTest();
			te.display();
		}
		try {
			FileReader fr= new FileReader("C:\\Users\\Saiprasad V. Anvekar\\Desktop\\New Text Document.txt");
			System.out.println("file found");
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());

			
		}
	}
	public void display() {
		System.out.println("In display");
	}
}
