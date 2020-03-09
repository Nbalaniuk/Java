package chap13;

public enum Department
{
	
	Sales("Sales","7712"),
	marketing("Marketing","9812"),
	IT("IT","7642"),
	Research("R&D","9711"),
	HR("HR","1245");
	
	
	private String sPhone;
	private String sDesc;
	
	private Department(String sVal, String sDesc)
	{
		this.sPhone = sVal;
		this.sDesc = sDesc;
	}
	
	public String getPhone()
	{
		
		return this.sPhone;
		
	}
	
	
	public String getDesc()
	{
		return this.sDesc;
	}
	
	
	
	
}
