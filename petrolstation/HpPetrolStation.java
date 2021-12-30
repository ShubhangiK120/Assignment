package petrolstation;

import java.util.Scanner;

public class HpPetrolStation implements BharatPetroleum
{
   Scanner scr=new Scanner(System.in);
 
	int laststock=scr.nextInt();
	int currentTotalStock=scr.nextInt();
	
    int totalnopetrol;
    int leftnopetrol;
	@Override
	public void calculatepetrol()
	{
	  totalnopetrol = laststock+ currentTotalStock;	
      System.out.println("Total Liter="+totalnopetrol);
	}
	@Override
	public void remaindedpetrol()
	{
	  int currentBalnaceStock=scr.nextInt();
	  leftnopetrol=totalnopetrol-currentBalnaceStock;
      System.out.println("Remaining Liter="+leftnopetrol);
	}	
	public static void main(String[] args) 
	{ 
	  
      HpPetrolStation hp=new HpPetrolStation();
      hp.calculatepetrol();
	  hp.remaindedpetrol();

	
	}

}
