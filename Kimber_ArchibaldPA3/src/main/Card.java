/**
* Archie Kimber 
* archibaldkimber@brandeis.edu
* March 3rd, 2022
* PA3
* This is the main file which contains the war class as well runs the war game. The war class uses methods specific to the card object 
* 
*/
package main;
/**
 * 
 * @author archi
 * card class
 */
public class Card {

	// the elements of the card object 
	private String cardSuit;
	private int cardValue;
	private String color;
	/**
	 * Creating the card object 
	 * @param value
	 * @param suit
	 */
	public Card(int value, String suit)  {
		color = "";
	    cardValue = value;
		cardSuit = suit;
			if (suit == "Hearts")
				{
					color = "red";
				}
			else if (suit == "Diamonds")
			{
				color = "red";
			}
			else if (suit == "Spades")
			{
				color = "black";
			}
			else if (suit == "Clubs")
			{
				color = "black";
			}
	}
	//return methods for the card object 
	public int getValue() {
		// TODO: add implementation
		return this.cardValue;
	}
	
	public String getColor() {
		//TODO: add implementation
		return this.color;
	}
	
	public String getSuit() {
		//TODO: add implementation
		return this.cardSuit;
	}
	
	@Override
	public String toString() {
		// TODO: add implementation
		String cardTogether ="";
		if(cardValue == 1)
		{
			cardTogether = "Ace of "+ this.cardSuit;
		}
		else if(cardValue == 11)
		{
			cardTogether = "Jack of "+ this.cardSuit;
		}
		else if(cardValue == 12)
		{
			cardTogether = "Queen of "+ this.cardSuit;
		}
		else if(cardValue == 13)
		{
			cardTogether = "King of "+ this.cardSuit;
		}
		else 
		{
			cardTogether = this.cardValue+ " of "+ this.cardSuit;
		}
		return cardTogether;
	}

}
