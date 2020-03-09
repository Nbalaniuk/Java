package assign1Cst103;

import java.util.Scanner;

/**
 * Ask user to input integer, output if the integer is divisible by both 5,6, and if its divisible by 5 or 6
 * 
 * nathan cst103
 * @author cst103
 *
 */

public class Q10 
{

	
	
	public static void main(String[] args) 
	{

		Scanner obInput = new Scanner(System.in);
		System.out.println("Please enter an integer, and this program will tell you if it is divisible by 5 and 6, or 5 or 6.");
		int nVal = obInput.nextInt();
		
		if (nVal %5 == 0 && nVal %6 ==0)
		{
			
			System.out.println(+nVal+" is divisible by both 5 and 6");
			
		}
		else
		{
			System.out.println(+nVal+ " is not divisible by both 5 and 6");
		}
		
		if (nVal %5 == 0 || nVal %6 == 0)
		 {
			 System.out.println(+nVal+ " is divisible by one of 5 or 6");
		 }
		else
		 {
			 System.out.println(+nVal+ " is not divisible by one of 5 or 6");
		 }
		
		
		
		obInput.close();
	}

}
