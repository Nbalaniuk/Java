package midterm2Prac;

public class Practice
{
	/**
	 * This method takes in a 2d array and return the average of all the integers
	 * @param naVals
	 * @return
	 */
	public static int countAverage(int[][] naVals)
	{
		if(naVals == null)
		{
			return 0;
		}
		int nReturn =0;
		for(int i =0; i<naVals.length; i++)
		{
			
			for(int j =0; j<naVals[i].length;j++)
			{
				nReturn += naVals[i][j];
			}
			
		}
		return nReturn;
	}
	/**
	 * takes in a 1d array and returns average
	 * @param naVals
	 * @return
	 */
	public static int countAverage(int[] naVals)
	{
		if(naVals == null)
		{
			return 0;
		}
		int nReturn =0;
		for(int i=0; i<naVals.length;i++)
		{
			nReturn += naVals[i];
		}
		
		return nReturn / naVals.length;
	}
	
	/*public static boolean checkValue(int [][] naVals, int nVal)
	{
		if(naVals == null)
		{
			return false;
		}
	}*/
	/**
	 * Reverses an array passed in
	 * @param naVals
	 * @return
	 */
	public static int[] reverseArray(int[] naVals)
	{
		if(naVals == null)
		{
			return null;
		}
		int[] naReturn = new int[naVals.length];
		int nCount =0;
		for(int i =naVals.length-1;i>=0;i--)
		{
		naReturn[i] = naVals[nCount];
		nCount++;
		
		}
		return naReturn;
	}
	
	
	/**
	 * Bubble sorts a variable
	 * Bubble sort is when one number is checked with neighbour and higher is shifted to the right.
	 * 192837465 > 129837465 > 128937465 > 128397465 > 128379465 > 128374965 > 128374695 > 128374659 etc...
	 * 
	 * 
	 * 
	 * @param naVals
	 * @return
	 */
	public static int[] bubbleSort(int[] naVals)
	{
		
		if(naVals == null)
		{
			return null;
		}
		int[] naResult = naVals;
		int nLength = naVals.length;
		int temp;
		for(int i =0; i<nLength-1; i++) // checks the entire row
		{
			for(int j =0;j <nLength-i-1;j++ ) // checks entire row save for the last J numbers as they are already in the correct place
			{
				if(naResult[j] > naResult[j+1])
				{
					temp = naResult[j];
					naResult[j] = naResult[j+1];
					naResult[j+1] = temp;
				}
				
				
			}
		}
		return naResult;
		
	}
	/**
	 * Checks to see if there is four consecutive int's in a row horizontally, vertically, diagonally
	 * @param naVals
	 * @return
	 */
	public static boolean isConsecutiveFour(int[][] naVals)
	{
		for(int i=0; i<naVals.length-3;i++)
		{
			for(int j=0; j<naVals[j].length-3;j++)
			{
				if(naVals[i][j] == naVals[i+1][j+1] && naVals[i][j] == naVals[i+2][j+2] && naVals[i][j] == naVals[i+3][j+4]) //Diagonal Check
				{
					return true;
				}
				if(naVals[i][j] == naVals[i][j+1] && naVals[i][j] == naVals[i][j+2]&& naVals[i][j] == naVals[i][j+3]) // Horizontal Check
				{
					return true;
				}
				if(naVals[i][j] == naVals[i+1][j] && naVals[i][j] == naVals[i+2][j] && naVals[i][j] == naVals[i+3][j] ) //Vertical Check
				{
					return true;
				}
				
				
			}
			
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
