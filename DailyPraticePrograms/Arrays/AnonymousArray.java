package Arrays;

public class AnonymousArray 
{
    static void sum(int a[])
    {
    	int sum=0;
    	for (int i = 0; i < a.length; i++) 
    	{
			sum=sum+a[i];
		}
    	System.out.print("sum of array "+ sum);
    }
	public static void main(String[] args) 
	{
      AnonymousArray.sum(new int[] {10,20,30});
	}

}
