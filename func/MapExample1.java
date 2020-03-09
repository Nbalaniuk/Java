package func;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapExample1
{

	public static void main(String[] args)
	{
		Integer[] aVals = {19,21,34,45,27,19,33};
		//How do i turn this to a stream - Int Strea,
		
		Stream<Integer> obStream = Arrays.stream(aVals);
		
		
		//demo 1 of mpa
		obStream
			.map(x -> x*2)
		 	.forEach(x-> System.out.printf("%d ",x));
		System.out.printf("\n");
		
		Arrays.stream(aVals)
			.filter(x-> x%2==0)
			.map(x->x*2)
			.forEach(x -> System.out.printf("%d ",x));
	}
	
}
