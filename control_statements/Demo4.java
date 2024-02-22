/*
 * switch case
 * switch(expression){
 * case 1:
 * 		block1
 * case 2:
 * 		block2
 * 
 * |
 * |
 * default:
 * 		default block
 * 
 * }
 * 
 * 
 */
package com.suresh.demos.control_statements;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		int a,b,c=0,option;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 2 integer values ");
		a = input.nextInt();
		b = input.nextInt();
		
		System.out.println("Arithmetic Operations ");
		System.out.println("	1.Addition");
		System.out.println("	2.Subtractioin");
		System.out.println("	3.Multiplication");
		System.out.println("	4.Divition");
		System.out.println("    5. Exit");
		
		System.out.print("Enter your option :");
		option = input.nextInt();
		
		
		switch(option) {
		case 1:
			c = a + b;
			break;
			
		case 2:
			c = a - b;
			break;
		case 3 :
			c = a * b;
			break;
		case 4:
			c = a / b;
			break;
		case 5:
			System.exit(1);
		default:
			System.out.println("Invalid choice");
			break;
		}
		
		System.out.println("Result is "+c);
		
	}

}
