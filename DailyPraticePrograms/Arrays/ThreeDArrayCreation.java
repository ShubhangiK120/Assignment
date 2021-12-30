package Arrays;

public class ThreeDArrayCreation 
{

	public static void main(String[] args) 
	{
           int a[][][]= {{{10,20,30},{40,50,60}},{{70,80,90},{100,110,120}}};
            
           System.out.println(a );  //Output:[[[I@70177ecd - [[[ stands for the 3D Array and I stands for the integer
           System.out.println(a[1]); //Output:[[I@1e80bfe8 
           System.out.println(a[0][0]);  
           System.out.println(a[0][0][0]);
           
           System.out.println(a.length);
           System.out.println(a[0]);
           System.out.println(a[0][0]);
          // System.out.println(a[0][2]);//Exception
           
           for (int i = 0; i < a.length; i++)
           {
			for (int j = 0; j < a[i].length; j++) 
			{
			 for (int j2 = 0; j2 < a[i][j].length; j2++) 
			 {
				System.out.print(a[i][j][j2]);
			 }
			 System.out.println();
			}
		}
          
	}

} 



