package chap13;

public abstract class Employee
{
	
	private Person obPerson;
	private int empID;
	private Department eDept;
	private static int nCurrentNumber =1;
	
	/**
	 * Contrusctor method will create a reference to the passed in person and in addition willasign an employee number
	 * to that person 
	 * @param obPerson
	 * @param Dept
	 */
	public Employee(Person obPerson, Department Dept)
	{
		this.obPerson = obPerson;
		this.eDept = Dept;
		this.empID = Employee.nCurrentNumber++;
		
	}
	
	
	public Department getDept()
	{
		return this.eDept;
	}
	
	public void setDept(Department sDept)
	{
		this.eDept = sDept;
	}
	
	public void changeAddress(String sAddr)
	{
		this.obPerson.setAddress(sAddr);
	}
	
	
	
	@Override
	public boolean equals(Object obRef)
	{
		
		if(obRef instanceof Employee)
		{
			
			return this.empID == ((Employee) obRef).empID;
			
		}
		
		
		return false;
	}
	
	
	
	@Override
	public String toString()
	{
		
		return String.format("%-40s Department:%-20s ID:%d",this.obPerson, this.eDept.getDesc(), this.empID);
		
	}
	
	
	
	
	//Abstract methods
	
	public abstract double getPayAmount();
	
	public abstract void setRate(double dRate);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
