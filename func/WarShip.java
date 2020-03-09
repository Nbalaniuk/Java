package func;

public class WarShip
{
	
	private String sName;
	private String sNavy;
	private String sShipClass;
	private int nLaunchDate;
	private int nTonnage;
	
	public WarShip()
	{
		
	}
	
	public WarShip setName(String sName)
	{
		this.sName= sName;
		return this;
	}
	
	public String getName()
	{
		return this.sName;
	}
	
	public WarShip setNavy(String sNavy)
	{
		this.sNavy= sNavy;
		return this;
	}
	
	public String getNavy()
	{
		return this.sNavy;
	}
	
	public WarShip setShipClass(String sClass)
	{
		this.sShipClass = sClass;
		return this;
	}
	
	public String getShipClass()
	{
		return this.sShipClass;
	}
	
	public WarShip setLaunchDate(int nDate)
	{
		this.nLaunchDate = nDate;
		return this;
	}
	
	public int getlaunchDate()
	{
		return this.nLaunchDate;
	}
	
	public WarShip setTonnage(int nTon)
	{
		this.nTonnage= nTon;
		return this;
	}
	public int getTonnage()
	{
		return this.nTonnage;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
