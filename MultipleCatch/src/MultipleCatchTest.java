import java.util.Scanner;

public class MultipleCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
			int d=sc.nextInt();
			try {
				int r=10/d;
				int[] a= {1,2,3};
				a[5]=10;
			
	}
	catch(ArithmeticException ae) {
		System.out.println(ae.getMessage());
	}
	catch(ArrayIndexOutOfBoundsException ab) {
		System.out.println("index out of bounds 21"+ab.getMessage());

		}
	}
}
