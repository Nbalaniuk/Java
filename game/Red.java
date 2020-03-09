package game;
/**
 * Effective against white, 120% attack
 * weak against green - 80% attack
 * @author cst103
 *
 */
public class Red extends Dragon
{

	private String sName;
	
	
	public Red(DragonSize nSize, String sName)
	{
		super(nSize);
		
		
		
	}
	
	
	@Override
	public String toString()
	{
		return String.format("Red %s", super.toString());
	}

}
