
package StaticKeywords;
 class A
 {
	 static
	 {
		 System.out.println("I m in static block class A");
	 }
 }

public class StaticBlock 
{
	static 
	{
		System.out.println("I m in static block of class StaticBlock");
	}
	public static void main(String[] args)
	{   
		A a=new A();
		   
		System.out.println("I m in main method");
	}

}
