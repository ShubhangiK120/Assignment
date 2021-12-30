package NestedClassOrInnerCLass;

class Outer4
{
  void start()
  {
	 System.out.println("1"); 
  }
	
}
public class AnonymousInnerClass 
{

	public static void main(String[] args) 
	{

		Outer4 o4=new Outer4() 
		{
			@Override
			void start()
			{
              System.out.println("start with the key");
				
			}
		};
		o4.start();
	

	}

}
