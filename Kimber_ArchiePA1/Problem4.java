import java.util.Scanner; //import scanner 
public class Problem4
{
	public static void main(String[] args)
	{
		Scanner name = new Scanner(System.in); // making scanner object
		System.out.println("Enter a phrase that you want to be coded:"); 
		String phrase = name.nextLine(); //original phrase 
		String upperPhrase = phrase.toUpperCase();//making the phrase to be all caps
		Scanner number = new Scanner(System.in); // making an in scanner 
		System.out.println("Enter how many rotations you want to occur"); // asking dor the ammoutn of rotations
		int rotation = number.nextInt(); 
		String newPhrase = ""; //empty string that gets the new code added to
		if(rotation<0){ //if rotation is negatice it is then multiplied 
			rotation = rotation *-1;
		}
		if(rotation>26){ // if the roation is to big this condition allows it to be the correct size
			rotation = rotation%26;
		}
		int lengthOfphrase = phrase.length(); //variable for lenth of string 
		
		for(int i=0; i < lengthOfphrase; i++) //for loop
		{
		int num = upperPhrase.charAt(i); // converst the specific letter to ascii
			if(num>90 && num< 65) //if the num isnt in this ranger of 65-90 it is ignored 
		{
				newPhrase += upperPhrase.charAt(i);
		}
			else if(num + rotation>90) // 
			{
				newPhrase += (char)(num+rotation - 90+64); // makes sure if rotation turns the int to over 90 it adjusts			
			}
			else if(num + rotation < 65) //if num is less than 65 it is adhust for 
			{
				newPhrase += (char)(91-(65 -(num+rotation)));
			}	
			else
			{
				newPhrase += (char)(num+rotation);
			}

		}
	System.out.print(newPhrase); //prints new phrase
	}
}