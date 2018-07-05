package com.xx.test1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TickMain {
	public static void main(String []args)
    {
			  
		TickRunnable t1 = new TickRunnable();
		TickRunnable t2 = new TickRunnable();
		TickRunnable t3 = new TickRunnable();

	   // ExecutorService threadPool = Executors.newFixedThreadPool(3);
	    ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(5));
	    executor.execute(t1);
	    executor.execute(t1);
	    executor.execute(t1);
	    executor.execute(t1);
	    //threadPool.execute(t1);
	    //threadPool.execute(t1);
	    //threadPool.execute(t1);

	    System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+
	             executor.getQueue().size()+"，已执行玩别的任务数目："+executor.getCompletedTaskCount());        
	     //Thread t1 = new Thread(t);
         //Thread t2 = new Thread(t);
         //Thread t3 = new Thread(t);
         //Thread t4 = new Thread(t);

         //t1.start();
         //t2.start();
         //t3.start();
         //t4.start();

	    
	   /* ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(5));
         
        for(int i=0;i<15;i++){
        	TestRunnable myTask = new TestRunnable();
            executor.execute(myTask);
            System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+
            executor.getQueue().size()+"，已执行玩别的任务数目："+executor.getCompletedTaskCount());
        }
        executor.shutdown();*/
    }
}
