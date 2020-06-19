package seleniumScript;

public class ExceptionExample2 {

	public static void main(String[] args) {
		
		try {
			
			int arr[]= {1,2,3,4,5};
			
			System.out.println(arr[10]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			
			
			System.out.println(ae);
			
		
		System.out.println("out of bounds exception");	
			
	}	
		
		
		
		try {
			
			String s =null;
			System.out.println(s.length());

			
		}
		catch(NullPointerException ne) {
			
			System.out.println(ne);
			
		}
		
			System.out.println("Handling NullpointerException");

		

	
}
		
}		

	


