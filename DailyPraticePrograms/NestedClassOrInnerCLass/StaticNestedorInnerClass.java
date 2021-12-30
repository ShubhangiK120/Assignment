package NestedClassOrInnerCLass;
/*
class Outer5
{
    static class Inner
    {
    	void show()
    	{
    	 System.out.println("1");	
    	}
    }	
}
public class StaticNestedorInnerClass 
{

	public static void main(String[] args) 
	{
       Outer5.Inner ob=new Outer5.Inner();
       ob.show();
	}

} */


//static inner class can only access static member (method,variables etc)
/*
class Outer5
{
    static class Inner
    {
    	static void show()
    	{
    	 System.out.println("1");	
    	}
    }	
}
public class StaticNestedorInnerClass 
{

	public static void main(String[] args) 
	{
       Outer5.Inner.show();  //don't have to create object of outer class or inner class.
       
	}
}*/

// static inner class can instantiate private static variable,as private methods and variables can't be use by static inner class.'

class Outer5
{
	private static int a=10;
    static class Inner
    {
    	void show()
    	{
    	 System.out.println(a);	
    	}
    }	
}
public class StaticNestedorInnerClass 
{

	public static void main(String[] args) 
	{
       Outer5.Inner ob=new Outer5.Inner();
       ob.show();
	}

}