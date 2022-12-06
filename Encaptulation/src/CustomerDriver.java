
public class CustomerDriver {
	public static void main (String[] args) {
		
	
		Customer C1= new Customer();
		C1.setDetails();
		C1.display();
		Customer C2= new Customer();
		C2.setDetails("S1","sanj",5);
		C2.display();
	}
}
	class Customer{
		private String cid;
		private String name;
		int rating;
		public void setDetails() {
			cid="S2";
			name="sai";
			rating=2;
		}
		public void setDetails(String cid, String name, int rat) {
			// TODO Auto-generated method stub
			this.cid=cid;
			this.name=name;
			rating=rat;
			
		}

		public void display() {
			// TODO Auto-generated method stub
			System.out.println(cid);
			System.out.println(name);
			System.out.println(rating);
		}
	}
