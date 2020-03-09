package tutorials;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;

public class Notes
{{
//Text files
	//PrintWriter to write
	//Scanner to read
	
	try(PrintWriter obPW = new PrintWriter("TextFile");)
	{
		
	} catch (FileNotFoundException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	//Binary Files
	//FileOutputStream to write
	//FileInputStream to read
	//OR DATA STREAMS
	
	
	File obBinaryFile = new File("asdasda");
	try(FileOutputStream obFOS = new FileOutputStream(obBinaryFile);)
	{
		
	} catch (FileNotFoundException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	try(DataOutputStream obDOS = new DataOutputStream(new FileOutputStream(obBinaryFile));)
	{
		obDOS.writeInt(5);
		
	} catch (FileNotFoundException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	try(DataInputStream obDIS = new DataInputStream(new FileInputStream(obBinaryFile));)
	{
		while(true)
		{
			System.out.printf(obDIS.readDouble()+"\n");
		}
	} catch (FileNotFoundException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//buffered IO improves disk performance, methods are the same
	//
	
	
	
	//Serializable interface
	try(ObjectOutputStream obOOS = new ObjectOutputStream(new FileOutputStream(obBinaryFile));)
	{
		
	} catch (FileNotFoundException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try(ObjectInputStream obOIS = new ObjectInputStream(new FileInputStream(obBinaryFile));)
	{
		
	} catch (FileNotFoundException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	//RAF
	File RAFile = new File("asd");
	try(RandomAccessFile obRAF = new RandomAccessFile(RAFile, "rw");)
	{
		
	} catch (FileNotFoundException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}}
