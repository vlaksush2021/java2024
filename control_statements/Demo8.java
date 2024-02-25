//nested for
package com.suresh.demos.conditionaloperators;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		
		int i,j;
		
		for(i=1;i<=5;i++) {  //i = 2
			for(j=1;j<=i;j++) {  // j = 1  , i = 2
				System.out.print(j); //1    // 1 2
			}
			System.out.println();
			
		}
	}

}

/*
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5


1
1 2
1 2 3
1 2 3 4
1 2 3 4 5



*/
