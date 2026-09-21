/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");
		int x = sc.nextInt();
		System.out.println("Please enter another integer (bigger than the first): ");
		int y = sc.nextInt();

		System.out.println(Math.max(x, y)); 
		System.out.println(Math.sqrt(y));
		System.out.println(Math.pow(x, y));
	}
}
