package Multithreading;
 public class PriorityThreadgetPriority extends Thread
{
	 public void run()
		{
		  System.out.println("call the child get priority");
		  System.out.println(Thread.currentThread().getPriority());	

		}
   
	public static void main(String[] args) 
	{
	  System.out.println("call get priority");
	  System.out.println(Thread.currentThread().getPriority());	
      PriorityThreadgetPriority pp=new PriorityThreadgetPriority();
      pp.start();
      
	}

}
