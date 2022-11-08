import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac1=new Account("1023");
		ac1.setBalance(1567.98);
		ac1.display();
		Account ac2=new Account();
		ac2.setAccno("1024");
		ac2.setBalance(3999.99);
		ac2.display();
		Account ac3=new Account("1025",5000);
		ac3.display();
		int i=2;
		Account[] ac=new Account[i];
		ac[0]=new Account("1013",10000);
		ac[1]=new Account("1019",20000);
		for(i=0;i<ac.length;i++) {
		ac[i].display();
		System.out.println("after deposit");
		 ac1.deposit(1000);
		 ac1.display();
		 System.out.println("after withdraw");
		 ac2.withdraw(500);
		 ac2.display();
		 System.out.println("after transfer");
		 ac1.transfer(ac2, 500);
		 ac1.display();
		 ac2.display();
	}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account no. to be searched:");
		String c= sc.nextLine();
		Account searchedAccount=Account.search(ac,c);
		if (searchedAccount!=null) {
			searchedAccount.display();
		}
		else
			System.out.println("not found");
}
}
class Account{
	private static final String Bank_name ="BANK-OF-QUEPEM";
	String accno;
	float balance;
	
	public Account(String accno) {
		this.accno = accno;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(Bank_name);
		System.out.println(accno);
		System.out.println(balance);
	}
	public Account(String accno, float balance) {
		this.accno = accno;
		this.balance = balance;
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(double d) {
		this.balance = (float) d;
	}
	public String getBank_name() {
		return Bank_name;
	}
	public static  Account search(Account[] ac ,String ac_no){
		for(int i=0;i<ac.length;i++) {
			
			if(ac[i].accno.equalsIgnoreCase(ac_no))  
				return ac[i];
		}
			return null;
	}
	public void deposit(int amt) {
		balance=balance+amt;
	}
	public void withdraw(int amt) {
		balance=balance-amt;
	}
	public void transfer(Account a, int amt) {
		balance=balance-amt;
		a.deposit(amt);
	}
}