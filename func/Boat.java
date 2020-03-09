package func;

public class Boat
{
	
	private String name;
	private String country;
	private int tonnage;
	private int draft;
	
	public Boat(String sName) // returns areference to the current boat object
	{
		this.name=sName;
	}
	
	public String getName()
	{
		return name;
	}
//	public void setName(String name)
//	{
//		this.name = name;
//	}
	public Boat setName(String sName)
	{
		this.name =sName;
		return this;
	}
	public String getCountry()
	{
		return country;
	}
	public Boat setCountry(String country)
	{
		this.country = country;
		return this;
	}
	public int getTonnage()
	{
		return tonnage;
	}
	public Boat setTonnage(int tonnage)
	{
		this.tonnage = tonnage;
		return this;
	}
	public int getDraft()
	{
		return draft;
	}
	public Boat setDraft(int draft)
	{
		this.draft = draft;
		return this;
	}
	@Override
	public String toString()
	{
		return String.format("Name:%-20s Country:%-25s Tonnage:%d  Draft %d", this.name,this.country,this.tonnage,this.draft);
	}
	
	
	
	
}
