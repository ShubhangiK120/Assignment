package Multithreading;

public class InterruptThreadinterrupedMethod extends Thread
{
	public void run()
	{ 
	  System.out.println(Thread.interrupted()); 
	 try 
	 {
		 for (int i = 1; i < 5; i++) 
		 {
		  System.out.println(i);	
		  sleep(1000);
		  //System.out.println(Thread.interrupted());
		}	
		
	} 
	 catch (Exception e) 
	 {
		System.out.println(e); 
	}
	}
  
	public static void main(String[] args) 
	{
     InterruptThreadinterrupedMethod ii=new InterruptThreadinterrupedMethod();
     ii.start();
     ii.interrupt();
	}

}
