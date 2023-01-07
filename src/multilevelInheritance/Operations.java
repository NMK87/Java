package multilevelInheritance;

public class Operations extends TypeTwo {

	void div() {
		a= 50; b=10;
	c=a/b;
	System.out.println("division: "+ c);
	}
	public static void main(String[] args) {

		Operations op = new Operations();
		op.add();
		op.sub();
		op.mul();
		op.div();
	}

}

