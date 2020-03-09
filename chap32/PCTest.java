package chap32;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PCTest
{

	public static void main(String[] args)
	{
		
		Buffer obBuffer = new Buffer();
		
		Producer obProd1 = new Producer(obBuffer);
		Consumer obCon1 = new Consumer(obBuffer);
		Producer obProd2 = new Producer(obBuffer);
		Consumer obCon2 = new Consumer(obBuffer);
		
		//We will create thread pool that will allow us to actually quickly create and reuse threads
		//First off we will create  a fixed thread pool of size 4 to work with our threads
		//what this means is that the pool is going to have 4 worker threads that can be assigned to work on different tasks
		
		ExecutorService obPool = Executors.newFixedThreadPool(2); // only makes 2 threads in pool, can be reused
		//obPool = Executors.newCachedThreadPool(); // craetes new threads as needed or reuses old threads
		//The pool will auto create and run thr runnable classes through an execute call
		//The execute will both create the thread and call start for that thread
		obPool.execute(new Producer(obBuffer));
		obPool.execute(new Consumer(obBuffer));	
		obPool.execute(new Producer(obBuffer));
		obPool.execute(new Consumer(obBuffer));	
		//Calling shutdown will cause the thread pool to not take any new requests(its quitting time)
		//however any thrreads created and ruunning will continue  to run until finished
		obPool.shutdown();
		//Lets do a busy wait and actually show when all the threads are finished
		//pool is terminated means that all the threads are done
		//Will not go past this line of code until the pool is terminated
		//will have a assignment to simulate a bank using pools and threads
		//For the most part pools arent needed, threads are fine
		while(!obPool.isTerminated());
		
		System.out.printf("Elvis has left the building\n");
		
		
		
//		Thread obTh1 = new Thread(obCon1,"Consumer 1");
//		Thread obTh2 = new Thread(obProd1, "Producer 1");
//		Thread obTh3 = new Thread(obCon2,"Consumer 2");
//		Thread obTh4 = new Thread(obProd2, "Producer 2");
//		
//		obTh1.start();
//		obTh2.start();
//		obTh3.start();
//		obTh4.start();
//		
		
		
		
		
		
		
	}

}
