
public class FacultyTest {
		public static void main(String[] args) {
			Regular r1= new Regular("Saiprasad", "Curchorem", 65000, 1000);
			r1.computeTotal();
			r1.display();
			LectureBasis l1= new LectureBasis("Sanjana", "Mumbai", 10);
			l1.computeAmt();
			l1.display();
		}
}
class Faculty{
	String fname;
	String address;
	public Faculty(String fname, String address) {
		this.fname = fname;
		this.address = address;
	}
}
class Regular extends Faculty{
	int da;
	int basic;
	int total;
	public Regular(String fname, String address, int da, int basic) {
		super(fname, address);
		this.da = da;
		this.basic = basic;	}
	public void computeTotal() {
		total=da+basic;
	}
	public void display() {
		System.out.println(fname);
		System.out.println(address);
		System.out.println(basic);
		System.out.println(da);
		System.out.println(total);

	}
}
class LectureBasis extends Faculty{
	int nolecs;
	int conamt;
	private static final int stipend=500;
	public LectureBasis(String fname, String address, int nolecs) {
		super(fname, address);
		this.nolecs = nolecs;
	}
	public static int getStipend() {
		return stipend;
	}
	public void computeAmt() {
		conamt=nolecs*getStipend();
	}
	public void display() {
		System.out.println(fname);
		System.out.println(address);
		System.out.println(nolecs);
		System.out.println(conamt);
	}
}