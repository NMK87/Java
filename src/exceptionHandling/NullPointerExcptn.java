package exceptionHandling;

public class NullPointerExcptn {

	public static void main(String[] args) {

		String str= null;
		
		try {
			System.out.println(str.toUpperCase());
			System.out.println(str);
		}
		catch(Exception e){
			
			System.out.println(e);
		}
		
	}

}
