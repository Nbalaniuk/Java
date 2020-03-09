package chap13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ShowStuff
{

	public static void main(String[] args)
	{
		
		ArrayList<Person> obList = new ArrayList<>();
		
		
		obList.add(new Person("James","Jefferson","77 Haight Cres"));
		obList.add(new Person("Bill","Nye","123 Science Ave"));
		obList.add(new Person("Sally","Forth","71 Haight Cres"));
		obList.add(new Person("Dagwood","Bumstead","99 Haight Cres"));
		obList.add(new Person("Steve","Davids","43 Haight Cres"));
		obList.add(new Person("Kathy","Klette","97 Haight Cres"));
		
		obList.get(0).setAge(33);
		obList.get(1).setAge(35);
		obList.get(2).setAge(23);
		obList.get(3).setAge(49);
		obList.get(4).setAge(19);
		obList.get(5).setAge(29);
		
		obList.get(2).setLstatus(true);
		obList.get(5).setLstatus(true);
		
		for(Person obPer : obList)
		{
			if(obPer.hasLicense())
			{
				System.out.printf("%s \n",obPer);
			}
		}
		
		
		//HasDrivers obDriver = new HasDrivers(); // cant do this with and interface, because it has an abstract method
		
		ArrayList<HasDrivers> obDriversList = new ArrayList<>(obList.size());
		
		//Collections.copy(obDriversList, obList); doesnt work, need to have non null elements
		
		
		for(Person obPer : obList)
		{
			obDriversList.add(obPer);
		}
		
		/**
		 * Print out the list from the HasDrivers perspective
		 */
		for(HasDrivers obDrive:obDriversList)
		{
			System.out.printf("%s\n", obDrive);
			
		}
		
		System.out.printf("\nShow Standard Sort\n");
		showSort1(obList);
		System.out.printf("\nShow Sort by age\n");
		showSort2(obList);
		System.out.printf("\nShow Sort by first name\n");
		showSort3(obList);
		
		
		//For next semester - To sort by address
		Collections.sort(obList,(x,y) -> x.getAddress().compareTo(y.getAddress()));
		
		
	}
	
	/**
	 * Thiss will just sort the given list then print out the elements in the list
	 * @param obList
	 */
	private static void showSort1(ArrayList<Person> obList)
	{
		
		//Sort the list first using the compareTo method
		Collections.sort(obList);
		Collections.reverse(obList);
		
		for(Person obPer:obList)
		{
			System.out.printf("%s\n",obPer);
		}
		
		
		
		
	}
	
	
	
	private static void showSort2(ArrayList<Person> obList)
	{
		// Sort based upon age
		
		Collections.sort(obList, new Comp_Age());
		for(Person obPer:obList)
		{
			System.out.printf("%s\n",obPer);
		}
		
		
		
	}
	
	private static void showSort3(ArrayList<Person> obList)
	{
		
		Collections.sort(obList, new Comp_First());
		for(Person obPer:obList)
		{
			System.out.printf("%s\n",obPer);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
