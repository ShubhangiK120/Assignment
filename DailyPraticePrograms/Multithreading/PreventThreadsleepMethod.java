package Multithreading;

public class PreventThreadsleepMethod extends Thread
{
	public void run()
	{
	for (int i = 1; i < 5; i++) 
	 {
		try 
		{
		 System.out.println("hello");
		 Thread.sleep(1000);
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	 }
	}
	public static void main(String[] args)//throws InterruptedException 
	{
     /*for (int i = 1; i < 5; i++) 
     {
	   
	   //System.out.println(i);
	   //Thread.sleep(1000);
    	 //or
    	 try
    	 {
    		System.out.println(i);
    		Thread.sleep(1000);
 
    	 }
    	 catch (Exception e) 
    	 {
    		 System.out.println(e);
		}
	}*/
		PreventThreadsleepMethod pv=new PreventThreadsleepMethod();
		pv.start();
		}
	}


