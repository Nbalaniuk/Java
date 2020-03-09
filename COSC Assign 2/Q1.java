package assign2Cst103;

import java.util.Scanner;

public class Q1
{

	public static void main(String[] args)
	{
		
		
		Scanner obInput = new Scanner(System.in);
		System.out.printf("Please enter a line of letters \n");
		String sLine = obInput.nextLine().trim();
		
		int nLength = sLine.length();
		int nRepeat = 0;
		
		
		for (int i=0, j =1; i < nLength && j <(nLength)  ; i++, j++)
		{
			char cLetter = sLine.charAt(i);
			char cTemp = sLine.charAt(j);
			if (cLetter == cTemp && cLetter != ' '/* && cTemp != ' ')*/)
			{
				nRepeat++;
				
			}
			
			
		}
		System.out.printf("The number of consecutive repeating characters is %d \n", nRepeat);
		
		
		
		
		
		
		
		
		
		
		obInput.close();
		
		

	}

}
