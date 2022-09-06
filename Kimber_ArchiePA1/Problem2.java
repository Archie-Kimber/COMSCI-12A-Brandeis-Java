import java.util.Scanner; // importing the scanner 
public class Problem2{
	public static void main(String[] args){
		Scanner userNum = new Scanner(System.in); // making a scanner object
		System.out.println("Please give us a whole positive number please"); // asking user for a number 
		int num = userNum.nextInt(); // assiging the scanner obkect to an int 
		int temp = 1; 
		while(temp<num){ // this loop makes a temp varibale and increases by *10 so i can use it to divide the number later on
			temp = temp *10;
		}
		int divider = temp/10; // the divide variable 

		int mod = num; // duplicatinf the variable 
		while(num > 0) // while loop is used for producing each individual number of the original numbe on a sepearte line 
		{
		num = num/divider; // dividing the orignal number by the divider variable 
		System.out.println(num); // printing the individual number 
		//System.out.println(divider);
		mod = mod%divider; 
		//System.out.println(mod+"Mod");
		num = mod;
		divider = divider/10;
		
		}
	}
}