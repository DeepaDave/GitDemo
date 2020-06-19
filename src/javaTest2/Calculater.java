package javaTest2;

public class Calculater {
	
	
		public static void main(String[] args) {
		
			int x=20;
			int y=40;
			int result;
			
			result= x+y;
			System.out.println("sum of the addition" + result);
			
			//Subtraction
			int x1=100;
			int y1=40;
			int result1;
			
			result1= x1-y1;
			System.out.println( result1);
		 
			//Multiply
			int x2=10;
			int y2=40;
			int result2;
			
			result2= x2*y2;
			System.out.println( result2);
		 
		
			//Divide
			int x3=25;
			int y3=5;
			int result3;
			
			result3= x3/y3;
			System.out.println( result3);
		 
		//Equal too operator
			int n=20;
			int i=20;
			
			boolean s2=(n==i);
			System.out.println("the result of equal operator is "+ s2);
			
			//less than operator
			int g1=35;
			int g2=55;
			
			boolean g3=(g1<=g2);
			System.out.println("the result of lessthan operator is "+ g3);
			
			
			//greater than operator
			int g4=35;
			int g5=75; 
			boolean g6=(g4>=g5);
			System.out.println("the result of lessthan operator is "+ g6);
			
			
			int k1=20;
			int k2=30;
			int k3=60;
			boolean k=(k1<k2)&&(k1<k3);
			System.out.println("the result of AND operator is "+ k);
			
			int k4=20;
			int k5=30;
			int k6=60;
			boolean k7=(k4>k5)&&(k6>k5);
			System.out.println("the result of AND operator is "+ k7);
			
			int l=20;
			int l1=30;
			int l2=60;
			boolean l3=(l1>l2)||(l2==l);
			System.out.println("the result of OR operator is "+ l3);
			
			
			int c=20;
			int c1=30;
			int c2=20;
			boolean c3=(c1==c2)||(c1>c);
			System.out.println("the result of OR operator is "+ c3);
		
		
		
		
		

	}

}
