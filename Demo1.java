/*
 * Utilization of Scanner for acquiring dynamic user input
 * addition of given 2 numbers
 */
package com.suresh.demos;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter 2 Integer values : ");
		
		Scanner input = new Scanner(System.in);
		a = input.nextInt(); 
		b = input.nextInt();
		c = a + b;
		System.out.println("Addition is  "+c);
	}

}
