package diceGame;
import java.util.Random;


public class DiceGame 
{
	public static void main(String[] args ) 
	{
       
       
        int computerDie = 0;
        int userDie1=0;
        int tieGame=0;
        int userWins=0;
		int computerWins=0;

        for( int i =1;i<=10;i++) 
        {
        	Random random = new Random();
             computerDie = random.nextInt( 6 )+1;
             userDie1=random.nextInt(6)+1;
             System.out.println("Computer no=" +computerDie);
      	     System.out.println("User no=" +userDie1);
            if ( computerDie > userDie1 ) 
            { 
        	    computerWins++;
                System.out.println("Computer won turn =" +i );
            } 
            else if ( userDie1 > computerDie )
            {
            	userWins++;
             System.out.println("User won turn =" +i );
            } 
            else if(computerDie==userDie1)
            { 
            	tieGame++;
                System.out.println("Its a tie game =" +i );
            }
        
        }
       		if (computerWins > userWins) 
		{
            System.out.println("You got beat by a computer!");
        } 
		else 
		{
          if (computerWins < userWins) 
            {
                System.out.println("You beat the computer!");
            }
          else 
            {
                System.out.println("The game has ended in a tie!");
            }
		  }
    }
}
        