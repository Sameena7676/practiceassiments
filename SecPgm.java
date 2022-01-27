package arrayprograming;

import java.util.HashMap;
import java.util.Map.Entry;

public class SecPgm {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(1, "sammy");
		map.put(2, "Pinky");
		map.put(3, "Arun");
		map.put(4, null);
		map.put(null, "test");
		
		System.out.println(map);
		
		System.out.println(map.containsKey(3));
		
		System.out.println("get value of key 2: "+map.get(2));
		
		for(Entry<Integer, String> entry :map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
