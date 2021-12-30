package Multithreading;

class CurrentThreadInMulithreading1 extends Thread
{
   public void run()
   {   
	System.out.println("Hello is exceuted by "+Thread.currentThread().getName());//Executed by Thread-0 here,Thread-0 is a thread name provided by the JV M
   }
}
public class CurrentThreadInMulithreading extends Thread
{
   public void run()
   {   
	   // 1st way to change the name of the Thread is
	   Thread.currentThread().setName("Shubhangi");
	   System.out.println("Hello is exceuted by "+Thread.currentThread().getName());//Executed by Thread-0 here,Thread-0 is a thread name provided by the JV M
   }

   public static void main(String[] args) 
	{
	  System.out.println("Hello2 is exceuted by "+Thread.currentThread().getName());// Executed by main 
	  
	  CurrentThreadInMulithreading ctm=new CurrentThreadInMulithreading();
	  ctm.start();
	  CurrentThreadInMulithreading1 ctm1=new CurrentThreadInMulithreading1();
	 //2nd way to change the name of the Thread
	  ctm1.setName("Naam");
	  ctm1.start();
      
	}

}
