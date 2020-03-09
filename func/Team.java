package func;

public class Team
{
	private String sName;
	private String sCity;
	private int nWins,nLosses;
	private double dSalaryHit;
	
	public Team(String sName, String sCity, int nWins, int nLosses)
	{
		this.sName= sName;
		this.sCity = sCity;
		this.nLosses=nLosses;
		this.nWins=nWins;
	}
	
	
	
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return String.format("City %-20s Name %-20s Wins:%d Losses %d" , this.sCity, this.sName, this.nWins,this.nLosses);
		
	}
	
	
	public Team()
	{
		
	}
	
	
	public Team setName(String sName)
	{
		this.sName= sName;
		return this;
	}
	
	public Team setCity(String sCity)
	{
		this.sCity= sCity;
		return this;
	}
	
	public Team setWins(int nWins)
	{
		this.nWins=nWins;
		return this;
	}
	
	public Team setLosses(int nLosses)
	{
		this.nLosses=nLosses;
		return this;
	}
	public Team setSalary(double dVal)
	{
		this.dSalaryHit = dVal;
		return this;
	}
	
	public String getName()
	{
		return this.sName;
	}
	public String getCity()
	{
		return this.sCity;
	}
	public int getWins()
	{
		return this.nWins;
	}
	public int getLosses()
	{
		return this.nLosses;
	}
	public double getSalary()
	{
		return this.dSalaryHit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public boolean equals (Object obRef)
	{
		if(obRef instanceof Team)
		{
			return this.sName.equals(((Team)obRef).sName);
		}
		else
		{
			return false;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
