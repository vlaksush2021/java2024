/*
 * while loop
	sum of digit
 */
package com.suresh.demos.conditionaloperators;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n,n1,sum=0;
		System.out.println("Enter value for n :");
		n = input.nextInt(); // 123
		
		// 123 => 6 , 367 =>16
		
		while(n>0) {
			n1 = n % 10; // 3 2 1
			n = n / 10; // 12
			sum = sum + n1;//6
		}
		
		System.out.println("Sum of digit is "+sum);
		input.close();
	}

}

/*
 * 14 
 * 14 % 10 =>
 * 14/10 ,4
 */