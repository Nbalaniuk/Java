package assign1Cst103;

import java.util.Scanner;

public class Q11 
{

	/**
	 * This program will play a game of rock paper scissors lizard spock
	 * User input and tell the outcome if they win or lose
	 * @param args
	 * nathan cst103
	 * 
	 * •	Scissors Cut Paper
•	Scissors Decapitates Lizard
•	Rock Crushes Scissors
•	Rock Crushes Lizard
•	Paper Covers Rock
•	Paper disproves Spock
•	Lizard Poisons Spock
•	Lizard Eats Paper
•	Spock smashes Scissors
•	Spock vaporizes Rock

	 */
	public static void main(String[] args) 
	
	{

		Scanner obInput = new Scanner(System.in);
		System.out.println("Rock (1), Paper (2), Scisoors (3), Spock (4), Lizard (5). Your Guess?");
		
		int nGuess = obInput.nextInt();
		

		int nRandom = (int) (Math.random()*5)+1;
		
		switch (nGuess)
		{
			case 1: //rock
			{
				if (nRandom == 1) //rock vs rock
				{
					System.out.println("The computer chose:Rock Tie.");
				}
				else if(nRandom == 2)// rock vs Scissors
				{
					System.out.println("The computer chose:Scissors WIN! Rock crushes Scissors");
				}
				else if(nRandom == 3) // rock vs Paper
				{
					System.out.println("The computer chose:Paper Lose. Paper covers rock");
				}
				else if(nRandom == 4) //rock vs spock
				{
					System.out.println("The computer chose:Spock Lose. Spock vaporizes rock");
				}
				else // rock vs lizard
				{
					System.out.println("The computer chose:Lizard WIN! Rock crushes Lizard");
				}
				break;
			}
			
			case 2: // scissors
			{
				if (nRandom == 1)//Scissors vs rock
				{
					System.out.println("The computer chose:Rock LOSE! Rock crushes Scissors");
				}
				else if(nRandom == 2) // Scissors vs Scissors
				{
					System.out.println("The computer chose:Scissors TIE");
				}
				else if(nRandom == 3) //scissors vs paper
				{
					System.out.println("The computer chose:Paper WIN! Scissors cut paper");
				}
				else if(nRandom == 4) // scissors vs spock
				{
					System.out.println("The computer chose:Spock LOSE! Spock Smashes Scissors");
				}
				else // scissors vs lizard
				{
					System.out.println("The computer chose:Lizard WIN! Scissors decapitate Lizard");
				}
				break;
			}
			
			case 3: //paper
			{
				if(nRandom == 1) //paper vs rock
				{
					System.out.println("The computer chose:Paper WIN! Paper covers Rock");
				}
				else if(nRandom == 2) // paper vs scissors
				{
					System.out.println("The computer chose:Scissors LOSE! Scissors cut paper");
				}
				else if(nRandom == 3)// paper vs paper
				{
					System.out.println("The computer chose:paper TIE!");
				}
				else if (nRandom == 4)// paper vs spock
				{
					System.out.println("The computer chose: Spock WIN! Paper Disproves Spock");
				}
				else // paper vs lizard
				{
					System.out.println("The computer chose:Lizard LOSE! Lizard eats Paper");
				}
				break;
			}
			case 4: // Spock
			{
				if (nRandom == 1) // spock vs rock
				{
					System.out.println("The computer chose:rock WIN! Spock vaporizes Rock");
				}
				else if(nRandom == 2) // spock vs paper
				{
					System.out.println("The computer chose:paper LOSE! Paper disproves Spock");
				}
				else if(nRandom == 3)// spock vs scissors
				{
					System.out.println("The computer chose:scissors WIN! Spock smashes Scissors");
				}
				else if(nRandom == 4)// spock vs spock
				{
					System.out.println("The computer chose:spock TIE!");
				}
				else  // spock vs lizard
				{
					System.out.println("The computer chose: Lizard LOSE! Lizard poisons Spock");
				}
				
				
				break;
			}
			case 5: // lizard
			{
				if(nRandom == 1) // lizard vs rock
				{
					System.out.println("The computer chose: rock LOSE! Rock smashes Lizard");
				}
				else if(nRandom == 2)// lizard vs scissors
				{
					System.out.println("The computer chose:scissors LOSE! Scissors decapitate Lizard");
				}
				else if(nRandom == 3)// lizard vs paper
				{
					System.out.println("The computer chose: paper WIN! Lizard eats Paper");
				}
				else if(nRandom == 4)// lizard vs spock
				{
					System.out.println("The computer chose:spock WIN! Lizard Poisons Spock");
				}
				else // lizard vs lizard
				{
					System.out.println("The computer chose:lizard TIE");
				}
				
				
				break;
			}
		}
			
		obInput.close();
		}
		

	}


