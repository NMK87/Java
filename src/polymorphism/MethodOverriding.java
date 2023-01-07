package polymorphism;

class shape {
	 
	void draw() {
		System.out.println("no shape");
	}
	
}
class square extends shape {
	
	@Override    // is not override compilation error comes
	void draw() {
		
		super.draw(); //by using this we call both the method draw.
		System.out.println("shape is square"); // now the sub class is called by overriding
	}
}

public class MethodOverriding {

	public static void main(String args[]) {
	shape obj = new square(); 
	obj.draw();
}
}
