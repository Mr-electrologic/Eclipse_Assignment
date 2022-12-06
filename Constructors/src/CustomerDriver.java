
public class CustomerDriver {
public static void main(String[] args) {
	Customer c2=new Customer("r2","sp","curchorem");
	c2.setRating(5);
	c2.display();
}
	
}
class Customer{
	String Custid;
	String Name;
	String place;
	int Rating;
	
public Customer (String cid, String name, String Place) {
	Custid=cid;
	Name=name;
	place=Place;
}
public void setRating(int r) {
	Rating=r;
}
public void display() {
	System.out.println(Custid);
	System.out.println(Name);
	System.out.println(place);
	System.out.println(Rating);

}
}