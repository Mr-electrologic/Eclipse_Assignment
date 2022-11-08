
public class TheaterTest {
	public static void main(String[] args) {		
		Theater t1= new Theater("Inox G-wing","KTC",1000,4.3);
		Theater t2= new Theater("Vishant","Margao",500,2.5);
		Theater t3= new Theater();
		t3.setTname("Niagara");
		t3.setTlocation("Curchorem");
		t3.setCapacity(1500);
		t3.setRating(4.7);
		t1.display();
		t2.display();
		t3.display();
}
}
class Theater{
	String Tname;
	String Tlocation;
	int Capacity;
	float Rating;
	
	public Theater() {
	}
	public Theater(String tname, String tlocation, int capacity, double d) {
		Tname = tname;
		Tlocation = tlocation;
		Capacity = capacity;
		Rating = (float) d;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(Tname);
		System.out.println(Tlocation);
		System.out.println(Capacity);
		System.out.println(Rating);

	}
	public Theater(String tname, String tlocation) {
		Tname = tname;
		Tlocation = tlocation;
	}
	public Theater(String tname) {
		Tname = tname;
	}

	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public String getTlocation() {
		return Tlocation;
	}
	public void setTlocation(String tlocation) {
		Tlocation = tlocation;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	public float getRating() {
		return Rating;
	}
	public void setRating(double d) {
		Rating = (float) d;
	}
}
