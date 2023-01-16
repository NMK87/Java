package collections;

import java.util.Scanner;

public class ArrayIpOp {
	public static void main(String[] args) {
	
		//dcelare array
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		int[] a = new int[size];
	
		//input array
		for(int i=0; i<size; i++) {
			a[i]= sc.nextInt();
		}
		
		//output of array
		for(int i=0; i<size; i++) {
			System.out.println(a[i]);
		}
		
		
}
}
