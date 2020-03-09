package assign1Cst103;

import java.util.Scanner;

/**
 * This program will take the users input(age) and tell them the price of the ticket depending on their age
 * @author cst103
 * nathan cst103
 *
 */
public class Q7 
{

	public static void main(String[] args) 
	{

		Scanner obInput = new Scanner(System.in);
		
		System.out.println("What is your age? This program will tell you the cost of a movie ticket coresponding to your age.");
		int nAge = obInput.nextInt();
		
		if (nAge < 18)
		{
			System.out.println("As a child,the ticket will cost you $12");
			
		}
		else if (nAge >= 18 && nAge < 60)
		{
			
			System.out.println("As an adult,the ticket will cost you $18");
			
		}
		else
		{
			
			System.out.println("As a senior, the ticket wil cost you $14");
			
		}
		
		
		
		obInput.close();
	}

}
