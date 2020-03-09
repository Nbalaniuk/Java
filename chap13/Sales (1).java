package chap13;
/**
 * This class describes an employee who is employeed as a sales perseon
 * These people and automnatically part of the sales group
 * They are paid using the formula: Base + totalSales * commision rate.
 * Base salaries shall be between 300 and 700. if out of range, assign base = 300
 * Commision rates will be between 3 and 5%
 * if we call  setrate we are actually changing the commision rate.
 * 
 * @author cst103
 *
 */
public class Sales extends Employee
{
	
	private final double BASE_SALARY_MIN= 300;
	private final double BASE_SALARY_MAX = 700;
	private final double LOW_RATE = 0.03;
	private final double HIGH_RATE = 0.05;
	
	
	private double dComRate;
	private double dTotalSales;
	private double dBase;

	@Override
	public double getPayAmount()
	{
		
		return this.dBase + this.dTotalSales * this.dComRate;
	}

	@Override
	public void setRate(double dRate)
	{
		if(dRate > LOW_RATE && dRate < HIGH_RATE)
		{
			this.dComRate = dRate;
		}
		else
		{
			this.dComRate = LOW_RATE;;
		}

	}
	
	
	/**
	 * 
	 * @param obPerson	Person object id for the person
	 * @param dRate	Commision sales rate
	 * @param dBase Base salary for this individual
	 */
	public Sales(Person obPerson, double dRate, double dBase)
	{
		
		super(obPerson, Department.Sales);
		this.setRate(dRate);
		if(this.dBase >= BASE_SALARY_MIN && dBase <= BASE_SALARY_MAX)
		{
			this.dBase =dBase;
		}
		else
		{
			this.dBase = BASE_SALARY_MIN;
		}
		
		
		
		
	}
	
	/**
	 * Total sales for the sales person descibed
	 * @param dSalesAmount
	 */
	public void setSales(double dSalesAmount)
	{
		this.dTotalSales = dSalesAmount;
	}
	
	@Override
	public String toString()
	{
		
		return String.format("%s Rate:  %.1f %% \t Base Amount:%.2f",super.toString(), this.dComRate*100, 
				this.dTotalSales );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
