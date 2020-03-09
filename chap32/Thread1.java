package chap32;

public class Thread1
{

	public static void main(String[] args)
	{
		PrintChar obPrintA = new PrintChar(100, 'a');
		PrintChar obPrintB = new PrintChar(100, 'b');
		
		//Non thread example
		
		obPrintA.run();
		obPrintB.run();

		//Create some threads to work with
		
		Thread obT1 = new Thread(obPrintA);
		Thread obT2 = new Thread(obPrintB);
		Thread obT3 = new Thread(new PrintChar(100, 'c'));
		Thread obT4 = new Thread(new CountDownEx(155));
		
		//we have to start the threads up - we call the start method assiciated with the thread
		//this is a non blocking call that will start the thread up, and it will call the run method when it is "in" the cpu
		
		obT1.start();
		obT2.start();
		obT3.start();
		obT4.start();
		
		System.out.printf("\nThats all folks!!!\n");
		
		
	}

}




class PrintChar implements Runnable
{
	
	private int nTimes;
	private char cVal;
	
	
	public PrintChar(int nTimes, char cVal)
	{
		this.nTimes=nTimes;
		this.cVal=cVal;
		
	}
	

	@Override
	public void run()
	{
		for(int i=0; i<this.nTimes;i++)
		{
			System.out.printf("%c ", this.cVal);
		}
		System.out.printf("\n");
		
	}
	
}



class CountDownEx implements Runnable
{
	private int nTimes;
	
	public CountDownEx (int nTimes)
	{
		this.nTimes = nTimes;
	}
	

	@Override
	public void run()
	{
		for(int i=this.nTimes;i>0;i--)
		{
			System.out.printf("%d ",i);
		}
		System.out.printf("\n");
		
	}
	
}

