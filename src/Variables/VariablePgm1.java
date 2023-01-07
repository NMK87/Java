package Variables;

public class VariablePgm1 {

	static int b=20; //static
	int c=30;        // instance
	
	public static void main(String[] args) {
		int a=10; //local variable
		VariablePgm1 ins=new VariablePgm1();
		
		System.out.println("Local variable "+a);
		System.out.println("static variable "+VariablePgm1.b );
		System.out.println("instance variable "+ins.c );
		
	}

}
