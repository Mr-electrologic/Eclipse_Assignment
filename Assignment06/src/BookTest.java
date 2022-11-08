
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book("Moonlight","English");
		Publisher p1=new Publisher("US Publication", "+01 887 7319");
		
		int i=2;
		Author[] a1=new Author[i];
		a1[0]=new Author("JK Dowling","+01 556 7787","California");
		a1[1]=new Author("Robert James","+01 521 8513","Texas");
		b1.setDetails(p1, a1);
		System.out.println("Book Details");
		b1.display();
		System.out.println("Publisher Details");
		p1.display();
		System.out.println("Author Details");
		//for(Author e:a1) {
		//	e.display();
		//}
		for(i=0;i<a1.length;i++) {
			a1[i].display();
		}
	}
}
class Book{
	String bookname;
	String subject;
	Publisher publisher;
	Author authors[];
	
	public Book(String bookname, String subject) {
		this.bookname = bookname;
		this.subject = subject;

	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(bookname);
		System.out.println(subject);
	}
	public void setDetails(Publisher p, Author a[]) {
		publisher = p;
		authors = a;
	}
	
	
}
class Publisher{
	String pname;
	String telephone;
	public Publisher(String pname, String telephone) {
		this.pname = pname;
		this.telephone = telephone;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(pname);
		System.out.println(telephone);
	}
	
}
class Author{
	String aname;
	String telephone;
	String address;
	public Author(String n, String t, String a) {
		// TODO Auto-generated constructor stub
		aname=n;
		telephone=t;
		address=a;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(aname);
		System.out.println(telephone);
		System.out.println(address);

	}
}