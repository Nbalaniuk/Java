package chap13;

import java.util.ArrayList;

public class CloneExplanation 
{

	
	public static void main(String[] args) 
	{
	
		
		ArrayList<PersonC> obList1 = new ArrayList<>();
		ArrayList<PersonC> obList2 = new ArrayList<>();
		
		
		//Load first array list with 3 names
		obList1.add(new PersonC("Stan","Smith",24, new Address("Edmonton", "16 Melbourne Ave")));
		obList1.add(new PersonC("Sally","Jones",29,new Address("Calgary", "17 Pearson Way")));
		obList1.add(new PersonC("Jane","Franks",19, new Address("Saskatoon", "33 Konhowski Drive")));
		
		//copy elements
		for(int i=0;i<obList1.size();i++)
		{
			obList2.add((PersonC) obList1.get(i).clone());
		}
		for(PersonC obPer : obList1)
		{
			obPer.setnAge(33);
			obPer.setsLast("Jones");
			obPer.setCity("Regina");
			
		}
		for(PersonC obPer : obList2)
		{
			System.out.printf("%s \n",obPer);
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
