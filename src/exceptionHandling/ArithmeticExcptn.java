package exceptionHandling;

public class ArithmeticExcptn {

	public static void main(String[] args) {

		System.out.println("main is started");
		
		int a=10; int b=0;
		try {
			
			int c=a/b;
			System.out.println(c);
			System.out.println("its an exptn");
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
		System.out.println("main is ended");
	}

}
