package chap13;

public class Hourly extends Employee
{
	
	private double dRate;
	private double dHours;
	
	private final int MIN_HOURS =50;
	private final int MAX_HOURS = 110;
	private final int REGULAR_HOURS =80;
	
	private final double MIN_RATE = 15.0;
	private final double MAX_RATE=25.0;
	
	
	
	public Hourly(Person obPerson, Department eDept, double dRate)
	{
		super(obPerson, eDept); //calling the super class constructor
		
		this.setRate(dRate);
		
		
	}
	
	/**
	 * This method will set the amount of hours an employee worked in a pay period
	 * assuming a pay period is two weeks the minimun amount of time an employe emight work is 50 hours 
	 * and the max will be 110 hours. if the set attempts to set the value less than 50, then set it to 50, if
	 * the amount of time is over 110, set to 110
	 * @param dHours
	 */
	public void setHours(double dHours)
	{
		if(dHours <MIN_HOURS )
		{
			this.dHours =MIN_HOURS;
		}
		else
		{
			if(dHours > MAX_HOURS)
			{
				this.dHours =MAX_HOURS;
			}
			else
			{
				this.dHours = dHours;
			}
		}
		
	}
	
	
	
	/**
	 * This will calculate the payment amount for tan hourly employee based unpon the following formula
	 * if the employee has worked regular hours or less
	 * then pay amount = hours * payrate
	 * else
	 * payamount = regularHours*payRate + (Hours-Regular hours)*1.5*payrate
	 */
	@Override
	public double getPayAmount()
	{
		if(this.dHours <= REGULAR_HOURS)
		{
			double dReturn = (this.dHours * this.dRate)/100;
			return dReturn * 100.0;
		}
		else
		{
			return REGULAR_HOURS * this.dRate + (this.dHours-REGULAR_HOURS)*1.5 * this.dRate;
		}
	}
	/**
	 * Hourly set rate methodcompany policy is that al hourly employees make beween 15 and 25 $ / hour
	 * 
	 */
	@Override
	public void setRate(double dRate)
	{
		if(dRate >= MIN_RATE && dRate <= MAX_RATE)
		{
		this.dRate = dRate;
		
		}
		else
		{
		this.dRate =MIN_RATE;
		}
	}

	
	
	
	public double getRate()
	{ 
		return this.dRate;
	}
	
	
	
	
	
	@Override
	public String toString()
	{
		return String.format("%s Hours worked: %.1f", super.toString(), this.dHours);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
