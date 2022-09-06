import java.util.Scanner; //importing scanner method 
public class Problem1{
	public static void main(String[] args){
		Scanner userNum = new Scanner(System.in); //making an input object
		System.out.print("Intial value is "); // asking user to enter their fist value 
		int num = userNum.nextInt(); // taking in the input and assiging it to an int variable 
		if(num < 1) //conditon so user will only provide an int grater than 1 
		{
			System.out.println("Error");
		}
		else
		{

			int holder = 1; 
			int count = 0;
			while(holder == 1) //condition variable is only changed when num meets a certain condition
			{
				if(num == 1){  // condition that will end while loop
					holder++;
			    }
				else if(num%2 !=0 && num != 1) // if num is odd this condition is met 
				{
					System.out.println("Next value is:" + num);
					num = (num*3)+1;
					count++;
				}
				else // this is for when num is even
				{
					System.out.println("Next value is:" + num);
					num = num/2; 
					count++;
				}

			}
			System.out.print("Final value " + num);	//prints final value
			System.out.print(", number of operations performed "+count); //bored so i did two print statments 
		}
	}
}