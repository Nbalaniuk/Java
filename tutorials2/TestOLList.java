package tutorials2;

import java.util.Comparator;

public class TestOLList
{

	public static void main(String[] args)
	{
		
		OLList<SpaceShip> obList = new OLList<>();
		SpaceShip ship1 =new SpaceShip(1, 10, 10, 10, "Bebop");
		SpaceShip ship2 =new SpaceShip(3, 10, 10, 10, "Lok");
		SpaceShip ship3 =new SpaceShip(2, 10, 10, 10, "Galactice");
		SpaceShip ship4 =new SpaceShip(5, 10, 10, 10, "Falcon");
		SpaceShip ship5 =new SpaceShip(4, 10, 10, 10, "Jupiter 2");
		
		
		Comparator<SpaceShip> compareIDs = (SpaceShip x,SpaceShip y) -> (x.id - y.id);
		Comparator<SpaceShip> compareIDsRev = (SpaceShip x,SpaceShip y) -> (y.id - x.id);
		Comparator<SpaceShip> compareNames = (SpaceShip x,SpaceShip y) -> (x.name.compareTo(y.name));
		
		obList.add(ship1,compareIDs);
		obList.add(ship2,compareIDs);
		obList.add(ship3,compareIDs);
		obList.add(ship4,compareIDs);
		obList.add(ship5,compareIDs);

		System.out.printf("%s\n", obList);
		obList.add(ship1,compareIDsRev);
		obList.add(ship2,compareIDsRev);
		obList.add(ship3,compareIDsRev);
		obList.add(ship4,compareIDsRev);
		obList.add(ship5,compareIDsRev);
		
		System.out.printf("%s\n", obList);
	
		obList.add(ship1,compareNames);
		obList.add(ship2,compareNames);
		obList.add(ship3,compareNames);
		obList.add(ship4,compareNames);
		obList.add(ship5,compareNames);
		
		System.out.printf("%s\n", obList);
		
		
	}

}
