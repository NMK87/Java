package MethodConstructors;

public class Constructor {

	public static void main(String[] args) {

		A obj = new A(); //object creation for class A, 
		obj.constructor1(); // from which we are calling constructor1	
	}	
}
class A{
	
	int a ; String name;
	 void constructor1() {

		System.out.println(a+" "+name);
	}
//	A(){                       // constructor calling.
//		a=0; name=null;
//	}
	
}
