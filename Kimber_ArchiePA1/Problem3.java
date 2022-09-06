import java.util.Scanner; //import scanner 
public class Problem3
{
	public static void main(String[] args)
	{
		Scanner userNum = new Scanner(System.in); // scanner object 
		System.out.println("Enter a number that is less than 4999"); //asks the user for an input 
		int num = userNum.nextInt(); // actual input vatiable 
		int temp = 1;
		while(temp<num){ // same thing as problem 2 used as a divider to keep maling the original number smalled
			temp = temp *10;
		}
		int divider = temp;
		while(num>0){ //While loop produces the correct roman numeral until num is 0
			divider = divider/10;
			if(num>=4000){
				num = num%divider;
				System.out.print("MV");
				}
			else if(num>= 3000){
				num = num%divider;
				System.out.print("MMM");
			}
			else if(num>= 2000){
				num = num%divider;
				System.out.print("MM");
			}
			else if(num>= 1000){
				num = num%divider;
				System.out.print("M");
			}
			else if(num>= 900){
				num = num%divider;
				System.out.print("CM");
			}
			else if(num>= 800){
				num = num%divider;
				System.out.print("DCCC");
			}
			else if(num>= 700){
				num = num%divider;
				System.out.print("DCC");
			}			
			else if(num>= 600){
				num = num%divider;
				System.out.print("DC");
			}
			else if(num>= 500){
				num = num%divider;
				System.out.print("D");
			}		
			else if(num>= 400){
				num = num%divider;
				System.out.print("CD");
			}
			else if(num>= 300){
				num = num%divider;
				System.out.print("CCC");
			}		
			else if(num>= 200){
				num = num%divider;
				System.out.print("CC");
			}		
			else if(num>= 100){
				num = num%divider;
				System.out.print("C");
			}		
			else if(num>= 90){
				num = num%divider;
				System.out.print("XC");
			}		
			else if(num>= 80){
				num = num%divider;
				System.out.print("LXXX");
			}		
			else if(num>= 70){
				num = num%divider;
				System.out.print("LXX");
			}
			else if(num>= 60){
				num = num%divider;
				System.out.print("LX");
			}		
			else if(num>= 50){
				num = num%divider;
				System.out.print("L");
			}		
			else if(num>= 40){
				num = num%divider;
				System.out.print("XL");
			}		
			else if(num>= 30){
				num = num%divider;
				System.out.print("XXX");
			}		
			else if(num>= 20){
				num = num%divider;
				System.out.print("XX");
			}
			else if(num>= 10){
				num = num%divider;
				System.out.print("X");
			}
			else if(num>= 9){
				num = num%divider;
				System.out.print("IX");
			}
			else if(num>= 8){
				num = num%divider;
				System.out.print("VIII");
			}		
			else if(num>= 7){
				num = num%divider;
				System.out.print("VII");
			}
			else if(num>= 6){
				num = num%divider;
				System.out.print("VI");
			}
			else if(num>= 5){
				num = num%divider;
				System.out.print("V");
			}
			else if(num>= 4){
				num = num%divider;
				System.out.print("IV");
			}
			else if(num>= 3){
				num = num%divider;
				System.out.print("III");
			}
			else if(num>= 2){
				num = num%divider;
				System.out.print("II");
			}
			else if(num>= 1){
				num = num%divider;
				System.out.print("I");
			}
		}
	}
}