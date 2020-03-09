package chap13;


import java.util.ArrayList;

public class WorkPlace
{

	public static void main(String[] args)
	{
		
		//Employee obEmp = new Employee(new Person("Jim","Jones","17 koolaid Way"), Department.Sales);
		
		
		ArrayList<Employee> obEmpList = new ArrayList<>();
		
		obEmpList.add(new Hourly(new Person("Jim", "Jones", "17 Koolaid Way"), Department.IT, 21.12));
		((Hourly) obEmpList.get(0)).setHours(40);
		obEmpList.add(new Hourly(new Person("Sally", "Smith", "14 Park Way"), Department.marketing, 19.75));
		
		Sales obSales = new Sales(new Person("Rick","Reynolds","1 Express Way") , 0.03, 450.0);
		obSales.setSales(12000);
		obEmpList.add(obSales);
		Sales obSales2 = new Sales(new Person("Sally","Forth","19 River Heights") , 0.05, 300.0);
		obSales2.setSales(15000);
		obEmpList.add(obSales2);
		
		obEmpList.add(new Salaried(new Person("Mike","Abbot","14 park Way"), Department.Research, 4500.0));
		obEmpList.add(new Salaried(new Person("Michelle","Abbot","14 park Way"), Department.marketing, 4400.0));
		obEmpList.add(new Salaried(new Person("Jean","Livingston","19 Biggen Hill"), Department.marketing, 6000.0));
		
		
		for(Employee obEmp : obEmpList)
		{
			System.out.printf("%s \n", obEmp);
		}
		
		
		
	//	System.out.printf("Test");
	//	System.out.printf(arg0, arg1)
		System.out.printf("\n\n total Payroll %.2f", getTotalPayroll(obEmpList));
		System.out.printf("\nTotal salry for IT dept %.2f", getPayrollByDept(obEmpList, Department.IT));
		System.out.printf("\n There are %d hourly workers in the company\n", getTotalHourly(obEmpList));
		System.out.printf("The highest Paid employee in the last pay period was %s", getHighestPaid(obEmpList));
		System.out.printf("\n\n\n The following is a list of marketing employees\n");
		ArrayList<Employee> obmList = getDepartmentList(obEmpList, Department.marketing);
		
		for(Employee obEmp: obmList)
		{
			System.out.printf("%s\n", obEmp);
		}
		
		
		//Find the total pay for all empoyess in marketingusing a single command not using getPayRollByDept
		System.out.printf("Total Marketing payroll:$%.2f\n",getTotalPayroll(getDepartmentList(obEmpList,
				Department.marketing)) );
		
		System.out.printf("total IT payroll:$%.2f\n", getTotalPayroll(getDepartmentList(obEmpList, Department.IT)));
		
	}

	
	/**
	 * this will return the total salary of all persons that are recorded in the employee list
	 * @param obEmpList
	 * @return
	 */
	private static double getTotalPayroll(ArrayList<Employee> obEmpList)
	{
		double dReturn=0;
		
		for(Employee obRef : obEmpList)
		{
			
			dReturn = obRef.getPayAmount();
			
		}
		
//		for(int i=0; i<obEmpList.size(); i++)
//		{
//			
//			dReturn += obEmpList.get(i).getPayAmount();
//			
//		
//		}
//		
		return dReturn;
		
		
		
		
	}
	
	
	
	
	
	
	/**
	 * Return the total payroll for the indicated department that is passed in
	 * @param obList
	 * @param eDpet
	 * @return
	 */
	private static double getPayrollByDept(ArrayList<Employee> obList, Department eDept)
	{
		double dResult =0.0;
		
		for(Employee obEmp : obList)
		{
			if(obEmp.getDept().equals(eDept) )
			{
				
				dResult+= obEmp.getPayAmount();
				
			}
			
			
		}
		
		return dResult;
	}
	
	
	public static int getTotalHourly(ArrayList<Employee> obList)
	{
		int nCount =0;
		
		for(Employee obRef : obList)
		{
			if(obRef instanceof Hourly)
			{
				nCount++;
			}
		}
		
		return nCount;
	}
	
	/**
	 * This method will return a reference tot he highest paid employee
	 * @param obList
	 * @return
	 */
	public static Employee getHighestPaid(ArrayList<Employee> obList)
	{
		Employee obRef=obList.get(0);
		
		for(Employee obEmp : obList)
		{
			if(obEmp.getPayAmount() > obRef.getPayAmount())
			{
				obRef = obEmp;
			}
		}
		
		return obRef;
		
	}
	 /**
	  * This method will return a list of all employess working for a particular Department
	  * @param obList
	  * @return
	  */
	public static ArrayList<Employee> getDepartmentList(ArrayList<Employee> obList, Department eDept)
	{
		ArrayList<Employee> obDepList = new ArrayList<>();
		for(Employee obEmp : obList)
		{
			if(obEmp.getDept().equals(eDept))
			{
				obDepList.add(obEmp);
			}
		}
		
		return obDepList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	

