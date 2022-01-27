package arrayprograming;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapdemo {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		
		map.put(9, "sameena");
		map.put(7, "prince");
		map.put(3, "akshita");
	
		
		System.out.println(map);
		
		System.out.println(map.containsKey(3));
		
		System.out.println("get value of key 2: "+map.get(2));
		
		for(Map.Entry entry :map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
