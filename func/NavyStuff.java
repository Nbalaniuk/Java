package func;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class NavyStuff
{

	public static void main(String[] args)
	{
		
		ArrayList<WarShip> obShips = new ArrayList<>();
		
		
		LoadShipList(obShips);
		
		
		obShips.stream().forEach(x-> System.out.printf("%s\n",x.getName()));
		
		//using streams - count the number of ships that are in the Royal Navy
	int nCount =(int)obShips.stream()
			.filter(x -> x.getNavy().equals("Royal Navy"))
			.count();
		
	
	System.out.printf("\n\n%d ships are in the Royal Navy \n",nCount);
	
	//Provide the names of all ships between 10k and 30k tonnage
	System.out.printf("The ships between 10000 and 30000  tonnage are:\n");
	obShips.stream()
			.filter(x -> x.getTonnage()>10000&& x.getTonnage()<30000)
			.forEach(x -> System.out.printf("%s\n",x.getName()));
	
	//This also works
	obShips.stream().filter(x -> x.getTonnage() >10000).filter(x -> x.getTonnage()<30000).forEach(x -> System.out.printf("%s, ", x.getName()));
	
	
	//All of the AirCraft carriers in the US navy
	System.out.printf("\nAll of the Aircraft carriers for the US Navy:\n");
	obShips.stream()
			.filter(x -> x.getNavy().equals("United States Navy"))
			.filter(x -> x.getShipClass().equals("Aircraft Carrier"))
			.forEach(x-> System.out.printf("%s, ",x.getName()));
	
	
	
	Stream<WarShip> obSStream = obShips.stream(); // can only use this once
	
	
	
	
	}
	
	/**
	 * this method will go through the list of ships presented in the CSV file and load them into 
	 * the arrayList
	 * @param obShipList
	 */
	private static void LoadShipList(ArrayList<WarShip> obShipList)
	{
		
		Scanner obIn = null;
		
		
		try
		{
			obIn = new Scanner(new File("BinFiles/Ships.csv"));
			obIn.nextLine(); // skips the header line
			
			while(obIn.hasNextLine())
			{
				String[] sVals = obIn.nextLine().split(",");
				
				obShipList.add(new WarShip().setName(sVals[0]).
						setNavy(sVals[2])
						.setShipClass(sVals[1]).
						setTonnage(Integer.parseInt(sVals[4].trim())).
						setLaunchDate(Integer.parseInt(sVals[3].trim())));
				
			}
			
			
		}
		catch (FileNotFoundException e) {
			System.out.printf("%s\n",e);
		}
		finally {
			obIn.close();
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
