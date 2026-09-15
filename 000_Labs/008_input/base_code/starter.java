/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter age: ");
		String age = sc.nextLine();
		System.out.println("Enter birthday month: ");
		int bdaymonth = sc.nextInt();
		System.out.println("Enter birthday day: ");
		int bdayday = sc.nextInt();
		System.out.println("Enter birthday year: ");
		int bdayyear = sc.nextInt();
		System.out.println("How much is a buck fifty: ");
		double buckfifty = sc.nextDouble();
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Birthday: " + bdaymonth + " " + bdayday + ", " + bdayyear);
		System.out.println("A buck fifty is: $" + buckfifty);
	}
}
