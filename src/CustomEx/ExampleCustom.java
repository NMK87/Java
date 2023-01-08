package CustomEx;

class FailedStudentsException extends Exception{
	
	FailedStudentsException(String msg){
		System.out.println(msg);
	}
}

public class ExampleCustom {

	public static void main(String[] args) {
		
	try {
		School(8);
	}
	catch(Exception e) {
		
		System.out.println(e);
	}
}

public static void School(int marks) throws FailedStudentsException {
	
	if(marks<=35) {
		 throw new FailedStudentsException("Below 35 marks will get failed");
	}
	
	else {
		System.out.println("passed");
		}
	}
}