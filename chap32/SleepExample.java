package chap32;

public class SleepExample
{
	public static void main(String[] args)
	{
		System.out.printf("Before the big sleep\n");
		
		try
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("And spring is finally here");
		
	}
	
	
}
