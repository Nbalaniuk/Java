package func;

import java.util.Arrays;

public class UniqueStream
{

	public static void main(String[] args)
	{
		
		int[] naNumbers = {3,6,8,8,4,6,3,3,5,6,9,6};
		
		//Following will create a stream off of the integer array
		int nTotal = (int)Arrays.stream(naNumbers)
							.distinct()// writes into a new stream with only the unique values
							.sum();//sums them up 
		
		System.out.printf("The sum of the unique values is %d\n",nTotal);
		Arrays.stream(naNumbers)
				.distinct()
				.sorted()
				.forEach(x -> System.out.printf("%d ",x));
		
		
		System.out.printf("\nList of Numbers less than 6\n");
		//Lets list all the numbers in the stream that are less than 6
		Arrays.stream(naNumbers)
					.distinct()
					.filter(x -> x<6)//predicate will return a true/false statement
					.forEach(x-> System.out.printf("%d ",x));
		
		//count all the even numbers in the origional stream
		//System.out.printf("\nThe count of even numbers are\n");
		int nCount =(int)Arrays.stream(naNumbers)
					.filter(x -> x%2==0)
					.count();
					
		System.out.printf("\nThere were %d even numbers in the list",nCount);
		
	}
	
	
}
