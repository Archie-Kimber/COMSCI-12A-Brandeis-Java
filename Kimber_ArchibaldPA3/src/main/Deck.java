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
/**
 * 
 * @author archi
 *creating the deck object deck class
 */
public class Deck {
	//making the decks themselves 
	private Card [] cardList = new Card[52];
	private Card [] discardList = new Card[52];
	private int position = 0;
	private int discardPosition = 0;
	// deck object that is used in the war method 
	public Deck() {
		int count = 0;
		String suits[] = new String[]{"Hearts", "Diamonds", "Clubs", "Spades"};
		for(int i = 0; i <4; i++)
		{
			for(int j = 1; j<14; j++)
			{
					Card newCard = new Card(j, suits[i]);
					cardList[count] = newCard;
					count++;
			}
		
		}
	int temp = 0;
	}
	// shuffle method that shuffle the contents of the deck 
	public void shuffle() {
	Random rand = new Random();
	//random amount of places shuffled always 
	int amountOfshuffles = (int)Math.floor(Math.random()*(500-52+1)+52);
	Card temp1;
	for(int i = 1; i<amountOfshuffles; i++)
	{
		int randCardone = rand.nextInt(51-position);
		int randCardtwo = rand.nextInt(51-position);
		if(randCardone == randCardtwo)
		{
			randCardone = ((randCardone+1)%51)+position;
		}
		temp1 = cardList[randCardone];	
		cardList[randCardone] = cardList[randCardtwo];
		cardList[randCardtwo] = temp1;
	}
	}
	//returns cards to user 
	private Card getNextCard() 
	{
		Card returnCard;
		returnCard = cardList[position];
		cardList[position] = null;
		position++;
		return returnCard;
	}
	//draws next card 
	public Card drawNextCard() {
		Card returnCard;
		if(position<=51)
		{
			return this.getNextCard();
		}
		else
		{
			//resets the deck 
			cardList = discardList.clone();
			discardList = new Card[52];
			position = 0;
			discardPosition = 0;
			shuffle();
			return this.getNextCard();
		}
		
	}
	//discards the card
	public void discard(Card c)
	{ 
		discardList[discardPosition] = c;
		discardPosition++;
	}

}
