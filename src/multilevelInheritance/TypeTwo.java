package multilevelInheritance;

public class TypeTwo extends TypeOne {
	
	void sub() {
		 a= 101; b= 20;
		 c=a-b;
		System.out.println("Sub"+c);
	}
	
	void mul() {
		a= 10; b=7;
		c=a*b;
		System.out.println("multiplication"+c);
	}

}
