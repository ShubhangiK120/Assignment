package NestedClassOrInnerCLass;

 interface Outer3
{
	void start();
	
}
public class AnonymousInnerClassInterface 
{

	public static void main(String[] args)
	{

		Outer3 o3=new Outer3() 
		{
			@Override
			public void start()
			{
              System.out.println("start with the key");
				
			}
		};
		o3.start();

	}

}
