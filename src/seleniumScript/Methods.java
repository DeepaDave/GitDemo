package seleniumScript;

public class Methods {

	public int add() {

		int a = 10;
		int b = 28;
		int c = 34;
		int d = a + b + c;

		return d;

	}

	public void add2() {

		int x = 100;
		int y = 28;
		int z = x + y;

		System.out.println("Sum of two number:" + z);

	}

	public static void main(String[] args) {

		Methods obj = new Methods();
		obj.add();
		obj.add2();

		int sumresult = obj.add();

		System.out.println(sumresult);

	}

}
