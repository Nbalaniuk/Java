package chap32;



public class ThMergeSort<T extends Comparable<T>> implements Runnable
{

	private T[] aVals;
	
	public ThMergeSort(T[] aVals)
	{
		this.aVals=aVals;
	}
	
	
	
	@Override
	public void run()
	{
		if(this.aVals.length>1)
		{
			
			
			
			System.out.printf("Thread %s looking at [ ",Thread.currentThread().getName());
			for(int i=0;i<this.aVals.length;i++)
			{
				System.out.printf("%s ",aVals[i]);
			}
			System.out.printf("]\n");
			
			
			
			
			
			
			int nMid = this.aVals.length/2;
			
			T[] aFirstHalf = (T[])new Comparable[nMid];
			T[] aSecondHalf = (T[])new Comparable[this.aVals.length-nMid];
			
			System.arraycopy(this.aVals, 0, aFirstHalf, 0, nMid);
			System.arraycopy(this.aVals, nMid, aSecondHalf, 0, this.aVals.length-nMid);
			
			Thread obTh1 = new Thread(new ThMergeSort<>(aFirstHalf));
			Thread obTh2 = new Thread(new ThMergeSort<>(aSecondHalf));
			
			obTh1.start();
			obTh2.start();
			
			//Synchronize we have to wait for both threads to finish
				try
				{
					obTh1.join();
					obTh2.join();
				} 
				catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				merge(aFirstHalf, aSecondHalf, this.aVals);
			
			}//end of if
			
		}//end of run
		
		private  <T extends Comparable<T>>void merge(T[] aOne, T[] aTwo, T[] aResult)
		{
			int nOne =0,nTwo=0,nRes=0;
			while(nOne <aOne.length && nTwo <aTwo.length)
			{
				if(aOne[nOne].compareTo(aTwo[nTwo] )< 0)
				{
					aResult[nRes++] = aOne[nOne++];
				}
				else
				{
					aResult[nRes++] = aTwo[nTwo++];
				}
			}
			
			while(nOne < aOne.length)
			{
				aResult[nRes++] = aOne[nOne++];
			}
			while(nTwo < aTwo.length)
			{
				aResult[nRes++]= aTwo[nTwo++];
			}
			
			
			
			
			
		}
		
		
}
	
	
	
	
	
	
	
	
	
	
	

