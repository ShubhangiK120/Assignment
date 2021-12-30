package Arrays;

public class OneDArrayCreation 
{

	public static void main(String[] args) 
	{
		int[]a;
		a=new int[8]; 
		//a=new int[]; //compile time error
		a=new int[0];
		//a=new int[-1]; //run time Exception i.e  java.lang.NegativeArraySizeException: -1
		
		//Retrieve
		
		int[] b= {10,20,30};
		
		System.out.println("Array length="+b.length);
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(b[i]);
		}
	}

}
