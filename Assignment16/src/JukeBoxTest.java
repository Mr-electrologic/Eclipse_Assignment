import java.util.LinkedList;

public class JukeBoxTest {
	public static void main(String[] args) {
		JukeBox j1=new JukeBox("Alone", "Alan Walker", "Jazz");
		JukeBox j2=new JukeBox("Lily", "K390", "Soft");
		JukeBox j3=new JukeBox("Perfect", "Ed Sheren", "Soft");
		JukeBox j4=new JukeBox("You", "Atif Aslam", "Classical");
		JukeBox j5=new JukeBox("Lean On", "DJ Snake", "Rock");
		JukeBox j6=new JukeBox("At My Worst", "Kehlani", "Soft");
		System.out.println("All added songs");
		j1.display();
		j2.display();
		j3.display();
		j4.display();
		j5.display();
		j6.display();
		
		LinkedList<String> c= new LinkedList<String>();
		c.add(j1.getSongDetails());
		c.add(j2.getSongDetails());
		c.add(j3.getSongDetails());
		c.addFirst(j4.getSongDetails());
		c.addLast(j5.getSongDetails());
		c.add(2,j6.getSongDetails());
		c.remove(j3.getSongDetails());
		System.out.println("all songs in list after edit:\n"+c);
		System.out.println("now playin:"+j2.getSongDetails());
	}
}
class JukeBox{
	String sname,singer,genre;

	public JukeBox(String sname, String singer, String genre) {
		this.sname = sname;
		this.singer = singer;
		this.genre = genre;
	}

	public String getSongDetails() {
		return sname+"="+singer+"="+genre;
	}
	public void display() {
		System.out.println(sname+"="+singer+"="+genre);
	}
}