
public class ActivityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InternalActivity i1= new InternalActivity("Ckt-01", "Cricket");
		i1.setDetails("Ashley Sir");
		i1.display();
		ExternalActivity e1=new ExternalActivity("Fbl-01", "Football");
		e1.setDetails("DBCE");
		e1.display();
	}
}
class Activity{
	protected String Activity_code;
	protected String Activity_name;

	protected Activity(String ac,String an) {
		Activity_code=ac;
		Activity_name=an;
	}
	protected void setDetails() {
		
	}
	public void display() {
		System.out.println(Activity_code);
		System.out.println(Activity_name);
	}
}
class InternalActivity extends Activity{
		protected String person_incharge;
		
		protected InternalActivity(String ac, String an) {
			super(ac, an);
		}
		protected void setDetails(String pi) {
			// TODO Auto-generated method stub
			
			person_incharge=pi;
		}

		@Override
		public void display() {
			// TODO Auto-generated method stub
			super.display();
			System.out.println(person_incharge);
		}	
}
class ExternalActivity extends Activity{
	protected String collegename;
	
	protected ExternalActivity(String ac, String an) {
		super(ac, an);

	}

	protected void setDetails(String cn) {
		// TODO Auto-generated method stub
		collegename=cn;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println(collegename);
	}	
}