 //isAlive() method is give a boolean values, it will give true when the run method is still working and false when the the task inside the method is complete.
package Multithreading;

public class IsAliveMethod extends Thread
{
	 public void run()
	   {   
		System.out.println("Hello is exceuted by "+Thread.currentThread().getName());//Executed by Thread-0 here,Thread-0 is a thread name provided by the JV M
	   }
	public static void main(String[] args) 
	{
		
        IsAliveMethod al= new IsAliveMethod();
        System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		al.start();
		System.out.println(al.isAlive());
		}
	}


