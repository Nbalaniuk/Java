package func;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonsSort
{

	public static void main(String[] args)
	{
		
		List<String> insList = Arrays.asList("Bryce ","Rob ","Rick ","Michael ","Coralee ");
		//List is describesd as a "collection" (more on this later) and can be acted upon by the collections objects
		//Specifically we can apply some static methods to manupulate the List objects
		
		Collections.sort(insList);
		insList.forEach(s-> System.out.printf("%s ",s));
		Collections.sort(insList, (x,y) ->x.length()-y.length()); // 
		System.out.printf("\n\n");
		insList.forEach(s -> System.out.printf("%s ",s));
		
		
		Collections.sort(insList, (x,y) ->y.length()-x.length()); // 
		System.out.printf("\n\n");
		insList.forEach(s -> System.out.printf("%s ",s));
		
		//Collections.sort(insList, (x,y)-> y.length()-x.length());
		
		
	}

}
