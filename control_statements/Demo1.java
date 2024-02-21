/*
 * if and if .. else
 */
package com.suresh.demos.control_statements;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int mark;
		
		System.out.println("Enter Mark :");
		mark = input.nextInt();
		
		
		//control statements - conditional st.
		if(mark>=50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
	
	}

}
