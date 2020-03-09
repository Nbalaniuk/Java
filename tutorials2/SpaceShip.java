package tutorials2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class SpaceShip implements Comparable<SpaceShip>
{
	public  final int MAX_NAME_LENGTH =20;
	
	public final int RAF_SIZE=MAX_NAME_LENGTH + 16;
	protected int id;
	protected int speed;
	protected int hull;
	protected int shield;
	protected String name;
	protected OLList<Weapon> weapons;
	
	
	
	
	
	public SpaceShip(int id, int speed, int hull, int shield, String name)
	{
		
		this.id = id;
		this.speed = speed;
		this.hull = hull;
		this.shield = shield;
		this.name = name;
		
	}

	

	public static void main(String[] args)
	{
		

	}





	@Override
	public int compareTo(SpaceShip obOther)
	{
		
		return this.id - obOther.id;
	}
	
	
	
	public void addWeapon(Weapon obWeapon)
	{
		
		this.weapons.add(obWeapon);
		
	}
	
	public void deleteWeapon(Weapon obWeapon)
	{
		this.weapons.delete(obWeapon);
	}
	
	@Override
	public String toString()
	{
		return String.format("ID:%d Name:%s ", this.id,this.name);
	}
	
	
	
	
}
