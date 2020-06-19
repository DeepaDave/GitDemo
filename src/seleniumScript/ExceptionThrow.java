package seleniumScript;

public class ExceptionThrow {

	public void checkMarks(int marks) {

		if (marks < 50) {

			throw new ArithmeticException("Fail");

		}

		else {

			System.out.println("Pass");

		}

	}
	
	public int calDivide(int x,int y)throws  ArithmeticException{
		
		int ans=x/y;
		return ans;
		
	}

	public static void main(String[] args) {
		
		ExceptionThrow   et =new ExceptionThrow();
		 
		et.checkMarks(65);
		try {
			
			System.out.println(et.calDivide(10, 0));
		
		}
		catch(ArithmeticException e) {
			
			System.out.println("Divide by Zero");
			
			
		}
	}

}
