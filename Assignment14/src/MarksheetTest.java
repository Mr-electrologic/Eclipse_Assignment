import java.util.HashMap;
import java.util.Map;

public class MarksheetTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> b=new HashMap<String, Integer>();
		Student s1=new Student(44, 47, 40, 48, 44);
		s1.setName("Saiprasad");
		Student s2=new Student(43, 45, 46, 47, 41);
		s2.setName("sanjana");
		Student s3=new Student(34, 42, 35, 38, 37);
		s3.setName("simran");
		Student s4=new Student(34, 37, 40, 38, 41);
		s4.setName("saish");
		b.put(s1.name(), s1.Total());
		b.put(s2.name(), s2.Total());
		b.put(s3.name(), s3.Total());
		b.put(s4.name(), s4.Total());
		System.out.println("Name of student and total marks scored");
		System.out.println(b);
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		String key="saish";
		if((key)!=null) {
			System.out.println(key+":"+b.get(key));
			}
		else {
			System.out.println("not found");
		}
	}
}
interface StudentDetails{
	public abstract int Total();
	public abstract String name();
}
class Student implements StudentDetails{
	int oops,se,nw,hci,es;
	int total;
	String name;
	
	public Student(int oops, int se, int nw, int hci, int es) {
		this.oops = oops;
		this.se = se;
		this.nw = nw;
		this.hci = hci;
		this.es = es;
	}
	public void setName(String n) {
		name=n;
	}
	public void display() {
		System.out.println("\n"+name());
		System.out.println("OOPs:"+oops);
		System.out.println("Software Engineering:"+se);
		System.out.println("Networking:"+nw);
		System.out.println("Embedded System:"+es);
		System.out.println("HCI:"+hci);

	}
	@Override
	public int Total() {
		// TODO Auto-generated method stub
		return total=oops+se+nw+hci+es;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return name;
	}
	
}