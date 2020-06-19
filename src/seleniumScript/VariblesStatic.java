package seleniumScript;

public class VariblesStatic {
	
	static int x=0;
	
	 VariblesStatic(){
		
		x++;
	}
	void display() {
		
		System.out.println(x);
		
	}
	
		
	

	public static void main(String[] args) {
		 
		VariblesStatic  con=new VariblesStatic();
		 
		con.display();
		
		VariblesStatic  con1=new VariblesStatic();
		 
		con1.display();

		VariblesStatic  con2=new VariblesStatic();
		 
		con2.display();

		
		
		
	}

}
