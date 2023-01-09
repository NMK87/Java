package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FirstEx {
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		System.out.println(a[3]);
		
		int[] marks = new int[5];
		marks[0]= 89;
		marks[1]= 97;
		marks[2]= 56;
		marks[3]= 90;
		marks[4]= 98;
		// changing an array
		a[2]=90;
		System.out.println(a[2]);
		
		// to print all arrays(1st way)
		for(int i=0; i< a.length; i++) {
			System.out.println(a[i]);
		}
		
		for(int j=0; j<5; j++) {
			System.out.println(marks[j]);
		}
		
		// to print all arrays(2nd way, using toString)
		System.out.println(Arrays.toString(a));
		
		//to check array length
		System.out.println(a.length);
		
		//defalut array storage, it stores 0 as it int, float 0.00, string " "
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] c = new int[size];
		
		for(int x=0; x<size; x++) {
			System.out.println(c[x]);
		}
		
	}
}
