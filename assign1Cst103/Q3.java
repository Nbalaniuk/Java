package assign1Cst103;

import java.util.Scanner;

public class Q3 
{
/**
 * A program that inputs an integer value and prints out a numbers square, its cube and to the 4th power
 * Must print out as an integer Value
 * nathan cst103
 * @param args
 */
	public static void main(String[] args) 
	{

		Scanner obInput = new Scanner(System.in);
		System.out.println("Please enter a number you wish to be squared, cubed, and to the 4th power");
		int nVal = obInput.nextInt();
		int nSquare = (nVal * nVal);
		int nCube = (nVal * nVal * nVal);
		int nFourth_Power = (nVal * nVal * nVal * nVal);
		
		System.out.println("The Number squared is: "+nSquare+ ". The number cubes is: "+nCube+ ". The number to the fourth "
			+	 "power is: "+nFourth_Power);
		obInput.close();
	}

}
