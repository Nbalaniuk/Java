package chap32;

import java.util.Random;

public class MergeTest
{

	public static void main(String[] args)
	{
		Random obRand = new Random(12);
		int[] naVals = obRand.ints(10,1000)
						.limit(100)
						.toArray();
		
		Integer[] aTest = new Integer[naVals.length];
		for(int i=0;i<naVals.length;i++)
		{
			aTest[i] = naVals[i];
		}
		
		//Integer[] aTest = {12,19,21,31,7,14,3,2,1,11,21,27,13};
		
		Thread obThread = new Thread(new ThMergeSort<>(aTest));
		obThread.start();
		
		try
		{
			obThread.join();
		} 
		catch (InterruptedException e)
		{
			System.out.printf("%s",e);
		}
		
		//System.out.printf("%s \n",aTest);
		System.out.printf("Sorted result [");
		for(int i=0;i<aTest.length;i++)
		{
			System.out.printf("%s ",aTest[i]);
		}
		System.out.printf("]\n");
		
		
		
		
	}

}
