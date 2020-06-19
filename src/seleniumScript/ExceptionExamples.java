package seleniumScript;

public class ExceptionExamples {
	
	

	public static void main(String[] args) {
		
		try {
			
		int d=200/0;
		
		}
		
		catch(ArithmeticException ae) {
			
			
			
			System.out.println(ae);
			
			
		}
			System.out.println("it will not divide by zero");
	}

}
