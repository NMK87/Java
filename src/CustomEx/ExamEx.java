package CustomEx;

class InvalidMarksException extends Exception{
	
	InvalidMarksException(String msg){
		System.out.println(msg);
	}
}
public class ExamEx { 

	public static void main(String[] args) {

		try {
			ExamEx.Marks(20);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void Marks(int marks) throws InvalidMarksException{
		
		if(marks<= 35) {
			throw new InvalidMarksException("Student failed");
		}
		else {
			System.out.println("student passed");
		}
	}

}
