//for demo2
package com.suresh.demos.conditionaloperators;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		int i,mp,mc;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Multiplier");
		mp=input.nextInt();
		
		System.out.print("Enter Multiplicand");
		mc=input.nextInt();
		
		for(i=1; i<=mc; i++) {
			System.out.println(i + " X " + mp + " = " + (i*mp) );
		}
		
	}

}

/*
 *    1 X 8 = 8
 *    2 X 8 = 16
 *    ...
 *    10 X 8 = 80
 * 
*/
