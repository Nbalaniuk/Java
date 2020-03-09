package chap13;

public enum Traffic_Lights
{
	
	RED("Please Stop"),
	YELLOW("Proceed with caution"),
	GREEN("Please Go");
	
	
	private String sDescription;
	
	private Traffic_Lights(String Desciption)
	{
		
		this.sDescription = Desciption;
		
	}
	
	public String getDescription()
	{
		return this.sDescription;
	}
	
}
