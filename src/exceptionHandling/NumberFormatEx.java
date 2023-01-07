package exceptionHandling;

public class NumberFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "123";
		
		try {
		int b=Integer.parseInt(a);
		
		System.out.println(b);
		}
		
		catch(NumberFormatException n) {
			System.out.println("string "+a+" cant be done");
		}
		System.out.println("main method ended");

	}

}
