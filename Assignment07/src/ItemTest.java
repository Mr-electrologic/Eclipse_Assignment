import java.util.Scanner;

public class ItemTest {
	public static void main(String [] args) {
		int i=3;
		Item[] A1 = new Item[i];
		Item[] A2 = new Item[i];
		Item[] A3 = new Item[i];
		 
		Invoice[] B= new Invoice[i];
		
		A1[0] = new Item(20,"a1");
		A1[1] = new Item(35,"a2");
		A1[2] = new Item(23.4,"a3");
		
		A2[0] = new Item(33,"a4");
		A2[1] = new Item(17,"a5");
		A2[2] = new Item(24.4,"a6");
		
		A3[0] = new Item(33,"a4");
		A3[1] = new Item(17,"a5");
		A3[2] = new Item(24.4,"a6");
		
		B[0] = new Invoice(A1,"I1");
		B[1] = new Invoice(A2,"I2");
		B[2] = new Invoice(A3,"I3");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Invoive no. to be searched:");
		String c= sc.nextLine();
		Invoice searchedInvoice=Invoice.search(B,c);
		if (searchedInvoice!=null) 
			searchedInvoice.display();
		else
			System.out.println("not found");
}
}
class Item {
	float price;
	String code;
	public Item(double d, String code) {
		this.price =(float) d;
		this.code = code;
	}
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public float getPrice() {
		return price;
	}

	public void display() {
		System.out.println("Item code:"+code);
	}
}
class Invoice{
	public static String store_name = "Sai Shop";
	Item[] i;
	String Invoice_no;
	int amt;
	
	public Invoice(Item[] i, String invoice_no) {
		this.i = i;
		Invoice_no = invoice_no;
	}

	public static void setStore_name(String store_name) {
		Invoice.store_name = store_name;
	}
	public static  Invoice search(Invoice [] inv ,String i_no){
		//display();
		for(int i=0;i<inv.length;i++) {
			
			 
			if(inv[i].Invoice_no.equalsIgnoreCase(i_no))  
				return inv[i];
				//break;
		}
			return null;
		 
		
	}
	public void display() {
		System.out.println("Store name:"+store_name);
		System.out.println("Invoice no:"+Invoice_no);
		for (Item a:i) {
			a.display();
			amt=(int) (amt+a.getPrice());
		}
		System.out.println("Total amount:"+amt);
	}
}
