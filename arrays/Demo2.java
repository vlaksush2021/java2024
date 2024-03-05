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

public class Demo2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] marks = {10,20,40,30,70,50};
				
		System.out.println(Arrays.toString(marks));
		
		Arrays.sort(marks);
		System.out.print("Enter element to search : ");
		int element = input.nextInt();
		int position = Arrays.binarySearch(marks, element);
		
		System.out.println(Arrays.toString(marks));
		if(position>=0) {
		System.out.println(element +" is available in the the position "+position);
		}
		else {
			System.out.println(element + " is not available ");
		}
		
		

	}
}
