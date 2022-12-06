public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			compute(10);
			compute(80);
		}
		catch(MyException e) {
			System.out.println(e);
		}
	}
public static void compute(int i) throws MyException{
	if(i>20) {
		throw new MyException(i);
	}
	else {
		System.out.println("normal exit");
	}
}
public static class MyException extends Exception{
	int i;

	public MyException(int i) {
		this.i = i;
	}
	public String toString() {
		return "Exception"+i;
	}
}
}
