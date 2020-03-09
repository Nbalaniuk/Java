package game;

/**
 * 
 * @author cst103 Nathan Balaniuk
 *
 */
public class Dragon
{
private int nAttackRank;
private int nDefenseRank;
private int nHitPoints;
private int nInitiative;
public DragonSize nSize;
private int nStartHP;

//DRAGON STATS

//Small Dragons
private final int SMALL_HP_MIN=51;
private final int SMALL_HP_MAX=70;

private final int SMALL_INITIATIVE_MIN=40;
private final int SMALL_INITIATIVE_MAX=60;

private final int SMALL_ATTACK_MIN=36;
private final int SMALL_ATTACK_MAX=50;

private final int SMALL_DEFENSE_MIN=10;
private final int SMALL_DEFENSE_MAX=19;

//Medium Dragons
private final int MEDIUM_HP_MIN=71;
private final int MEDIUM_HP_MAX=85;

private final int MEDIUM_INITIATIVE_MIN=20;
private final int MEDIUM_INITIATIVE_MAX=40;

private final int MEDIUM_ATTACK_MIN=51;
private final int MEDIUM_ATTACK_MAX=60;

private final int MEDIUM_DEFENSE_MIN=20;
private final int MEDIUM_DEFENSE_MAX=29;

//Large Dragons
private final int LARGE_HP_MIN=86;
private final int LARGE_HP_MAX=100;

private final int LARGE_INITIATIVE_MIN=0;
private final int LARGE_INITIATIVE_MAX=20;

private final int LARGE_ATTACK_MIN=61;
private final int LARGE_ATTACK_MAX=70;

private final int LARGE_DEFENSE_MIN=29;
private final int LARGE_DEFENSE_MAX=35;

/*
return 0;
*/



public Dragon(DragonSize nSize)
{
	//HP
	
	if(nSize == DragonSize.Small)
	{
		this.nHitPoints=(int) (Math.random()*(SMALL_HP_MAX - SMALL_HP_MIN) + SMALL_HP_MIN);
	}
	if(nSize == DragonSize.Medium)
	{
		this.nHitPoints=(int) (Math.random()*(MEDIUM_HP_MAX - MEDIUM_HP_MIN) + MEDIUM_HP_MIN);
	}
	if(nSize == DragonSize.Large)
	{
		this.nHitPoints=(int) (Math.random()*(LARGE_HP_MAX - LARGE_HP_MIN) + LARGE_HP_MIN);
	}
	this.nStartHP = this.nHitPoints;
	
	//Initiative
	
	if(nSize == DragonSize.Small)
	{
		this.nInitiative=(int) (Math.random()*(SMALL_INITIATIVE_MAX - SMALL_INITIATIVE_MIN) + SMALL_INITIATIVE_MIN);
	}
	if(nSize == DragonSize.Medium)
	{
		this.nInitiative=(int) (Math.random()*(MEDIUM_INITIATIVE_MAX - MEDIUM_INITIATIVE_MIN) + MEDIUM_INITIATIVE_MIN);
	}
	if(nSize == DragonSize.Large)
	{
		this.nInitiative=(int) (Math.random()*(LARGE_INITIATIVE_MAX - LARGE_INITIATIVE_MIN) + LARGE_INITIATIVE_MIN);
	}
	
	//Attack
	
	if(nSize == DragonSize.Small)
	{
		this.nAttackRank=(int) (Math.random()*(SMALL_ATTACK_MAX - SMALL_ATTACK_MIN) + SMALL_ATTACK_MIN);
	}
	if(nSize == DragonSize.Medium)
	{
		this.nAttackRank=(int) (Math.random()*(MEDIUM_ATTACK_MAX - MEDIUM_ATTACK_MIN) + MEDIUM_ATTACK_MIN);
	}
	if(nSize == DragonSize.Large)
	{
		this.nAttackRank=(int) (Math.random()*(LARGE_ATTACK_MAX - LARGE_ATTACK_MIN) + LARGE_ATTACK_MIN);
	}
	
	//Defense
	
	if(nSize == DragonSize.Small)
	{
		this.nDefenseRank=(int) (Math.random()*(SMALL_DEFENSE_MAX - SMALL_DEFENSE_MIN) + SMALL_DEFENSE_MIN);
	}
	if(nSize == DragonSize.Medium)
	{
		this.nDefenseRank=(int) (Math.random()*(MEDIUM_DEFENSE_MAX - MEDIUM_DEFENSE_MIN) + MEDIUM_DEFENSE_MIN);
	}
	if(nSize == DragonSize.Large)
	{
		this.nDefenseRank=(int) (Math.random()*(LARGE_DEFENSE_MAX - LARGE_DEFENSE_MIN) + LARGE_DEFENSE_MIN);
	}
	
	
}

public void doAttack (Dragon obOther)
{
	
}
public int getInitiative()
{
	return this.nInitiative; 
}
public int getNumAttacksPerTurn()
{
	if(this.nSize == DragonSize.Small)
	{
		return 3;
	}
	if(this.nSize == DragonSize.Medium)
	{
		return 2;
	}
	if(this.nSize == DragonSize.Large)
	{
		return 1;
	}
	return 0;
	
}
public boolean isDead()
{
	if(this.nHitPoints<=0)
	{
		return true;
	}
	
	return false;
	
	
}

public void ressurect()
{
	this.nHitPoints = this.nStartHP;
}

public int getAttack()
{
	return this.nAttackRank;
}

public int getDefense()
{
	return this.nDefenseRank;
}


@Override
public String toString()
{
	
	return String.format("Size: %10s Health:%10d Initiative:%10d Attack:%10d Defense:%10d", this.nSize,this.nHitPoints, this.nInitiative,
			this.nAttackRank, this.nDefenseRank);
	
}





	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
