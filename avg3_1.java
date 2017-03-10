
/*The program that reads in 7 numbers from the user into an array. 
 * Then print the mean = average of numbers,
 * median = middle number (numbers must be in order),
 * mode = number that occurs most often,
 * and range = difference between highest and lowest values.
 * Prints all the elements of the array.
 */

//import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class avg3_1 
{
	public static void main(String[]args)
	{
		
		final int ARRAY_SIZE = 7; //number of inputs
						
		int[] number = new int[ARRAY_SIZE];
		
		userInput(number);	//declare user input method to utilize array
				
		mean(number,ARRAY_SIZE); //declares mean method and inserts the array
		median(number);//declares median method and inserts the array
		range(number);//declares range method and inserts the array
		mode(number);//declares mode method and inserts the array
		
	}
	
	
	public static int[] userInput(int[] number)
	{
		
		Scanner keyboard = new Scanner(System.in); //declare keyboard as scanner
		
			
		//prompt for user to enter numbers 1 - 7...array index 0 - 6
		System.out.println("Enter 1st number:");
		number[0] = keyboard.nextInt();
			
		System.out.println("Enter 2nd number:");
		number[1] = keyboard.nextInt();
			
		System.out.println("Enter 3rd number:");
		number[2] = keyboard.nextInt();
			
		System.out.println("Enter 4th number:");
		number[3] = keyboard.nextInt();
			
		System.out.println("Enter 5th number:");
		number[4] = keyboard.nextInt();
			
		System.out.println("Enter 6th number:");
		number[5] = keyboard.nextInt();
			
		System.out.println("Enter 7th number:");
		number[6] = keyboard.nextInt();
		
		System.out.println();//formatting
		
		//sort the array from lowest to highest
		Arrays.sort(number);
		int i;
		for (i = 0; i < number.length; i++)
		{
			//System.out.print( number[i] + " \t"); //not needed
			
		}
		//Prints out the numbers entered into the array
		System.out.println("The numbers entered are: " + number[0] + " "  + number[1] + " " + number[2] +
			" "+ number[3] + " " + number[4] + " "+ number[5] + " " + number[6] + " " );
		System.out.println();//formatting
		
		return number;//returns the array to the main method
			
	}
		
	
	
		public static void mean(int[] number,int ARRAY_SIZE) //prints mean value
		{
			//Calculates the mean of the array
			int meanvalue = (number[0] + number[1] + number[2] + number[3] + number[4] 
				+ number[5] + number[6]) / ARRAY_SIZE;
		
			//prints the mean
			System.out.println("Mean = " + meanvalue);
			System.out.println();//formatting
				
		}
		
		
		public static void median(int[] number) //calculates the median(middle value)
		{	
			if (number.length %2 == 0)//if the modulus 2 of the length of the array is equal to 0
			{	
				//means the array is even, 2 index values have to the median
				System.out.println(number[number.length/2] + number[(number.length/2) + 1]);
				System.out.println();
			}
			else
				System.out.println("Median = "+ number[(number.length/2)]); //the middle index value is the median
				System.out.println();
		}
		
		
		public static void range(int[] number)//calculates the range(highest and lowest value)
		{
	
			int lowestValue = number[0];
			int highestValue = number[number.length-1];
			int range = highestValue - lowestValue;
			
			//lowest value is at index 0 and highest value will be at the last index
			System.out.println("Lowest Value = " + lowestValue + "\n" + "Highest Value = " + highestValue);
			System.out.println("Range = " + range);
			System.out.println();
		}
		
			
		public static void mode(int[] number)//calculate and print the mode
		{
			int count1 = 0; //Initialize count equal to zero
			
				for (int j=0; j<number.length-1; j++)
				{
					if (number[j] == number[j+1])
					{
						count1 = count1 + 1;
						int repnum = number[j]; //store repnum(repeated number)
						System.out.print("Mode = " + repnum);		
					}
					
				}
				if (count1 == 0)
				{
					System.out.print("There is no mode");
				}
		
		}
	
}
