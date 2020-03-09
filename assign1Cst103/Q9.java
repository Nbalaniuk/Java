package assign1Cst103;

import java.util.Scanner;

/**
 * This program will randomly select an integer value from 1-5
 * The user must guess which number was selected and inform them if they were correct or not
 * @author cst103
 * nathan cst103
 *
 */
public class Q9 
{

	
	public static void main(String[] args) 
	{

		Scanner obInput = new Scanner(System.in);
		System.out.println("This program will generate a random number between 1-5,"
				+ " you must attempt to guess the number.What is your guess?");
		//long nRandom = System.currentTimeMillis() /10 %10 /2 +1 ; // %5 +1 also works
		int nRandom = (int) (Math.random()*5)+1;
		
		
	
		int nGuess = obInput.nextInt();
		if (nGuess == nRandom)
		{
			System.out.println("You are correct");
			
		}
		else
			{
			System.out.println("you are incorrect");
			System.out.println("The Number was "+nRandom);
			}
		
		
		
		
		obInput.close();
	}

}
