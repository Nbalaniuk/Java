package func;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Infinite
{

	public static void main(String[] args)
	{
		
		
		IntStream.iterate(0, x->x+1)
				.limit(1000)
				.forEach(x -> System.out.printf("%d ",x));
		
		
		System.out.printf("\n");
		System.out.printf("Maximum Integer Value is %d \n", Integer.MAX_VALUE);
		System.out.printf("Minimum Integer Value is %d \n", Integer.MIN_VALUE);
		//We can apply the usual filter functionality for those
		
		IntStream.iterate(0, x->x+1)
		.limit(100)
		.filter(x->x >10 && x<20)
		.forEach(System.out::println); // the 2 :: is equivalent       .forEach(System.out::println);
		//Equivalent to calling .forEach (x-> System.out.println(x) )
		
		//In the case where your all your lambda expression does is call another method with the value of lambda
		//we have another syntactic shortcut to cover that/handle that
		
		System.out.printf("RNG'ing \n");
		//Generating Random Numbers
		Random obRandom = new Random(1200); // The "seed" makes it generate the same set of numbers
		obRandom.ints()
				.limit(10)
				.forEach(System.out::println);
		
		//Putting limits on the random numbers
		
		System.out.printf("\n\nGenerating random in a range\n");
		
		obRandom.ints(10,100)
				.limit(10)
				.sorted()
				.forEach(x-> System.out.printf("%d ",x));
		
		
		System.out.printf("\n\nGenerating Random Numbers in a range into an Array");
	int[] naRands =	obRandom.ints(10,100)
								.limit(10)
								.sorted()
								.toArray();
		
		
		for(int nVal : naRands)
		{
			System.out.printf("%d ",nVal);
		}
		
		
		
		List<Integer> obList = obRandom.ints(10,100)
								.limit(10)
								.sorted()
								.boxed()
								.collect(Collectors.toList());

	}
	 
}
