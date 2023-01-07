package exceptionHandling;

public class TryCatchFinally {

	public static void main(String[] args) {

		try {
			int a=10,b=0,c;
			c=a/b;
			System.out.println(c);
			System.out.println("all is well");
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("cant divide it");
			
		}
		
		finally {
			
			System.out.println("im always executed");
		}
		System.out.println("main method has ended");
	}

}
