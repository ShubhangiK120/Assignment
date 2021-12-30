package Arrays;

public class MinMax 
{
    public static void findMin(int[] a)
   {
	 int min= a[0];
	 for (int i = 1; i < a.length; i++) 
	 {
		 if(a[i]<min)
		 {
		   min=a[i];
		 }
	 }
	 System.out.println("Minimum number is =" +min);
   }
    public static void findMax(int a[])
    {
    	int max= a[0];
    	for (int i = 1; i < a.length; i++)
    	{
			if(a[i]>max)
			{
			 max=a[i];	
			}
		}
    	System.out.println("Maxmum number is =" +max);
    }
	public static void main(String[] args)
	{
		int aa[]= {100,40,98,19,456};
        MinMax.findMin(aa);
        MinMax.findMax(aa);
	}

}
