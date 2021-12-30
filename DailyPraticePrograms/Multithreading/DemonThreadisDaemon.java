package Multithreading;

class Test1 extends Thread
{
	 public void run()
	   { 
		 if(Thread.currentThread().isDaemon())//it will set the current class as Daemon thread
          {
			 System.out.println("daemon thread");

          }
		 else
		 {
		  System.out.println("daemon thread for child thread");

		 }
       }

	}

public class DemonThreadisDaemon
{
    public static void main(String[] args) 
	  {
		 System.out.println("Daemon is for main thread");
	     Test1 t=new Test1();
	     t.start(); 
	  }
}
