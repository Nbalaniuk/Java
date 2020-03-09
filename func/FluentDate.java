package func;

import java.time.LocalDate;

public class FluentDate
{

	public static void main(String[] args)
	{
		
		LocalDate today = LocalDate.now();
		System.out.printf("Current date is:%s\n",today);
		
		LocalDate futureDate = today.plusDays(12);
		futureDate= futureDate.plusWeeks(3);
		futureDate= futureDate.plusYears(2);
		
		System.out.printf("FutureDate is:%s\n",futureDate);
		
		LocalDate futureDate2 = LocalDate.now()
				.plusDays(12)
				.plusWeeks(3)
				.plusYears(2);
		
		System.out.printf("FutureDate2 is:%s",futureDate2);
	}

}
