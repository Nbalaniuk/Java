package func;

import java.util.ArrayList;

public class UniqueOld
{

	public static void main(String[] args)
	{
		int[] naNumbers = {3,6,8,8,4,6,3,3,5,6,9,6};
		
		ArrayList<Integer> obIntList = new ArrayList<>();
		
		for(int i=0; i<naNumbers.length;i++)
		{
			if(obIntList.indexOf(naNumbers[i]) == -1)
			{
				obIntList.add(naNumbers[i]);
			}
		}
		int nTotal =0;
		
		for(Integer nVal : obIntList)
		{
			System.out.printf("%d ",nVal);
			nTotal+=nVal;
		}
		System.out.printf("\nSum of unique values is: %d\n",nTotal);
		
	}

}
