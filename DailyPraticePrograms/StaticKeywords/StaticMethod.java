package StaticKeywords;

class MethodStatic
{
	void show1()
	{
		System.out.println("1");
	}
	static void show2()
	{
		System.out.println("2");
	}
}
public class StaticMethod 
{
 public static void main(String[] args) 
	{
	  MethodStatic ms=new MethodStatic();
	  ms.show1();
	  MethodStatic.show2();
	}

}
 