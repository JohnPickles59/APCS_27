/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int numpick = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String password = sc.nextLine();
		if(password == "password"){
			numpick = (int)(Math.random()*5)+1;
			System.out.println("The password was password!");
			System.out.println(numpick);
			if(numpick == 1){
				System.out.println("You have good luck coming your way");
			}
			else if(numpick == 2){
				System.out.println("A surprise will find you when you least expect it.");
			}
			else if(numpick == 3){
				System.out.println("Your next bad idea may become your best story.");
			}
			else if(numpick == 4){
				System.out.println("Someone nearby thinks you are funnier than you realize.");
			}
			else if(numpick == 5){
				System.out.println("Patience is useful, but snacks are more useful.");
			}
		}
		else{
			numpick = (int)(Math.random()*5)+6;
			System.out.println("That's not the password!");
			System.out.println(numpick);
			if(numpick == 6){
				System.out.println("Your future contains at least one suspiciously good decision.");
			}
			else if(numpick == 7){
				System.out.println("A mysterious opportunity will appear. Investigate it anyway.");
			}
			else if(numpick == 8){
				System.out.println("Today is a good day to pretend you know what you're doing.");
			}
			else if(numpick == 9){
				System.out.println("Great things await you, probably after you finish what you were supposed to do.");
			}
			else if(numpick == 10){
				System.out.println("Help! I'm being held prisoner in a chinese bakery!");
			}
		}
	}
}
