package Multithreading;

public class InterruptThreadisInterruptedMethod extends Thread
{
	public void run() 
	{
		System.out.println(Thread.currentThread().isInterrupted());
	  try 
	   {
		 for (int i = 1; i < 5; i++) 
		 {
		  System.out.println(i);	
		  sleep(1000);
		 }
	  }
	 catch (Exception e) 
	 {
      System.out.println(e);	
     }	
   }

	public static void main(String[] args) 
	{
     InterruptThreadisInterruptedMethod is =new InterruptThreadisInterruptedMethod();
     is.start();
     //is.interrupt();
	}

}
