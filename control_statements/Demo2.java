/*
 * ladder if
 */
package com.suresh.demos.control_statements;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int mark;
		
		System.out.println("Enter Mark :");
		mark = input.nextInt();
		
		
		//control statements - conditional st.
		if(mark>=80) {
			System.out.println("First class");
		}
		
		else if(mark>=60 && mark<80) {
			System.out.println("Second class");
		}
		
		else if(mark>=50 && mark<60) {
			System.out.println("Third class");
		}
		
		else {
			System.out.println("Fail");
		}
	}

}
