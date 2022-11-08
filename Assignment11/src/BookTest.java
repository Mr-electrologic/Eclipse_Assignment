
public class BookTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fiction B1= new Fiction("B1");
		B1.getBookDetails("Lord of Rings","JRRT","F",567);
		B1.displayBookDetails();
		NonFiction B2= new NonFiction("B2");
		B2.getBookDetails("The Godfather","MP","NF",222);
		B2.displayBookDetails();
	}
}
abstract class Book{
	String booktype;
	public Book(String t) {
		booktype=t;
	}
	public abstract void displayBookDetails();
}
class Fiction extends Book{
	 	String t;
		String bid, name, publisher;
		int pagenos;
	public Fiction(String t) {
		super(t);
		
	}
	public void getBookDetails(String bid, String n, String p,int pno) {
		// TODO Auto-generated method stub
		System.out.println("geting details");
		this.bid=bid;
		name=n;
		publisher=p;
		pagenos=pno;
	}
	@Override
	public void displayBookDetails() {
		// TODO Auto-generated method stub
		System.out.println(bid);
		System.out.println(name);
		System.out.println(publisher);
		System.out.println(pagenos);
		System.out.println(booktype);


	}  
}
class NonFiction extends Book{
	String t;
	String bid, name, publisher;
	int pagenos;
public NonFiction(String t) {
	super(t);
}
public void getBookDetails(String bid, String n, String p,int pno) {
	// TODO Auto-generated method stub
	System.out.println("geting details");
	this.bid=bid;
	name=n;
	publisher=p;
	pagenos=pno;
}
@Override
public void displayBookDetails() {
	// TODO Auto-generated method stub
	System.out.println(bid);
	System.out.println(name);
	System.out.println(publisher);
	System.out.println(pagenos);
	System.out.println(booktype);

}
}