/* Array
 * 
 * int a; 
 * a = 10;
 * a = 20;
 * 
 * 
 * 
 * 
 */
package com.suresh.demos;

import java.util.Scanner;
import java.util.Arrays;

public class Demo4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] marks = { {2,3,4},{4,6,8} } ;
//		int [][] marks = new int[2][3];
		
		for(int row=0;row<marks.length;row++) {
				for(int col=0;col<marks[row].length;col++) {
					System.out.print(marks[row][col] +" ");
				}
				
				System.out.println();
		}
	

	}
}
