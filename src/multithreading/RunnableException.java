package multithreading;

class inter implements Runnable{
	
	public void run() {
	for(int i=1; i<=5; i++) {
		
		System.out.println("neha");
	}
}
}

public class RunnableException {

	public static void main(String[] args) {

		inter r = new inter();
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=1; i<=5; i++) {
			
			System.out.println("ammu");
		}
	}

}
