import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List a= new ArrayList();
		a.add("FC Goa");
		a.add("Hydrabad FC");
		a.add("Mumbai City FC");
		a.add("ATK Mohun Bagun");
		a.remove(1);
		a.remove("Mumbai City FC");
		System.out.println(a);
		
		LinkedList c= new LinkedList();
		c.add("argentina");
		c.add("brazil");
		c.add("chile");
		c.addFirst("india");
		c.addLast("japan");
		c.add(2,"nepal");
		System.out.println(c);
		
		Map b=new HashMap();
		b.put("Saiprasad", "402");
		b.put("sanjana", "414");
		b.put("simran", "416");
		b.put("saish", "407");
		b.remove("saish");
		System.out.println(b);
		String key="saish";
		if((key)!=null) {
			System.out.println(b.get(key));
			}
		else {
			System.out.println("not found");

		}
	}

}
