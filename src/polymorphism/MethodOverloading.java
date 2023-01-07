package polymorphism;

public class MethodOverloading {
	 void add() {
		int a=10,b=5,c;
		c=a+b;
		System.out.println(c);
	 }
	 void add(int x, int y) {
		 int c;
		 c=x+y;
		 System.out.println(c);
	 }
	 void add(int x, double y) {
		 double a;
		 a=x+y;
		 System.out.println(a);
	 }
	 public static void main(String args[])
	 {
		 MethodOverloading obj = new MethodOverloading();
		 obj.add(); obj.add(4, 8.98);
		 obj.add(45, 89);
	 }
}

