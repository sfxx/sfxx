package com.xx.test1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TickRunnable implements Runnable{
     private int tick = 50;
	  
     public void run()
     {
          while(true)
          {
        	  try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
               if(tick > 0){
                    System.out.println( Thread.currentThread().getName() + " sail --" + tick--);
               }
          }
     }
}

