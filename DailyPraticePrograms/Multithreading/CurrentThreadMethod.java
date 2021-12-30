//CurrentThread indicates the current status of the thread 
//In adding the the getName() and setName() with the currentThread provides the different output
//currentThread().setName() is used to set the name of the thread according to t he user.
// currentThread().getName() is used to get the name of the the Thread

package Multithreading;

public class CurrentThreadMethod 
{
    
	public static void main(String[] args) 
	{
      System.out.println("Hello");
      System.out.println(Thread.currentThread().getName());//Output:main 
         //or
      //below process is follow when user  wants to set the name of the Thread. 
      Thread.currentThread().setName("Shubhangi");
      System.out.println(Thread.currentThread().getName());
	}

} 
