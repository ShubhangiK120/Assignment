package Multithreading;

public class PreventThreadyeildMethod extends Thread
{
	public void run()
	{
		Thread.yield();
		for(int i=1;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
  public static void main(String[] args) 
	{
      PreventThreadyeildMethod sp= new PreventThreadyeildMethod();
      sp.start();
      
      for(int i=1;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
      
	}

}
