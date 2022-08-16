package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InsertTheValue {
	public static void main (String[]args) {
		//Insert name and ages
		HashMap<String,Integer> map=new HashMap();
		map.put("Sumit", 22);
		map.put("Amit", 25);
		map.put("Ankit", 27);
		map.put("Harsh", 19);
		map.put("Aastha", 18);
		System.out.println(map);
		
		map.get("Amit");
		System.out.println(map.get("Amit"));//exists
		System.out.println(map.get("aman"));//doesnt exist value
		
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		System.out.println();
		
		Set<String> keys=map.keySet();
		for(String key: keys) {
			System.out.println(key+" "+map.get(key));
		}
		
	}
	
		
	}


