
public class LocationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Location SourceLocation= new Location(0, 0);
		Location DestLocation= new Location(1,3);
		System.out.println("Before Moving");
		System.out.println("Source Location");
		SourceLocation.display();
		System.out.println("Dest Location");
		DestLocation.display();
		SourceLocation.moveTo(DestLocation);
		System.out.println("After Moving");
		System.out.println("Source Location");
		SourceLocation.display();
		System.out.println("Dest Location");
		DestLocation.display();
	}

}
class Location{
	int xposition;
	int yposition;
	
	public Location(int xposition, int yposition) {
		this.xposition = xposition;
		this.yposition = yposition;
	}
	public int get_x() {
		return xposition; 
	}
	public int get_y() {
		return yposition; 
		 
	}
	public void moveTo(Location a) {
		xposition=a.get_x();
		yposition=a.get_y();
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("X="+xposition);
		System.out.println("Y="+yposition);
	}

}