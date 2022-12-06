
public class AccountTest {
	public static void main(String[] args) {
		 Account a1=new Account(7319,500000);
		 Account a2=new Account(8496,100000);
		 
		 a1.display();
		 a2.display();
		 System.out.println("after deposit");
		 a1.deposit(1000);
		 a1.display();
		 System.out.println("after withdraw");
		 a2.withdraw(5000);
		 a2.display();
		 System.out.println("after transfer");
		 a1.transfer(a2, 5000);
		 a1.display();
		 a2.display();
	}
}
class Account{
	int ano;
	int bal;
	
	public Account(int ano, int bal) {
		// TODO Auto-generated constructor stub
		this.ano=ano;
		this.bal=bal;
	}
	public Account(int ano) {
		this.ano=ano;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.print(ano+"\t");
		System.out.println(bal);
	}
	public void deposit(int amt) {
		bal=bal+amt;
	}
	public void withdraw(int amt) {
		bal=bal-amt;
	}
	public void transfer(Account a, int amt) {
		bal=bal-amt;
		a.deposit(amt);
	}
}