package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		//values--> put
		map.put("abc", 1);
		map.put("def", 2);
		map.put("ghi", 3);
		
		//when key is giving same hashcode. then it stores 2 values in same block of node ie Linked List
		map.put("FB", 4);
		map.put("Ea", 5);
		
		System.out.println(map);
	}

}
