package StaticInstanceEx;

public class StaticInstance {

	int a=10;
	static int b=20;
	public static void main(String[] args) {

		StaticInstance obj=new StaticInstance();
		StaticInstance.show();
		obj.display();
	}

	 static void show() {
		System.out.println(b);
		
	}
	 void display()  {
			System.out.println(a+" "+b);
	 }
	 
}
 


