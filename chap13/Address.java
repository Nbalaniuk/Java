package chap13;

public class Address implements Cloneable
{
	
	private String sCity;
	private String sAddress;
	
	public Address(String sCity, String sAddr)
	{
		this.sAddress = sAddr;
		this.sCity =sCity;
		
	}

	public String getsCity()
	{
		return sCity;
	}

	public void setsCity(String sCity)
	{
		this.sCity = sCity;
	}

	public String getsAddress()
	{
		return sAddress;
	}

	public void setsAddress(String sAddress)
	{
		this.sAddress = sAddress;
	}
	
	@Override
	public String toString()
	{
		return String.format("City: %15s  Address:%30s" , this.sCity, this.sAddress);
	}
	
	@Override
	public Object clone()
	{
		try
		{
			return super.clone();
		}
		catch(CloneNotSupportedException exp)
		{
			return null;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
