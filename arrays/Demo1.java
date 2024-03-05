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

public class Demo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		int[] arr = {10,20,40,30,70,50};
		int[] marks = new int[5];
		
		for(int i=0;i<marks.length;i++) {
			marks[i] = input.nextInt();
		}
		
		//marks[10 ,20  ,30  ,40 , 50,]
		
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
		Arrays.sort(marks);
		System.out.println("after sort");
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
	}
}
