 
public class ItemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i1=new Item(101,"lenovo laptop",(float) 44990.99);
		i1.display();
		Item i2=new Item();
		i2.display();
		Item i3=new Item();
		i3.setItemcode(103);
		i3.setItemname("HP laptop");
		i3.setPrice(55999.99);
		i3.display();
	}
}
class Item{
	String itemname;
	int itemcode;
	float price;

	public Item(int icode, String iname,float price) {
		itemcode=icode;
		itemname=iname;
		this.price=price;
		
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public int getItemcode() {
		return itemcode;
	}

	public void setItemcode(int itemcode) {
		this.itemcode = itemcode;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(double d) {
		this.price = (float) d;
	}

	public Item() {
		// TODO Auto-generated constructor stub
		itemname="Dell laptop";
		itemcode=102;
		price=(float) 49999.99;
		
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println(itemcode);
		System.out.println(itemname);
		System.out.println(price);

	}
}
