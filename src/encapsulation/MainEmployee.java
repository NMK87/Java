package encapsulation;

public class MainEmployee {
	
	public static void main(String args[]) {
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("neha");
		emp.setNumber(98877566);
		emp.setSalary(50000);
		System.out.println("Id "+ emp.getId());
		System.out.println("Name "+ emp.getName());
		System.out.println("Number "+ emp.getNumber());
		System.out.println("Salray "+ emp.getSalary());
	}

}
