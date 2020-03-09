package game;
/**
 * Strong against-Green
 * Weak against- Red
 * @author cst103
 *
 */
public class White extends Dragon
{

	private String sName;
	
	
	
	public White(DragonSize nSize)
	{
		super(nSize);
		// TODO Auto-generated constructor stub
	}

	
	
	
	@Override
	public String toString()
	{
		return String.format("White %s", super.toString());
	}
}
