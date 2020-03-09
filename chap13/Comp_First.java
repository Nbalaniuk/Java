package chap13;

import java.util.Comparator;

public class Comp_First implements Comparator<Person>
{
	
	@Override
	public int compare(Person o1, Person o2)
	{
		
		return o1.getFirst().compareTo(o2.getFirst());
	}
	
}
	
	

