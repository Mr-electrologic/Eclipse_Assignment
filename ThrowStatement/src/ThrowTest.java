
public class ThrowTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			compute(8);
			compute(100);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
public static void compute(int i) throws Exception{
	if (i<10) {
		System.out.println("normal execution");
	}
	else {
		throw new Exception("error due to "+i);
	}
}
}