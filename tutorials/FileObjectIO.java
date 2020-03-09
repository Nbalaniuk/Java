package tutorials;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class FileObjectIO
{

	public static void main(String[] args)
	{
		
		Person obPerson = new Person("John", "Smith", 40);
		//Create new object and write it to a file
		File obFile = new File("src/tutorials/testFile");
		
		try(ObjectOutputStream obOOS = new ObjectOutputStream(new FileOutputStream(obFile)))
		{
			
			obOOS.writeObject(obPerson);
			
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
		//Text - use scanner /writer
		//Objects use object IO Streams
		
		Person obReadPerson;
		//Read object and print it out from a file.
		try(ObjectInputStream obOIS = new ObjectInputStream(new FileInputStream(obFile)))
		{
			obReadPerson = (Person) obOIS.readObject();
			System.out.printf("My name is: %s, %s. Age:%d\n", obReadPerson.sLName, obReadPerson.sFName, obReadPerson.nAge);
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
