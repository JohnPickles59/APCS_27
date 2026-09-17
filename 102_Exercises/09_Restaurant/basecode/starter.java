/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a name: ");
		String name = sc.nextLine();
		System.out.println("Please enter a restaurant name: ");
		String restaurantname = sc.nextLine();
		System.out.println("Enter your first menu item: ");
		String menuitem1 = sc.nextLine();
		System.out.println("How much will that cost: ");
		double menuitemcost1 = sc.nextDouble();
		System.out.println("How many would you like: ");
		int menuitemquantity1 = sc.nextInt();

		System.out.println("-------------------------------------");

		System.out.println("Enter your second menu item: ");
		String menuitem2 = sc.nextLine();
		System.out.println("How much will that cost: ");
		double menuitemcost2 = sc.nextDouble();
		System.out.println("How many would you like: ");
		int menuitemquantity2 = sc.nextInt();

		System.out.println("-------------------------------------");

		System.out.println("Enter your third menu item: ");
		String menuitem3 = sc.nextLine();
		System.out.println("How much will that cost: ");
		double menuitemcost3 = sc.nextDouble();
		System.out.println("How many would you like: ");
		int menuitemquantity3 = sc.nextInt();

		System.out.println("-------------------------------------");

		System.out.println("How much would you like to tip in percentage:");
		double tip = sc.nextDouble();

		System.out.println("-------------------------------------");

		double subtotal = (menuitemcost1 * menuitemquantity1) + (menuitemcost2 * menuitemquantity2) + (menuitemcost3 * menuitemquantity3);
		System.out.println(name + "'s bill: " + restaurantname);
		System.out.println("Subtotal: $" + subtotal);
		System.out.println(menuitem1 + " - $" + menuitemcost1);
		System.out.println(menuitem2 + " - $" + menuitemcost2);
		System.out.println(menuitem3 + " - $" + menuitemcost3);

		double tipsum = (tip/subtotal)*100;
		double taxsum = (9.75/subtotal)*100;



		System.out.println("Tip: " + tip + "%");
		System.out.println("Tax: $" +  taxsum);

		System.out.println("Total: $" + subtotal + tipsum + taxsum);
		
		
	}
}
