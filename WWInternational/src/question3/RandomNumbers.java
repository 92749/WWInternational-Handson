package question3;
import java.util.*;

public class RandomNumbers 
{

	public static void main(String[] args) 
	{
		
		Random objRandom = new Random();
		int[] randomArray = new int[500];
		
		//to generate random numbers between 0-2000 and store it in array 
		for (int i=0; i<500;i++)
		{
			randomArray[i]= objRandom.nextInt(2000)+1;
		}
		
		// unsorted Array
		System.out.println("Unsorted Array : "+Arrays.toString(randomArray));
		
		//to sort the array with random numbers
		Arrays.sort(randomArray);
		
		//sorted array
		System.out.println("Sorted Array : "+Arrays.toString(randomArray));
		
		//to get user input for the value of n
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter a number between 0 - 499 to get its value : ");
		
        int n = userinput.nextInt();
   
        if (n<500)
        {
        	System.out.println("You entered " + n + " and the value at this location is "+ randomArray[n]);
        }
        else
        {
        	System.out.println("you entered "+n+" which is out of range... rerun program again.. Thank you");
        }
		
		
	}
	
}
