package inheritance;

public class TestAggregation {
public static void main(String[] args) {
		
		Address address1=new Address("davanagere","karnataka", 307282);
		
		Student st1=new Student(1,"sameena ","sameena@gmail.com", address1);
		
		st1.display();
	}

}
