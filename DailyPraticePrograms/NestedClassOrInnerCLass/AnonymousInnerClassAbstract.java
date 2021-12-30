package NestedClassOrInnerCLass;

abstract class Outer2
{
	abstract void start();
	
}

public class AnonymousInnerClassAbstract 
{

	public static void main(String[] args) 
	{
		Outer2 o2=new Outer2() 
		{
			@Override
			void start()
			{
              System.out.println("start with the key");
				
			}
		};
		o2.start();

	}

}
