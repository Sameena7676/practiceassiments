package arrayprograming;
import java.util.TreeSet;
public class TreeSetDemo {
	
   public static void main(String[] args) {
		
		TreeSet<String> set= new TreeSet<String>();
		
		set.add("aesha");
		set.add("user");
		set.add("pooja");
		set.add("kruti");
		
		System.out.println(set);
		
		set.add("kruti");
		
		System.out.println(set);
		
		System.out.println("Is Empty: "+set.isEmpty());
		
		set.remove("kruti");
		
		System.out.println("Size: "+set.size());
		
	}
}