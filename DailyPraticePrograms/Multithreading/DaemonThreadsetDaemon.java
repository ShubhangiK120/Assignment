package Multithreading;

class Test extends Thread
{
	 public void run()
	   {  
		 System.out.println(Thread.currentThread().isDaemon());
		 System.out.println("daemon thread for child thread");
	   }
}
public class DaemonThreadsetDaemon
{
  public static void main(String[] args) 
  {
	 System.out.println("Daemon is for child thread");
     Test t=new Test();
     t.setDaemon(true);//class test will become the daemon thread so the run method will not get exceut
     t.start();
  }

}
