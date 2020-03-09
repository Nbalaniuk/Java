package chap32;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Buffer
{

	private LinkedList<Integer> obQueue; 
	
	private Lock obLock;
	//Lock conditions which we want to respong to..
	
	private Condition notEmpty;
	private Condition notFull;
	private final int CAPACITY =1;
	
	
	public Buffer()
	{
		this.obLock = new ReentrantLock();
		this.notFull = obLock.newCondition();
		this.notEmpty=obLock.newCondition();
		this.obQueue= new LinkedList<>();
	}
	
	/**
	 * this method will attempt to write to our queue. The thread must get ahold of the resource and make sure it doesnt lose the resource
	 * by attaching a lock to the resource.
	 * @param nVal
	 */
	public void write(int nVal)//Good exam question- how can a lock give up a lock?
	{
		
		this.obLock.lock();// if it cant lock, it will stop(sleep)- if its locked it will stop
		
		try
		{
			
			while(this.obQueue.size() == CAPACITY)
			{
				System.out.printf("%s Waiting for notfull condition to write %d\n",Thread.currentThread().getName(),nVal);
				//The following will cause the current thread to give up the lock and wait for another process to generate a notFull signal
				//This would be done by a process completing a read.
				notFull.await();//need to recheck if its empty, might be filled by a different thread
			}
			
			this.obQueue.offer(nVal);
			//A consumer may be waiting for an oppurtunity to read an element. We should tell them that there is something to read
			notEmpty.signal();
			
			
			
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally
		{
			this.obLock.unlock();//NEED THIS- IF THIS IS NOT UNLOCKED IT WILL STAY LOCK FOREVER(during the programme)
		}
		
		
	}
	
	/**
	 * this method shall attempt to read a value from the queue aslong as there is something in the queue. If nothing exists
	 * we will wait for the notEmpty signal to make sure something gets placed in the queue
	 * @return
	 */
	public int read()
	{
		
		int nRead = 0;
		
		this.obLock.lock();
		try
		{
			while(this.obQueue.isEmpty())
			{
				
				System.out.printf("%s Waiting for not empty condition\n", Thread.currentThread().getName());
				this.notEmpty.await();//waits for signal from write method
				
			}
			nRead = this.obQueue.remove();
			this.notFull.signal(); //signals write method
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			this.obLock.unlock();
		}
		return nRead;		
	}
	
	
	
	
	
	
	
	
	
	
	

}
