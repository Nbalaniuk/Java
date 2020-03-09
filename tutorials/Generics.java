package tutorials;

import java.util.ArrayList;
import java.util.Vector;

public class Generics
{

	public static void main(String[] args)
	{
		ArrayList<String> obList = new ArrayList<>();
		Vector<Person> obVector = new Vector<>();
		
		Integer[] ints = {1,2,3,4,5};
		String[] strings = {"one","two","three","four","five"};
		Person[] Persons = {new Person("Bob", "Ross", 60), new Person("Steve", "Austin", 90)}; // Needs a toString method in the Person class
		
		print(ints);
		print(strings);
		print(Persons);

	}
	
	public static <T> void print(T[] someArray) // it replaces the 'T' with Integer during compille
	{
		for(T current : someArray)
		{
			System.out.printf("%s \n",current);
		}
	}

}
