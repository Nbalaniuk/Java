package chap32;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account
{
	
	private int nBalance;
	Lock obLock;
	
	public Account()
	{
		this.nBalance =0;
		obLock = new ReentrantLock();
	}
	
	
	public int getBalance()
	{
		return this.nBalance;
	}
	
	
	public void deposit(int nAmount)
	{
		this.obLock.lock();
		//The thread is halfway through the update and it gets booted out of the cpu
		int nNewBalance = this.nBalance += nAmount;
		//this.nBalance = (this.nBalance+=nAmount); also doesnt work
		//this.nBalance+=nAmount; doesnt work
		
		
		//Make dara corruption problem easy to see
		try
		{
			
			Thread.sleep(0);
			
		}
		catch (InterruptedException e) {
			
		}
		this.nBalance = nNewBalance;
		this.obLock.unlock();
	}
	
	
	
	
	
	
	
	
	
	
	
}
