import java.util.Scanner;

public class NestedTryTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the denominator");
		int d=sc.nextInt();
		try {
			int r=20/d;
			try {
				int [] a= {1,2};
				a[4]=5;
			}
			catch(ArrayIndexOutOfBoundsException ab) {
				System.out.println("arra index problem");

			}
			finally {
				System.out.println("in finally");
			}
		}
		catch (Exception ab) {
			System.out.println("outerblock"+ab.getMessage());

		}
		

		
	}
}
