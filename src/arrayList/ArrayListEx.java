package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//add elements
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		//get elements, we need to pass the index number, then it will return the value in that index number
		int element=list.get(3);
		System.out.println(element); // in 3rd index number, we have 3 value.
		
		//to add elements in middle.
		list.add(1,2); //here 1-> index, 2-> the number we r changing.
		System.out.println(list); //2 is adde
		
		//set element
		list.set(2,6);  //2-> index element, 6->the value
		System.out.println(list);  //in index 2, 6 is set
		
		//delete 
		list.remove(2); //index must be given
		System.out.println(list); //hence 6 is removed
		
		//to get the total number of elements
		int size= list.size();
		System.out.println(size);//4
		
		//loops
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		
		//to sort list
		Collections.sort(list);
		System.out.println(list);
	}

}
