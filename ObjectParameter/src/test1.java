
public class test1 {
  public static void main(String [] args) {
	  m1 a=new m1(10,12);
	  display d = new display();
	  d.dis(a.sum());
  }
}

class m1{
	
	public m1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int a,b;
	public int sum() {
		return(a+b);
	}
}

class display{
	
	public void dis(int A) {
		
		System.out.println(A);
	}
	
}