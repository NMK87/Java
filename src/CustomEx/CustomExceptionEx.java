package CustomEx;

class InvalidAgeException extends Exception{
	
	InvalidAgeException(String msg){
		System.out.println(msg);
	}
	
}
public class CustomExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		CustomExceptionEx.Test(20);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
	
	public static void Test(int age) throws InvalidAgeException {
		
		if (age<18) {
			
			throw new InvalidAgeException("age is invalid");
		}
		
		else {
			System.out.println("age is valid");
		}
	}

}
