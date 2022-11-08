
public class PaperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paper P1 = new Paper();
		P1.paperDetails("C1","CS","TYBSc",20,3);
		Paper P2 = new Paper();
		P2.paperDetails("B1","Botany","SYBSc");
		P1.display();
		P2.display();
	}
}
class Paper{
	String Pcode;
	String Pname;
	String Classname;
	int Maxmrks;
	int Minmrks;
	
public void paperDetails (String pc, String pn, String cn,int max, int min) {
		Pcode=pc;
		Pname=pn;
		Classname=cn;
		Maxmrks=max;
		Minmrks=min;
	}
public void paperDetails (String pc, String pn, String cn) {
	Pcode=pc;
	Pname=pn;
	Classname=cn;
}
public void display() {
	// TODO Auto-generated method stub
	if (Pcode!=null){
		System.out.println(Pcode);
		}
	if (Pname!=null){
		System.out.println(Pname);
	}
	if (Classname!=null){
		System.out.println(Classname);
	}
		if(Maxmrks!=0){
		System.out.println(Maxmrks);
	}
		if(Minmrks!=0){
		System.out.println(Minmrks);
	}
}
public Paper () {
	}
}