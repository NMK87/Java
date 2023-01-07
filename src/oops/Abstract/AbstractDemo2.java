package oops.Abstract;

abstract class Fruits {

	public abstract void Taste();
	public abstract void Color();
}

class Apple extends Fruits {
	
	@Override
	public void Taste() {
		System.out.println("Sweet as me");
	}
	public void Color() { // if Color is nor called then Apple class will be of no use, it will become abstract.
		System.out.println("Red as you");
	}
}

class Mango extends Fruits{
	
	@Override
	public void Taste() {
		System.out.println("king as you");
	}
	public void Color() {
		System.out.println("pink as me");
	}
}
 

public class AbstractDemo2 {
// here abstract class Fruits camt create an object but still can hold the ref of sub class like apple n mango.
	public static void main(String args[]) {
	Fruits obj=new Apple();
	obj.Taste(); obj.Color();
	
	Fruits obj2 = new Mango();
	obj2.Taste(); obj2.Color();
}
}