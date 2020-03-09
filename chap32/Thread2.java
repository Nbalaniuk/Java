package chap32;

public class Thread2
{

	public static void main(String[] args)
	{
		
		
		Runnable obRun = new Runnable()
		{
			
			@Override
			public void run()
			{
				System.out.printf("From the anonymous Run Class\n");
			}
		};
		
		Thread obThread = new Thread(obRun);
		obThread.start();
		
		Runnable r2 = () -> System.out.printf("First cut at a lambda thread\n");
		
		
		Thread obTh2 = new Thread(r2);
		obTh2.start();
		
		
		Runnable r3 = ()->
		{
			//Note Threads have no concept of "this". However there are static methods associated with the thread that will allow us to
			//work with some state information
			Thread obCurrent = Thread.currentThread();
			
			for(int i=0; i<40;i++)
			{
				System.out.printf("Thread name is %s State is %s\n", obCurrent.getName(), obCurrent.getState());
			}
			
			
		};
		//Note that as part of a thread constructor that you can pass in a name as the second argument in the constructor
		
		
		
		Thread obTh3 = new Thread(r3, "Batman");
		Thread obTh4 = new Thread(r3, "Robin");
		obTh3.start();
		obTh4.start();
		

	}

}
