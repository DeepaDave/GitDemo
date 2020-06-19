package seleniumScript;

public class Methods2 {

	//static int s = 100;

	public int mul() {

		int x = 45;
		int y = 4;
		int c = x * y;

		return c;

	}

	public int div() {

		int a = 40;
		int b = 5;
		int d = a / b;

		return d;

	}

	public static int add() {
		int x = 10;
		int y = 20;
		int c=x+y;
		return c;
		
	}

	public static void account() {
		System.out.println("account info logic");
	}

	public static void main(String[] args) {

		Methods2 obj = new Methods2();

		obj.mul();
		obj.div();
		System.out.println(add());
		account();
	
		
		int mulresult = obj.mul();
		int divresult = obj.div();

		System.out.println(mulresult);
		System.out.println(divresult);
		
		
	}

}
