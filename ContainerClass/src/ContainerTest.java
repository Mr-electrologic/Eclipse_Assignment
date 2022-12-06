
public class ContainerTest {
	public static void main(String[] args) {
		System.out.println("add"+Container.add(3,4));
		System.out.println("mul"+Container.mul(3,4));
		System.out.println("sqrt"+Container.sqrt(20));

	}
}
class Container{
	public static int add(int x,int y) {
		return(x+y);
	}
	public static int mul(int x,int y) {
		return(x*y);
	}
	public static double sqrt(double x){
		return(Math.round(Math.sqrt(x)*100.0)/100.0);
	}
	
}