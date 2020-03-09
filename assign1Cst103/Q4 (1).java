package assign1Cst103;

import java.util.Scanner;

public class Q4 
{
/**
 * This program is a basic calculator that does the operation based on the users input 1(+), 2 (-), 3 (*), 4(/)
 * @param args
 * nathan cst103
 */
	public static void main(String[] args) 
	{
		Scanner obInput = new Scanner(System.in);
		
		
		System.out.println("Please enter two integer values followed by a value for the operation you want to complete."
				+ "1(+), 2 (-), 3 (*), 4(/)");
			
		int nVal1 = obInput.nextInt();
		int nVal2 = obInput.nextInt(); // user inputs
		int nOperator = obInput.nextInt();
		
		switch(nOperator)
		{
		case 1:
			System.out.println(+nVal1+ " + " +nVal2+ " = " +(nVal1 + nVal2) ); // addition
		break;
		
		case 2:
			System.out.println(+nVal1+ " - " +nVal2+ " = " +(nVal1 - nVal2)); // subtraction
		break;
		
		case 3:
			System.out.println(+nVal1+ " * "+nVal2+ " = " +(nVal1 * nVal2)); // Multiplication
		break;
		
		case 4:
			System.out.println(+nVal1+ " / " +nVal2+ " = "+(nVal1 / nVal2)); // division
		break;
		
		default:
			System.out.println("Please enter valid numbers");
			
		}
		
		
		
		obInput.close();
		
	}

}
