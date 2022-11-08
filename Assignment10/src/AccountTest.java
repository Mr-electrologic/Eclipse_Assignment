import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("For savings account press 'S' and for fixed account 'F' ");
		String atype=sc.nextLine();
		if (atype.equalsIgnoreCase("S")||(atype.equalsIgnoreCase("s"))){
			a=new SavingsAccount("Saiprasad", 1808, 5);
		}
		else if(atype.equalsIgnoreCase("F")||(atype.equalsIgnoreCase("f"))) {
			a=new FixedAccount("Ashley",1809,5,2);
		}
		else {
			System.out.println("Invalid entry");
		}
		if (a!=null) {
			a.display();
		}
		}
}
class Account{
	String name;
	int acno;
	public Account(String name, int acno) {
		this.name = name;
		this.acno = acno;
	}
	public void display() {
		System.out.println(name);
		System.out.println(acno);
	}
}
class SavingsAccount extends Account{
	int intrest;

	public SavingsAccount(String name, int acno, int intrest) {
		super(name, acno);
		this.intrest = intrest;
	}
	
	public void display() {
		super.display();
		System.out.println(intrest+"%");
	}
}
class FixedAccount extends Account{
	int intrest;
	int years;
	public FixedAccount(String name, int acno,int intrest, int years) {
		super(name, acno);
		this.intrest = intrest;
		this.years = years;

	}
	public int getIntrest() {
		return (intrest*years);
	}
	public void display() {
		super.display();
		System.out.println(getIntrest()+"%");
	}
}