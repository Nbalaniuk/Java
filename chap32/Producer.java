package chap32;

public class Producer implements Runnable
{

	private Buffer obBuffer;
	
	public Producer(Buffer obBuffer)
	{
		this.obBuffer = obBuffer;
	}
	
	

	@Override
	public void run()
	{
		
		try {
			
			for(int i=0;i<100;i++)//will try to write to the buffer
			{
				System.out.printf("%s Writes %d\n",Thread.currentThread().getName(),i);
				this.obBuffer.write(i);
				Thread.sleep((int) (Math.random()*500));
			}
			
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
