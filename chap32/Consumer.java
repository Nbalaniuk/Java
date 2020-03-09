package chap32;

public class Consumer implements Runnable
{
	
	private Buffer obBuffer;
	
	public Consumer(Buffer obBuffer)
	{
		this.obBuffer = obBuffer;
	}
	
	
	
	@Override
	public void run()
	{
		
		try 
		{
			
			System.out.printf("%s is attempting to read\n",Thread.currentThread().getName());
			for(int i=0; i<100;i++)
			{
				int nVal = this.obBuffer.read();
				System.out.printf("%s has read %d \n",Thread.currentThread().getName(),nVal);
				if(nVal >100)
				{
					break;
				}
				
				Thread.sleep((int)( Math.random()*500));
				
				
				
			}
			
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

	

}
