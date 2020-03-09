package chap32;

public class CountDown implements Runnable
{

	private int nTime;
	
	public CountDown(int nTime)
	{
		this.nTime= nTime;
	}
	
	public static void main(String[] args)
	{
		
	}

	@Override
	public void run()
	{
		
		
		for(int i=0;i<this.nTime;i++)
		{
			System.out.printf("%d",i);
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}





