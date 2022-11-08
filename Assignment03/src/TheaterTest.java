
public class TheaterTest {
	public static void main(String[] args) {
		
		int i=3;
		Theater[] t1=new Theater[i];
		
		t1[0]= new Theater("Inox","KTC",1000,5);
		t1[1]= new Theater("Vishant","Margao",500,2.5);
		t1[2]= new Theater();
		t1[2].setTname("Inox");
		t1[2].setTlocation("Panjim");
		t1[2].setCapacity(1500);
		t1[2].setRating(4.8);

		for(i=0;i<t1.length;i++) {
			t1[i].display();
		}
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
