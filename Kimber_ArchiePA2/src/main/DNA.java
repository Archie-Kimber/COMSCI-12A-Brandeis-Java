/**
* Archibald Kimber
* archibaldkimber@brandeis.edu
* February 15th, 2022
* PA2
* The code produces an output text file of a reorganized input text file that has previouslt formatted in a certain way
*/
package main;
import java.io.*;	 // for File, PrintStream
import java.util.*;   // for Scanner, Arrays
/**
 * 
 * @author Archie
 * This is the class DNA that I run everything from
 */
public class DNA {
// These global variables once changed change the outputs of my code and the way my code functions
public final static int MINNUMCODONS = 5;
public final static	int PERCENTCG = 30;
public final static	int UNIQUQNUCLEOTIDES = 4;
public final static	int NUCLEOTIDESPERCODON = 3;
/**
 * This method returns a double array that contains the total mass of each nucleotide
 * @param count
 * @param codonArray
 * @return massTotal
 */
static double[][] totalMass (int count, String[] codonArray)
	{
		double [][] massTotal = new double[count/2][UNIQUQNUCLEOTIDES+1]; //Initializing the array 

		for(int i = 0; i<count/2; i++) //for loop that goes through each column of the the array
		{
			String temp = codonArray[i]; //Initializing the temp variable using the i row of codonArray
			int lengthOftemp = temp.length(); //converting the length of temp to an int
			for(int j = 0; j<lengthOftemp; j++) // for loop that goes through the row of i column 
			{
				char tempLetter = temp.charAt(j); //finding the character at j place in the array
				if('A' == tempLetter) //if statements adding value to [i][0-4] depending of the character 
				{
					massTotal [i][0] +=135.128;
				}
				if('C' == tempLetter)
				{
					massTotal[i][1] +=111.103;
				}
				if('G' == tempLetter)
				{
					massTotal [i][2] +=151.128;
				}
				if('T' == tempLetter)
				{
					massTotal[i][3] +=125.107;
				}
				if('-' == tempLetter)
				{
					massTotal[i][4]+=100.0;	
				}
				}
			}
	return massTotal; // returns array 
	}
	/**
	 * 
	 * @param count
	 * @param massTotal
	 * @return totalMass
	 */
	static double[] totals (int count, double[][] massTotal)
	{
		double totalMass[] = new double[count/2]; //Initializing new array
		for (int i = 0; i < count/2; i++) // for loop used to go through the row of the array
		{
			double tempTotal = 0.0; //intialzing the temp variable which is reset every time it goes to a new column
			for (int j = 0; j<UNIQUQNUCLEOTIDES+1; j++) //for loop used to go through the rows of the array
			{
				tempTotal += massTotal[i][j]; //tempTotal collecting all the values in column 
			}
			tempTotal = Math.round(tempTotal*10.0)/10.0; //tempTotal being rounded 
			totalMass[i] = tempTotal; //adding tempTotal to the correct spot in the new array 
		}
	return totalMass; //returning the totalMass array
	}
	/**
	 * 
	 * @param count
	 * @param totals
	 * @param totalMass
	 * @return percentMass
	 */
	static double [][] percentMass (int count, double[] totals, double[][] totalMass)
	{
		double percentMass[][] = new double [count/2][UNIQUQNUCLEOTIDES]; //Initializing a new array 
		for(int i = 0; i<count/2; i++) //for loop that goes through every row of the array
		{
			double tempPercent = 0.0; //Initializing the temp variable 
			for(int j = 0; j<UNIQUQNUCLEOTIDES;j++) //for loop going through every column of the 2d array
			{
				tempPercent = totalMass[i][j]/totals[i]; //finding the percent mass 
				tempPercent = tempPercent*100.0; 
				tempPercent = Math.round(tempPercent*10.0)/10.0; //rounding the percent mass to the tenth decimal 
				percentMass[i][j] = tempPercent; //putting the percent mass in the correct spot
			}
		}
		return percentMass; // returning the array
	}
	/**
	 * 
	 * @param count
	 * @param nameProtein
	 * @return codonList
	 */
	static String [][] codonList (int count, String nameProtein[])
	{
		String [][] codonList = new String [count/2][]; // Initializing new array
		for(int i = 0; i<count/2; i++)// for loop that goes through the columns of the array
		{
			String proteinName = nameProtein[i].replace("-",""); //replaces - with empty string 
			codonList[i] = new String [proteinName.length()/NUCLEOTIDESPERCODON]; //making a new array the correct length needed for the string
			for(int j = 0; j < proteinName.length()/NUCLEOTIDESPERCODON; j++) {	 //for loop that goes through each row and assigns the string to the new array
			String tempCodon =proteinName.substring(j*NUCLEOTIDESPERCODON,j*NUCLEOTIDESPERCODON+NUCLEOTIDESPERCODON);
			codonList[i][j] = tempCodon;
			}
	}
	return codonList; //returns codonList
	}
	/**
	 * 
	 * @param count
	 * @param codonArray
	 * @return amountOfNucleotides
	 */
	static int[][] numOfNucleotides (int count, String[] codonArray)
	{
		int [][] amountOfNucleotides = new int[count/2][UNIQUQNUCLEOTIDES]; //intializing new array

		for(int i = 0; i<count/2; i++) // for loop that goes through the columns of the array 
		{
			String temp = codonArray[i]; //intializing of a new string variable
			int lengthOftemp = temp.length();// turning the new variable into an int of thee length
			for(int j = 0; j<lengthOftemp; j++) //for loop that goes through the rows of the array and checks the charcter of the specific array postion
			{
				char tempLetter = temp.charAt(j);
				if('A' == tempLetter)
				{
					amountOfNucleotides [i][0] +=1;
				}
				if('C' == tempLetter)
				{
					amountOfNucleotides [i][1] +=1;
				}
				if('G' == tempLetter)
				{
					amountOfNucleotides [i][2] +=1;
				}
				if('T' == tempLetter)
				{
					amountOfNucleotides [i][3] +=1;
				}
				
			}
		}
	return amountOfNucleotides; //returns array 
	}
	/**
	 * 
	 * @param count
	 * @param DNA
	 * @return nameProtein
	 */
	static String[] nameProtein(int count, Scanner DNA) {
		String[] nameofProtein = new String[(count/2)]; // intializing new array
		int arrayCount = 0; //
		for(int i = 0; i<count; i+=2) //for loop puts the protein name in the corresponding spot in the new array
		{
			String proteinName = DNA.nextLine();
			DNA.nextLine();
			nameofProtein[arrayCount] = proteinName;
			arrayCount++;
		}
		return nameofProtein; // returns array
	}
	/**
	 * 
	 * @param count
	 * @param DNA
	 * @return arrayofCodon
	 */
	static String[] codon(int count, Scanner DNA) {
		String[] arrayofCodon = new String[(count/2)]; //intializng new array
		int arrayCount = 0;
		for(int i = 0; i<count; i+=2) //for loop goes and inserts the codon in the correct spot 
		{
			DNA.nextLine();
			String codonName= DNA.nextLine();
			arrayofCodon[arrayCount] = codonName.toUpperCase();
			arrayCount++;
		}
		return arrayofCodon; //returns array
	}
	/**
	 * 
	 * @param nameProtein
	 * @param codon
	 * @param numOfNucleotides
	 * @param massTotal
	 * @param percentMass
	 * @param codonList
	 * @param Count
	 * @param outputFile
	 * @throws FileNotFoundException
	 */
	static void output(String [] nameProtein, String [] codon, int[][] numOfNucleotides, double[] massTotal, double [][] percentMass, String[][] codonList, int Count, String outputFile) throws FileNotFoundException
	{
		PrintStream output = new PrintStream(new File(outputFile));
		for(int i = 0; i< Count/2;i++)
		{
			output.println("Region Name: " + nameProtein[i]);
			output.println("Nucleotides: " + codon[i]);
			output.println("Nuc. Counts " + Arrays.toString(numOfNucleotides[i]));
			output.println("Total Mass%: "+ Arrays.toString(percentMass[i])  + " of "+ massTotal[i]);
			output.println("Codon List: " + Arrays.toString(codonList[i]));
			if(DNA.isProtein(codonList[i], percentMass[i])== true)
			{
				output.println("Is Protein?: YES");
			}
			else 
			{
				output.println("Is Protein?: NO");
			}
			output.println("");	
			
		}	
	}
	/**
	 * 
	 * @param codonList
	 * @param percentMass
	 * @return flase or true depening on condition
	 */
	static boolean isProtein(String[] codonList, double [] percentMass)
	{
		if(!codonList[0].equals("ATG"))
		{
			return false;
		}
		if(!codonList[codonList.length-1].equals("TAA") && !codonList[codonList.length-1].equals("TAG") && !codonList[codonList.length-1].equals("TGA"))
		{
			return false;
		}
		if(codonList.length< MINNUMCODONS)
		{
			return false;
		}
		if(percentMass[1]+percentMass[2]<PERCENTCG)
		{
			return false;
		}
		return true;
	}
	/**
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main (String[] args) throws FileNotFoundException
	{
		System.out.println("This program reports information about DNA nucleotide sequences that may encode proteins.");
		Scanner obj = new Scanner(System.in);
		System.out.print("Input file name: ");
		String inputFile = obj.nextLine();
		System.out.print("Output file name: ");
		String outputFile = obj.nextLine(); 
		int count = 0;
		Scanner DNA = new Scanner(new File(inputFile));
		while(DNA.hasNextLine()) //finding the lenght of file
		{
			DNA.nextLine();
			count++;
		}
		DNA = new Scanner(new File(inputFile));
		String[] proteinArray = nameProtein(count, DNA);
		DNA = new Scanner(new File(inputFile));
		String[] codonArray = codon(count, DNA);
		int[][] nucleotides = numOfNucleotides(count, codonArray);
		double[][] eachMass = totalMass (count, codonArray);
		double [] massTotals = totals (count, eachMass);
		double [][] percentMass = percentMass(count, massTotals, eachMass);
		String [][] codonList = codonList(count, codonArray);
		output(proteinArray, codonArray, nucleotides, massTotals, percentMass, codonList,count, outputFile);
		
	}
	
}