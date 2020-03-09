package tutorials;

public class RecursionEx
{

	public static void main(String[] args)
	{
		//Recursive case will somehow move you towards the base case, the base case is the last case
		System.out.printf("Fibonacci Sequence\n");
		//System.out.printf("%d",fib(5));
		//fib(5);
		int n=3;
		//System.out.printf("The %d number is %d",n, fib(n));
		
		
		int[] intArray = {6,8,3,5,8,2,4,6,1,3,1};
		for(int nVal: intArray)
		{
			System.out.printf("%d ",nVal);
		}
		mergeSort(intArray);
		System.out.printf("After sorting ");
		for(int nVal: intArray)
		{
			System.out.printf("%d ",nVal);
		}
		
	}
	
	//Fibonacci
	/**
	 * 
	 * @param nVal Value to start at
	 * @return numbers in sequence.
	 */
	public static  int fib(int  nVal)
	{
		
		//basecase
		if(nVal <=1)
		{
			return nVal;
		}
		else //recursive case
		{
			return fib(nVal -1)+fib(nVal -2);
		}
		
		
	}
	
	
	//mergeSort
	public static void mergeSort(int[] naVal)
	{
		//Basecase
		if(naVal.length<=1)
		{
			return;
		}
		else
		{
			int nMid = naVal.length / 2;
			
			int[] naFirstHalf = new int [nMid];
			System.arraycopy(naVal, 0, naFirstHalf, 0, nMid);
			mergeSort(naFirstHalf);
			
			int[]naSecondHalf = new int [naVal.length -nMid];
			System.arraycopy(naVal, nMid, naSecondHalf, 0, naVal.length - nMid);
			mergeSort(naSecondHalf);
			
			int[] aMergeResult = merge(naFirstHalf, naSecondHalf);
			
			System.arraycopy(aMergeResult, 0, naVal, 0, naVal.length);
			
		}
		
	}
	
	/**
	 * Takes 2 sorted int arrays and merges them into a 3rd array 
	 * @param naVals1
	 * @param naVals2
	 * @return
	 */
	public static int[] merge(int[] naVals1, int[] naVals2)
	{
		int nPos1 =0, nPos2=0,nPos3=0;
		
		int[] naReturn = new int[naVals1.length + naVals2.length];
		
		while(nPos1 < naVals1.length && nPos2 < naVals2.length) // goes until one array is empty
		{
			if(naVals1[nPos1] <= naVals2[nPos2])
			{
				naReturn[nPos3++] = naVals1[nPos1++];
			}
			else
			{
				naReturn[nPos3++] = naVals2[nPos2++];
			}
		}
		
		while(nPos1 < naVals1.length) // one of the 2 arrays will be empty because it will go through the other first, these 2 loops take care of that.
		{
			naReturn[nPos3++] = naVals1[nPos1++];
		}
		
		while(nPos2 < naVals2.length)
		{
			naReturn[nPos3++] = naVals1[nPos2++];
		}
		
		
		return naReturn;
	}
	
	
	
	//factotial
	public static int factorial(int naVal)
	{
		if(naVal <2)//base case
		{
			return 1;
		}
		else //recursive case
		{
			return naVal * factorial(naVal-1);
		}
	}
	
	
	
	
	
	
	
	
	
	

}
