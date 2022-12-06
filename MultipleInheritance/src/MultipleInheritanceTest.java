
public class MultipleInheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comm c1=new Comm();
		c1.call();
		c1.chat();
		c1.sms();
		
	}

}
interface Internet{
	public void chat();
	public default void call() {
		System.out.println("com through internet");
	}
}
interface Telecom{
	public void sms();
	public default void call() {
		System.out.println("Com through telecom");
	}
}
class Comm implements Internet,Telecom{

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("Sending sms");
	}

	@Override
	public void chat() {
		// TODO Auto-generated method stub
		System.out.println("Sending chat");
	}
	public void call() {
		Internet.super.call();
		Telecom.super.call();
	}
}
