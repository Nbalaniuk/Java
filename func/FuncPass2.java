package func;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FuncPass2
{
	
	public static String processString(Function<String, String> func, String sTarget) // expecting a func reference to be passed, in and apply it to the target string
	{
		
		return func.apply(sTarget);
		
	}
	
	public static Function<String,String> upString = s -> s.toUpperCase(); // pure 
	
	
	public static void main(String[] args)
	{
		
		List<String> insList = Arrays.asList("Bryce ","Rob ","Rick ","Michael ","Coralee ");
		
		insList.forEach(s -> System.out.printf("%s",processString(upString, s))); // proccess string takes upString and applies it to every element in s
		System.out.printf("\n\n\n");
		insList.forEach(s -> System.out.printf("%s ",processString(x ->x.toLowerCase(),s))); // skips the upString func   x->x.toLower is the func, s is the string target
		System.out.printf("\n\n");
		insList.forEach(s-> System.out.printf("%s",s.toUpperCase())); // Skips both process string and upperString steps   for each element in insList, toUpper it and print it out
		
		
		
	}
	
	
}
