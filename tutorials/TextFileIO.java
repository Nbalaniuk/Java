package tutorials;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileIO
{

	public static void main(String[] args)
	{
		String sText;
		
		/*try(Scanner obIn = new Scanner(System.in);)
		{
			System.out.printf("Enter some text to save to a file:\n");
			sText = obIn.nextLine();
			
		}*/
		
		//txt file
		File obTextFile = new File("MazeGame Files/GameTestCases/simple.txt");
		
		//Write to file
		//try() takes an AutoCloseable
		/*try(FileOutputStream obFOS = new FileOutputStream(obTextFile, true)) //true to append, false to overwrite
		{
			try(PrintWriter obPW = new PrintWriter(obTextFile))
			{
				obPW.write(sText);
				obPW.write("\n");
			} 
				
		} 
		catch (FileNotFoundException e1)
		{
			
			System.out.printf("%s\n", e1);
		} 
		catch (IOException e1)
		{
			
			System.out.printf("%s\n", e1);
		}
		*/
		
		String[] arrText = new String [10];
		
		
		//Read text back from file
		try(Scanner obIn = new Scanner( new DataInputStream(new FileInputStream(obTextFile)))) //dont need the "new DataInputStream(" 100% of the time
		{
			int i=0;
			while(obIn.hasNextLine())
			{
				//System.out.printf("%s\n", obIn.next());
				arrText[i++] = obIn.nextLine();
				
			}
		} 
		catch (FileNotFoundException e1)
		{
			
			System.out.printf("%s\n", e1);
		} 
		catch (IOException e1)
		{
			
			System.out.printf("%s\n", e1);
		}
		
		for(String sLine : arrText)
		{
			System.out.printf("%s\n", sLine);
		}
		
		/*arrText[9]+="append";
		System.out.printf(arrText[9]);*/
		
		
		
		
		
		
		
		
		
		
	}

}
