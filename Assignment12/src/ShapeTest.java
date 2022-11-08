
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle();
		r1.area(4.5, 2.4);
		r1.perimeter(4.5, 2.4);
		r1.display();
		Triangle t1=new Triangle();
		t1.area(4.5, 2.4);
		t1.perimeter(4.5,2.4);
		t1.display();
		
	}
}
interface GeomFigure{
	public abstract void area(double l, double b);
	public abstract void perimeter(double l, double b);

}
class Rectangle implements GeomFigure{
	float area,perimeter;
	
	public Rectangle() {
	}
	
	public void display() {
		System.out.println("Area and perimeter of Rectangle");
		System.out.println(area);
		System.out.println(perimeter);

	}

	@Override
	public void area(double l, double b) {
		// TODO Auto-generated method stub
		area=(float) (l*b);
	}

	@Override
	public void perimeter(double l, double b) {
		// TODO Auto-generated method stub
		perimeter=(float) (2*(l+b));
	}
}
class Triangle implements GeomFigure{
	float area,perimeter;
	public Triangle() {
	}
	@Override
	public void area(double l, double b) {
		// TODO Auto-generated method stub
		area=(float) (0.5*(l*b));
	}
	@Override
	public void perimeter(double l, double b) {
		// TODO Auto-generated method stub
		perimeter=(float) (3*b);
	}
	public void display() {
		System.out.println("Area and perimeter of Triangle");
		System.out.println(area);
		System.out.println(perimeter);
	}
}