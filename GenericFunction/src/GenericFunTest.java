import java.util.ArrayList;

public class GenericFunTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<String> names=new ArrayList<String>();
		names.add("Saiprasad");
		names.add("Sania");
		names.add("Sanjana");
		
		String name1=(String)names.get(0);
		String name2=(String)names.get(1);
		String name3=(String)names.get(2);*/
		String [] names=new String[5];
		names[0]="Saiprasad";
		names[1]="hdfhfd";
		names[2]="hgjg"; 
		names[3]="jhj";
		names[4]="ssss";
		printArray(names);
	}
public static <E> void printArray(E[] array) {
	for(E ele: array) {
		System.out.println(ele);
	}
}
}
class Student{
	String name;
	int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return(name+"-" + age);
	}
}