package Multithreading;

public class PriorityThreadsetThread extends Thread
{
   public void run()
   {
		  System.out.println("child thread priority");	
  
   }
	public static void main(String[] args) 
	{
      System.out.println("main thread priority");
      Thread.currentThread().setPriority(MIN_PRIORITY);//this will set the priority of the main thread
      PriorityThreadgetPriority pt=new PriorityThreadgetPriority();
      pt.setPriority(2);//this will set the priority of the class
      pt.start();
	}

}
