package chap13;

public class PersonC implements Cloneable
{
	
	private String  sFirst, sLast;
	private int nAge;
	private Address obAddr;
	
	
	
	
	public PersonC(String sFirst, String sLast, int nAge, Address obAddress)
	{
		this.sFirst= sFirst;
		this.sLast = sLast;
		this.setnAge(nAge);
		this.obAddr = obAddress;
		
	}





	public String getsFirst()
	{
		return sFirst;
	}





	public void setsFirst(String sFirst)
	{
		this.sFirst = sFirst;
	}





	public String getsLast()
	{
		return sLast;
	}





	public void setsLast(String sLast)
	{
		this.sLast = sLast;
	}





	public int getnAge()
	{
		return nAge;
	}





	public void setnAge(int nAge)
	{
		if(nAge <0 || nAge > 110)
		{
			this.nAge =21;
		}
		else
		{
		this.nAge = nAge;
		}
		
		
	}
	
	
	public void setCity(String sCity)
	{
		this.obAddr.setsCity(sCity);
	}
	
	@Override
	public String toString()
	{
		
		return String.format("Name%30s Age:%d  Address%S", this.sLast+"," + this.sFirst, this.nAge, this,obAddr);
		
	}
	
	@Override
	public Object clone()
	{
		//the next part of the code describes a try-catch block - that gets defined next semester
		try
		{
			//return super.clone(); <-- THIS IS A SHALLOW COPY
			
			//DEEP COPY   VVVVVVV
			PersonC obCopy = (PersonC) super.clone();
			//obCopy.obAddr = new Address(this.obAddr.getsCity(), this.obAddr.getsAddress());
			obCopy.obAddr = (Address) this.obAddr.clone();
			return obCopy;
		}
		catch(CloneNotSupportedException exp) //go through and copy all primitive vars
		{
			return null;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
