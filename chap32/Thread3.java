package chap32;

public class Thread3
{

	public static void main(String[] args)
	{
		
		Thread obTh1 = new Thread (()->{
			for(int i=0;i<40;i++)
			{
				System.out.printf("%s:%d\n",Thread.currentThread().getName(), i);
			}
		},"First");
		
		obTh1.start();
		//wait for the running thread to rejoin us
		//first and simplest form of thread synchronization
		
		try
		{
			obTh1.join();
		} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("The program is done\n");
		
	}

}
