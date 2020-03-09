package chap13;

/**
 * This will create a salary class to represent those employees who make a base rate regardless
 * of the hours that they work or the number of sales they make
 * In this case the rate is their 2 week total salary
 * @author cst103
 *
 */
public class Salaried extends Employee
{
	
	private double dAmount;
	

	@Override
	public double getPayAmount()
	{
		
		return this.dAmount;
	}

	@Override
	public void setRate(double dRate)
	{
		
		this.dAmount = dRate;

	}

	public Salaried(Person obPerson, Department eDept, double dRate)
	{
		super(obPerson, eDept);
		
		this.dAmount = dRate;
		
		
	}
	
	
	
	public String toString()
	{
		return String.format("%s Salary:$%.2f", super.toString(), this.dAmount);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
