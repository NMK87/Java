package multithreading;

class Multi extends Thread {
	
	
	public void run() // it is already present in thread 
	{
		
		try {
			for(int i=1; i<=5; i++) {
		
				System.out.println("neha");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			
		}
	}
// line 6- 21 we have defined a thread
}

 class ThreadMethod {

	public static void main(String[] args) throws InterruptedException  {

		Multi obj = new Multi();
		obj.start(); //it will start run.
		
		for(int i=1; i<=5; i++) {
			
			System.out.println("carino");
			Thread.sleep(1000);
	}

}
}

