package innterface;
import java.util.Scanner;

interface client {
	 
	void input();
	void output();
}

public class InterfaceEx1 implements client {
	
	String name; double salary;
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		name=sc.nextLine();
		
		System.out.println("Enter sal: ");
		salary=sc.nextDouble();
	}
	public void output() {
	
		System.out.println(name+" "+salary);
		
	}

}
