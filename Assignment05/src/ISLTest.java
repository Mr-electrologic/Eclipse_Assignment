public class ISLTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISLClub i1=new ISLClub("FC Goa");
		ISLCoach c1=new ISLCoach("Pranav","India",21);
		i1.setDetails("Goa",c1);
		System.out.println("Club Details");
		i1.display();
		System.out.println("Coach Details");
		c1.display();
	}
}
class ISLClub{
	String name;
	String location;
	ISLCoach coach;
	
	public ISLClub(String name) {
		this.name = name;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(name);
		System.out.println(location);		
	}
	public void setDetails(String loc, ISLCoach coach) {
		// TODO Auto-generated method stub
		location=loc;
		this.coach=coach;
		
	}

	public ISLClub(String name, String location, ISLCoach coach) {
		this.name = name;
		this.location = location;
		this.coach = coach;
	}
	
}
class ISLCoach {
	String coachname;
	String country;
	int age;
	public ISLCoach(String coachname, String country, int age) {
		this.coachname = coachname;
		this.country = country;
		this.age = age;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(coachname);
		System.out.println(country);
		System.out.println(age);
	}
}
