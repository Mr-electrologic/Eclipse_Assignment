
public class CustomerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Customer c1= new Customer();
		c1.setCustid ("C-1");
		c1.setName ("sann");
		c1.setRating (4);
		c1.display();
	}
		
	}
class Customer{
	private String Custid;
	private String Name;
	private int Rating;
	public String getCustid() {
		return Custid;
	}
	public void setCustid(String custid) {
		Custid = custid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		Rating = rating;
	}
	
public void display() {
	System.out.println(Custid);
	System.out.println(Name);
	System.out.println(Rating);

}
}