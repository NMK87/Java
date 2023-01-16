package collections;

import java.util.LinkedList;

public class LinkedLists {
	
	public static void main(String[] args) {
		
		LinkedList<String> newList = new LinkedList();
		
		//adding elements
		newList.add("neha");
		newList.add("ammu");
		newList.add("sanju");
		newList.add("aman");
		newList.add(2,"appu");
		
		System.out.println(newList);
		
		//changing of elements
		
		System.out.println("after changing");
		newList.set(1, "anu");
		System.out.println(newList);
		
		//remove 
		newList.remove(2);
		System.out.println("after removing");
		newList.remove("neha");
		System.out.println(newList);
		
		//iterating using for
		for(int i =0; i<newList.size(); i++) {
			System.out.println(newList.get(i));
		}
		
		//iterating using for loop.
		for(String str : newList) {
			System.out.println(str + " ");
		}
		
		
	}

}
