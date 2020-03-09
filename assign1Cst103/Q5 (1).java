package assign1Cst103;

import java.util.Scanner;

public class Q5 
{

	/**
	 * This is a program that will convert ponds to kilograms
	 * 1 pound = 0.454 kg
	 * nathan cst103
	 * @param args
	 */
	public static void main(String[] args) 
	{

		Scanner obInput = new Scanner(System.in);
		
		final double dConversion = 0.454;
		System.out.println("Please enter an amount in pounds, and it will be converted to the proper weight(in kilograms)");
		 
		double dVal1 = obInput.nextDouble();
		
		System.out.println(+dVal1+ " pounds converted to kilograms is: "+(dVal1 * dConversion)+ "Kg");
		
		
		
		
		obInput.close();
		

	}

}
