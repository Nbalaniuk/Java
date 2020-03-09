package assign1Cst103;

public class Q1 
{
/**
 * a program that displays the area and circumference for a circle of radius 7.5
 * 
 *  nathan cst103
 * @param args
 */
	public static void main(String[] args) 
	{
		
		final double dPI = 3.1416;
		double dArea = dPI * (7.5*7.5);
		
		double dCircumfrance = 2* dArea;
		System.out.println("The Area is "+ dArea +" and the circumfrance is "+dCircumfrance+" if the circle has a radius of 7.5" );
		

	}

}
