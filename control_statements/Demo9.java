/*
 * while loop
 */
package com.suresh.demos.conditionaloperators;

public class Demo9 {

	public static void main(String[] args) {
		/*
		for(init ; cond ; incre/decre) {
			execution block;
		}
		
		init;
		
		while(condition){
		exe. block 
		incre/decre
		}
		
		*/
		
		int i = 1;
		
		while(i<=10) {
			if(i%3==0)
			System.out.println(i); //1 2 3 4 5 .... 10
			i++;
		}
		
		
	}

}
