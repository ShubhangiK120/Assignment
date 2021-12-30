package Multithreading;

public class PreventThreadjoinMethod extends Thread
{
  public void run()
  {
	  for (int i = 1; i < 5; i++) 
		 {
			try 
			{
			 System.out.println("child thread:"+1);
			 Thread.sleep(1000);
			} 
			catch (Exception e) 
			{
				System.out.println(e);
			}
		 }
  }
	public static void main(String[] args) throws InterruptedException 
	{
		 PreventThreadjoinMethod pj=new PreventThreadjoinMethod();
	      pj.start();
	      pj.join();
		for (int i = 1; i < 5; i++) 
		 {
			try 
			{
			  System.out.println("Main thread:"+i);
			  Thread.sleep(1000);
			} 
			catch (Exception e) 
			{
				System.out.println(e);
			}
		 }
     
	}

}
