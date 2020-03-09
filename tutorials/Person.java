package tutorials;

import java.io.Serializable;

public class Person implements Serializable //any children objects must also implement serializable, DOES NOT GIVE AN ERROR IF YOU DON'T
{
	
	
	public String sFName;
	public String sLName;
	public int nAge;
	public Shape obShape;
	
	
	public Person(String sFName, String sLName, int nAge)
	{
		this.sFName=sFName;
		this.sLName=sLName;
		this.nAge=nAge;
		
	}
	

	public static void main(String[] args)
	{
	
	}
	
	@Override
	public String toString()
	{
		
		return String.format("Name: %s %s Age:%d", this.sFName,this.sLName,this.nAge);
	}

}
