package tutorials2;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Weapon implements Comparable<Weapon>
{
	
	public static  final int MAX_NAME_LENGTH =20;
	
	
	public static final int RAF_SIZE=MAX_NAME_LENGTH + 16;
	
	private String name;
	private int id;
	private int damage;
	private int speed;
	private int powerDraw;
	
	public Weapon(int id, int damage, int speed, int powerDraw,String name)
	{
		
		
		this.name = name;
		this.id = id;
		this.damage = damage;
		this.speed = speed;
		this.powerDraw = powerDraw;
	}

	
	/**
	 * Write to RAF, check if ID exists and overwite it, if not write to end of file
	 * @param obRAF
	 */
	public boolean writeRAF(String sRAF)
	{
		try(RandomAccessFile obRAF = new RandomAccessFile(new File(sRAF), "rw"))
		{
			//Loop through all objects saved in the RAF, check if id matches
			
			int nPos=0;
			try {
				while(this.id !=obRAF.readInt() )
				{
					
					obRAF.seek(nPos++ *RAF_SIZE); // p[osition times the file of the record
					
				}
				obRAF.seek(obRAF.getFilePointer()-4);
			}
			catch (EOFException e) {
				obRAF.seek(obRAF.length());
			}
			obRAF.writeInt(this.id);
			
			obRAF.writeInt(this.damage);
			obRAF.writeInt(this.speed);
			obRAF.writeInt(this.powerDraw);
			RafUtils.writeStringToRaf(this.name, MAX_NAME_LENGTH, obRAF);
			return true;
			
			
		}
		catch (IOException e) {
			System.out.printf("IOException\n");
			return false;
		}
		
	}

	
	public static Weapon readRAF(int ID, String sRAF)
	{
		Weapon obReturn =null;
		try(RandomAccessFile obRAF = new RandomAccessFile(new File(sRAF), "rw"))
		{
			int nPos=0;
				//loop through all and check if ID matches
				while(ID != obRAF.readInt())
				{
					obRAF.seek(nPos* RAF_SIZE);
					nPos++;
				}
				obReturn = new Weapon(ID,obRAF.readInt() , obRAF.readInt(), obRAF.readInt(), RafUtils.readStringFromRaf(MAX_NAME_LENGTH, obRAF));
			}
		
		catch (IOException e) {
			System.out.printf("IOException\n");
			return null;
		}
		
		return obReturn;
	}
	

	@Override
	public int compareTo(Weapon obWeapon)
	{
		
		return this.id - obWeapon.id;
	}
	
	@Override
	public String toString()
	{
		return String.format("ID:%d Name:%s Speed:%d powerDraw:%d Damage:%d", this.id,this.name, this.speed,this.powerDraw,this.damage);
	}
	
	
}
