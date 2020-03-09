package chap32;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bank
{
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		
		Account obAcc = new Account();
		
		Runnable obDepPenny = ()->//can also create a runnable class
		{
			obAcc.deposit(1);
		};
		
		
		ExecutorService obExec = Executors.newFixedThreadPool(5);
		
		for(int i=0;i<100;i++)
		{
			
			obExec.execute(obDepPenny);
			
		}
		obExec.shutdown();
		while(!obExec.isTerminated());
		System.out.printf("The final Account balance is %d\n",obAcc.getBalance());
		
		
	}

}
