import java.util.Scanner;// imports scanner 
public class Problem5{
	public static void main(String[] args)
	{
		Scanner name = new Scanner(System.in); // scanner object 
		System.out.print("Please enter you first name "); //asks user for first name 
		String firstName = name.nextLine(); // the firstname variable 
		System.out.print("Please enter you last name "); // asks user for last name 
		String lastName = name.nextLine(); // the last name variabele 
		int lengthFirst = firstName.length(); // lenght of first name string 
		int lengthLast = lastName.length(); //length of last name string 
		String firstTemp = firstName.substring(2,lengthFirst-1); //string of the first name besisdes the first and second letter
		String firstTempfirst = firstName.substring(1,2).toUpperCase(); // turning the second letter of the first name upper case
		String firstTemplast = firstName.substring(0,1).toLowerCase() + "ay "; // adding the first letter of the the first name to the end in lower case fashion with ay at the end 
		System.out.print(firstTempfirst+firstTemp+firstTemplast);
		String lastTemp = lastName.substring(2,lengthFirst-1); 
		String lastTempfirst = lastName.substring(1,2).toUpperCase();
		String lastTemplast = lastName.substring(0,1).toLowerCase() + "ay";
		System.out.print(lastTempfirst+lastTemp+lastTemplast); // prints everything together	
	}
}
