package assignment_2;

import java.util.Scanner;

public class Q3
{

	public static void main(String[] args)
	{
		
		Scanner obInput = new Scanner(System.in);
		System.out.printf("Please enter two numbers");
		int nInput1 = obInput.nextInt();
		int nInput2 = obInput.nextInt();
		
		int nMax = Math.max(nInput1, nInput2);
		int nMin = Math.min(nInput2, nInput1);

		for (int i=nMin; i <= nMax; i++)
		{
			
			if (i % 2 == 1 && i % 5 != 0  )
			{
				System.out.printf("%d ,", (i));

			}

		}

		obInput.close();
	}

}
