package seleniumScript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UserException {
	
	public void vote( int  age) {
		
		if(age<18) {
			
			throw new ArithmeticException("age should be less than 18");
			
		}
		else
				System.out.println("Age is right");
		
	}
	public void waittime() throws InterruptedException {
		
		Thread.sleep(3000);
	}
	public void readfile() throws FileNotFoundException
	{
	    FileInputStream f= new FileInputStream("C:\\GITRepo\\calculator");
	}
		
		


	public static void main(String[] args) {
		
		
		UserException  obj= new UserException();
		
		obj.vote(20);
		try {
			obj.waittime();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			obj.readfile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
