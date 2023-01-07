package multithreading;

class sch extends Thread{
	
	public void run() {
		
		String n=Thread.currentThread().getName();
		for(int i=1; i<=5; i++) {
			
			System.out.println(n);
		}
	}
}
public class ThreadScheduler {

	public static void main(String[] args) {

		sch obj1 = new sch();
		sch obj2 = new sch();
		sch obj3 = new sch();
		
		obj1.setName("thread 1");
		obj2.setName("thread 2");
		obj3.setName("thread 3");
		
		obj1.start();
		obj2.start();
		obj3.start();
		
		String n=Thread.currentThread().getName();
		for(int i=1; i<=5; i++) {
			
			System.out.println(n);
	}
		
	}

}
