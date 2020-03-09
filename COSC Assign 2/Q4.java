package assignment_2;
/**
 * Nathan cst103
 * Upper case to lower case
 * lower case to upper case
 * 
 */
import java.util.Scanner;

public class Q4
{

	public static void main(String[] args)
	{
		Scanner obInput = new Scanner(System.in);
		System.out.printf("Please enter a string, this will reverse the upper and lower case letters");
		String sLine = obInput.nextLine();
		
		for (int i = 0; i < sLine.length(); i++)
		{
			char cLetter = sLine.charAt(i);
			int nAscii = (int) cLetter;
			if (nAscii >= 97 && nAscii <= 122  )
			{
				System.out.printf("%c",Character.toUpperCase(cLetter) );// if String.toUpperCase is a thing why wouldn't Char.toUpperCase be?
			}
			else if( nAscii >= 65 && nAscii <= 90)
			{
				System.out.printf("%c", Character.toLowerCase(cLetter));
			}
			else if(nAscii == 32)
			{
				System.out.printf(" ");
			}
			else
			{
				System.out.printf("\nPlease enter characters that have an upper and lower case");
				break;
			}
		}
		
		
		
		
		obInput.close();
	}

}
