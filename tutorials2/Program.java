package tutorials2;

public class Program
{

	public static void main(String[] args)
	{
		String fileName = "src/tutorials2/spaceships.weapons.dat";
		Weapon obWeapon = new Weapon(1, 10, 100, 5, "Lasers");
		obWeapon.writeRAF(fileName);
		Weapon obWeapon2 = new Weapon(2, 50, 5, 0, "Torpedo");
		obWeapon2.writeRAF(fileName);
		
		obWeapon = Weapon.readRAF(1,fileName);
		System.out.printf("%s\n",obWeapon);
		
		obWeapon2 = Weapon.readRAF(2,fileName);
		System.out.printf("%s",obWeapon2);
		
	}

}
