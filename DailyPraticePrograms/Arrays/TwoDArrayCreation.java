package Arrays;

public class TwoDArrayCreation 
{

	public static void main(String[] args) 
	{
		TwoDArrayCreation tw  =new TwoDArrayCreation();
		System.out.println(tw);   //Output: @70177ecd
		
		int a[]= {10,20,30};
		System.out.println(a);   // Output:[I@1e80bfe8 ; [ : show the Single Dimensional Array; I : Integer
		
		int[][]aa= {{10,20,30},{40,50,60}};
		System.out.println(aa);  // Output:[[I@66a29884 ; [[ : show the 2Dimensional Array; I : Integer
        System.out.println(aa[0]); //Output: [I@4769b07b- aa[0]= this is showing only one index i.e index0 of the given 2D Array
        System.out.println(aa[0][0]);  //Output: 10 - aa[0][0]= this is [0] showing the one index  i.e index0  and next [0] is showing the value inside the index.
        System.out.println(aa.length); //Output: 2 - this will show length of the given array depend on the row of the array.
       // System.out.println(aa[][][]);// compile time error
        System.out.println(aa[0].length);// Output:3- this will provide the length of the single row i.e index0.
	   //System.out.println(aa[0][0].length);//compile time error
        
        for(int i=0;i<aa.length;i++)
        {
        	for(int j=0;j<aa[i].length;j++)
        	{
        		System.out.print(aa[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
