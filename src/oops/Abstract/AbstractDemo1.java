package oops.Abstract;


abstract class Programming {   //here an abstract method is done.
	
	public abstract void Developer();
}

class HTML extends Programming {  //here its getting called by 
	 
	@Override
	public void Developer() {     
		System.out.println("neha");
	}
}

class Java extends Programming {
	
	@Override
	public void Developer() {
		System.out.println("sanju");
	}
}

public class AbstractDemo1 {

	public static void main(String[] args) {
 
		HTML h = new HTML();
		h.Developer();
		Java j = new Java();
		j.Developer();
	}

}
