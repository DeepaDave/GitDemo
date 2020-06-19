package javaTest2;

import java.util.Arrays;

public class MultidemisionArray {

	public static void main(String[] args) {
		
		int [][]a1= {{10,20,30},{1000,200,300},{25,35,45}};
		int i,j;
		
		for(i=0;i<a1.length;i++) {
			
			for(j=0;j<a1[i].length;j++) {
				
				System.out.print(a1[i][j] + " ");
				
				
				
			}
			
			int[ ] aryNums = { 24, 6, 47, 35, 2, 14 };

			Arrays.sort(aryNums);
			int lastArrayNumber = aryNums.length - 1;
			System.out.println("Highest Number: " + aryNums[lastArrayNumber]);
		}
				
				
			}
			
		
			

	}


