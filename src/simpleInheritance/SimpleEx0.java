package simpleInheritance;

public class SimpleEx0 extends SimpleEx1 {

	void display() {
		 
		studentId=1; name="neha"; college= "MIT";
		System.out.println(studentId + " " +name+ " "+ college);
	}
	
	public static void main(String[] args) {

		SimpleEx0 obj = new SimpleEx0();
		obj.details();
		obj.display();
	}

}
