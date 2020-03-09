package assign1Cst103;

import java.util.Scanner;

public class Q6 
{
/**
 * This program will input a four digit integer, and return the value in reverse.
 * @param args
 * nathan cst103
 */
	public static void main(String[] args) 
	{
		Scanner obInput = new Scanner(System.in);
		System.out.println("Please enter a four digit integer value, that you wish to be reversed");
		int nVal1 = obInput.nextInt();
		
		int nVal2 = nVal1  /1000; // this takes the thousands place
		int nVal3 = nVal1 /100 %10;
		int nVal4 = nVal1 /10 %10;
		int nVal5 = nVal1 %10;
		
		System.out.println("The number reversed is: " +nVal5 + +nVal4 + +nVal3 + + nVal2);
		
		
		
		
		
		
		
		
		obInput.close();
		
	}

}
