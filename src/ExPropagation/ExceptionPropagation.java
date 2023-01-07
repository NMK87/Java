package ExPropagation;

public class ExceptionPropagation {

	public static void main(String[] args) {

		m1();
	}
	
	public static void m1() {
		try {
		m2();}
		
		catch(Exception a) {
			System.out.println("exception handled....!");
		}
	}
	
	public static void m2() {
		
		System.out.println(10/0);
	}
	

}
