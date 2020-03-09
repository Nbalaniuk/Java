package func;

import java.util.Arrays;
import java.util.List;

public class CompUsage
{
	
	public static void main(String[] args)
	{
		
		List<String> sList = Arrays.asList("Bob","Sally","Mike","Betty");    // list is an abstract object
		
		sList.forEach(new ConsImp<>());
		
		sList.forEach(x -> System.out.printf("\n%s",x));
		
		
		Integer[] naVals = {13,17,22,19,3};
		List<Integer> nList = Arrays.asList(naVals);
		
		
		nList.forEach(x ->System.out.printf("\n%d",x*x));
		
		
		
	}
	
}
