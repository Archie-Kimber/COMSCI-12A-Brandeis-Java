/**
* Archie Kimber 
* archibaldkimber@brandeis.edu
* March 3rd, 2022
* PA3
* This is the main file which contains the war class as well runs the war game. The war class uses methods specific to the card object 
* 
*/
package main;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author archi
 * Casino class which holds the war method that plays the game of war  
 */
public class Casino {
	public static void War(Deck myDeck)
	{
		int play = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Casino and the War table");
		System.out.println("How much money do you want to bring with you to the table?");
		int amount = scan.nextInt();
		if(amount <= 0)
		{
			System.out.println("Looks like you are out of money we are going to ask you to leave the table");
			play++;
		}
		while(play == 1)

		{

			int tenPercent = amount/10;
			System.out.println("How much money do you want to bet this round? You must bet a minimum of " + tenPercent);
			int bet = scan.nextInt();
			scan.nextLine();
			if(bet < tenPercent)
			{
				System.out.println("You need to enter a minimum of " + tenPercent);
				continue;
			}
			if(bet > amount)
			{
				System.out.println("Please enter an amount you actually have");
				continue;
			}
			Card user = myDeck.drawNextCard();
			Card comp = myDeck.drawNextCard();
			if(user.getValue() == comp.getValue())
			{
				int equal = 0;
				while(equal == 0)
				{
					user = myDeck.drawNextCard();
					comp = myDeck.drawNextCard();
					if(user.getValue() != comp.getValue())
					{
						equal++;
					}
				}
			}
			if(user.getValue() > comp.getValue())
			{
				System.out.println("Congrat you won this round, your " + user.toString() +" beat the computer's " + comp.toString());
				amount = amount + bet;
			}
			if(user.getValue() < comp.getValue())
			{
				System.out.println("You lost this round, your " + user.toString() +" lost to the computer's " + comp.toString());
				amount = amount - bet;
			}

			System.out.println("Here is your total amount of money " + amount);
			System.out.println("Do you wish to continue? (Yes or No)");
			String keepPlaying = scan.nextLine();
			if(keepPlaying.equals("No"))
			{
				System.out.print("Ok then have a nice day!");
				play++;
			}
			
		}
	}
/**
 * 				
 * @param args
 * Main meth that calls casino and uses the deck object
 */
	public static void main(String[] args) {
		Deck myDeck = new Deck();
		myDeck.shuffle();
		War(myDeck);
		
	}

}
