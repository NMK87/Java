package simpleInheritance;

public class Tks extends Ims{
	
	void Dao() {
		name="neha"; id=5664214;
		System.out.println(name+" "+ id+ " Test case coverage is 11% :(");
	}
	
	void Liquibase() {
		name="aman"; id=457846;
		System.out.println(name+" "+ id+ " Deploymnet is done, moved to testing");
	}

	public static void main(String[] args) {

		Tks obj = new Tks();
		obj.Cit();
		obj.Mcc();
		obj.Dao();
		obj.Liquibase();
		obj.input();
		
		
	}

}
