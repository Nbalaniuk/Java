package chap13;
/**
 * simple definition for a person object
 * @author cst103
 *
 */
public class Person implements HasDrivers  /*for an interface */, Comparable<Person>
{
	
	private String sFirst, sLast;
	private String sAddress;
	
	private boolean bHasLic = false;
	
	private int nAge=0;
	
	
	public Person (String sFirst, String sLast, String sAdd)
	{
		this.sAddress= sAdd;
		this.sFirst = sFirst;
		this.sLast = sLast;
	}
	
	public void setAge(int nAge)
	{
		this.nAge = nAge;
	}
	
	public int getAge()
	{
		return this.nAge;
	}
	
	public String getFirst()
	{
		return this.sFirst;
	}
	
	/**
	 * Used to set the status for the associated person object having a drivers license
	 * @param bStat
	 */
	public void setLstatus(boolean bStat)
	{
		this.bHasLic = bStat;
	}
	
	public String getName()
	{
		return this.sLast + ", " + this.sFirst;
	}
	
	public String getAddress()
	{
		
		return this.sAddress;
		
	}
	
	public void  setAddress (String sAddr)
	{
		this.sAddress = sAddr;
		
	}
	
	@Override
	public String toString()
	{
		
		return String.format("%20s\t Address: %20s  Age:%d" , this.getName(), this.sAddress, this.nAge);	
		
	}
	/**
	 * The persons are equal if the first and the last name of the person are the same
	 */
	@Override
	public boolean equals(Object obRef)
	{
		if(obRef instanceof Person)
		{
			
			Person obOther = (Person) obRef;
			
			return this.sFirst.equals(obOther.sFirst) && this.sLast.equals(obOther.sLast);
			
		}
		
		return false;
		
	}


	@Override
	public boolean hasLicense()
	{
		
		return this.bHasLic;
	}

	@Override
	public int compareTo(Person obOther)
	{
		
		return this.sLast.compareTo(obOther.sLast);
	}
	
	/*
	public int compareToFirst(Person obOther)
	{
		
		return this.sFirst.compareTo(obOther.sFirst);
	}
*/
	/*@Override
	public int compareTo(Object arg0)
	{
		if(arg0 instanceof Person)
		{
			Person obOther = (Person) arg0;
			return this.sLast.compareTo(obOther.sLast);
		}
		return 0;
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
