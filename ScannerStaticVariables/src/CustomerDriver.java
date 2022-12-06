import java.util.Scanner;

public class CustomerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer("C1","Sanjana",5);
		Customer c2=new Customer();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		String cid=sc.nextLine();
		c2.setCid(cid);
		System.out.println("enter name");
		String cname=sc.nextLine();
		c2.setCname(cname);
		System.out.println("enter rating");
		int rating=sc.nextInt();
		c2.setRating(rating);
		c1.display();
		c2.display();
		System.out.println("count="+Customer.getCount());
	}

}

class Customer {
	String cid;
	String cname;
	int rating;
	static int count;
	
	public Customer(String cid, String name, int rating) {
		this.cid=cid;
		cname=name;
		this.rating=rating;
		count++;
	}
	public Customer() {
		count++;
	}

	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(cid);
		System.out.println(cname);
		System.out.println(rating);

	}
	public static int getCount() {
		return count;
	}

}
