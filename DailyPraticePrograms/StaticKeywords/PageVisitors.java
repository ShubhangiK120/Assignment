package StaticKeywords;

//To know the number of visitors visited the web_site.
class RealtimeExample
{ 
	static int count=0;

	public RealtimeExample() 
	{
		count=count+1;
	}
	void noOfVistiors()
	{
		System.out.println(count);
	}
	
}
public class PageVisitors 
{

	public static void main(String[] args) 
	{
      RealtimeExample rte =new RealtimeExample();
      RealtimeExample rte1=new RealtimeExample();
      RealtimeExample rte2=new RealtimeExample();
      RealtimeExample rte3=new RealtimeExample();
       
      rte.noOfVistiors();
       
	}

}
