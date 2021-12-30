package methodOverloading;


class ParentsName
{
	public void name()
	{
		System.out.println("Khangar");
	}
}
class ChildName extends ParentsName
{
	public void name()
	{
		System.out.println("Shubhangi Khangar");
	}
}
public class FamilyName {

	public static void main(String[] args)
	{
      ChildName child=new ChildName();
      child.name();
	}

}
