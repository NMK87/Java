package ExPropagation;

public class ExamplePropagation {
	
	public static void main(String[] args) {

		B();
	}


	public static void A() {
	
	System.out.println("neha");
}

	public static void B() {
	try {
		D();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("sanjana");
}

	public static void c() {
	
	System.out.println("aman");
}

	public static void D() {
	
	System.out.println(10/0);
}


}
