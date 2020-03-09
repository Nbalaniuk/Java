package assign1Cst103;


import java.util.Scanner;

/**
 * This program will the total tax on the purchases you make. 5% GST 6% pst.
 * Some individuals and childs clothing are exempt from pst
 * nathan cst103
 * @author cst103
 *
 */
public class Q8 
{

	
	
	public static void main(String[] args) 
	{
		Scanner obInput = new Scanner(System.in);
		System.out.println("what is the total price of your purchases?");
		double dPrice = obInput.nextDouble();
		System.out.println("Are you purchasing childrens clothing or are you an individual exempt of PST? (1) for Children Clothing, "
				+ " (2) for GST exempt (3) for Both (0) for none.");
		int nExempt = obInput.nextInt();
		double dPst = (dPrice * 0.06);
		double dGst = (dPrice * 0.05);
		
		
		switch(nExempt)
		{
		case 1:
		{
		System.out.println("The total of your purchase, including GST, is: $"+(dPrice + dGst));
		
		break;
		}
		case 2:
		{
			System.out.println("The total of your purchases, only including PST is: $"+(dPrice + dPst));
			break;
		}
		case 3:
		{
			System.out.println("The purchase of you price having neither GST or PST is: $"+(dPrice));
			break;
		}
		case 0:
		{
			System.out.println("The total of your purchase, including GST and PST, is: $"+(dPrice + dPst + dGst));
		break;
		}
		
		}

		
		
		
		obInput.close();
	}

}
