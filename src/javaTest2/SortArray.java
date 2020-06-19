package javaTest2;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		int[ ] aryNums = { 24, 6, 47, 35, 2, 14 };

		Arrays.sort(aryNums);
		int lastArrayNumber = aryNums.length - 1;
		System.out.println("Highest Number: " + aryNums[lastArrayNumber]);
		
		
		Arrays.sort(aryNums);
		int lastArrayNumber1=aryNums.length - 3;
		System.out.println(" Second Highest Number: " + aryNums[lastArrayNumber1]);
		
	}

}
