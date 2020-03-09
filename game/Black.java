package game;
/**
 * Strong against-Nothing- 100% to everything but White
 * Weak Against-White-75%
 * @author cst103
 *
 */
public class Black extends Dragon
{

	private String sName;
	
	
	
	public Black(DragonSize nSize)
	{
		super(nSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString()
	{
		return String.format("Black %s", super.toString());
		
	}
	
	
	
	
}
