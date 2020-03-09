package func;

public class TestBoat
{

	public static void main(String[] args) // Fluid interfaces
	{
		
		Boat obBoat = new Boat("Albatross");
		obBoat.setCountry("Panama");
		obBoat.setTonnage(12000);
		obBoat.setDraft(25);
		
		System.out.printf("%s\n",obBoat);
		
		obBoat.setCountry("Canada")
			.setTonnage(12000)
			.setDraft(12);
		
		System.out.printf("%s\n",obBoat);
		
		
		Boat obBoat1 = new Boat("Ark Royal")
				.setCountry("Great Britan")
				.setDraft(100)
				.setTonnage(12000)
				.setName("Ark Royal");
		
	}

}
