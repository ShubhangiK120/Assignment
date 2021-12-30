package randomNumber;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame 
{
  public static void main(String[] args) 
	{
		 int answer,guess;
		 
		 final int maxAttempts=7;
		  final int MAX=150;
		  final int MIN=50;
		  Scanner src=new Scanner(System.in);
		   Random rm=new Random();
		   answer=rm.nextInt(MAX-MIN+1);
		   for(int i=1;i<=maxAttempts;i++)
		   {
			   System.out.println("Guess a Number to win");
		         guess=src.nextInt();

			   if(guess!=answer && maxAttempts==7)
			   {
		            if(guess==answer)
		        	     {
				           System.out.println("Good Job, the number was" +answer);
			            }
			           if(guess<=answer)
			           {
				         System.out.println("Too Low! Try Again" );
			           }
		             if(guess>=answer)
		               {
		    	         System.out.println("Too High! Try Again");
		               }
			       }
		        }	 
		   System.out.println("Turn Ove! You Lost the Game ");  
		   System.out.println("And the number was = "  +answer);
			  
}
	
		   
		   
}


