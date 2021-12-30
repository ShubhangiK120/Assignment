package electricityBill;

import java.util.Scanner;

public class ElectricityBill 
{
    String n;
    int unit;
    double bill;
   
    void accept()
    {
    	Scanner scr=new Scanner(System.in);
    	System.out.println("Enter the name of user");
    	n=scr.next();
    	System.out.println("Enter the unit number");
    	unit=scr.nextInt();
    }
    void calculateBil()
    {
    	if(unit>=1 && unit<=100)
    	{
    	 bill=unit*0;
    	}
    	else
    	{
    	 if(unit>=101 && unit<=200)
    	{
    		bill=0*100+(unit-100)*1.5;
    	}
    	 else
    	 {
    	  if(unit>=201 && unit<=500)
    	 {
    		bill=0*100+1.5*200+(unit-201)*3 ;
    	 }
    	  else
    		  if(unit>=501)
    		  {
    			bill=0*100+1.5*200+3*500+(unit-501)*6.6;  
    		  }
    	 }
    	}
    }
    void printBill()
	{
		System.out.println("Name of Customer:"+n);
		System.out.println("Enter unit Consumed:"+unit);
		System.out.println("Bill Amount:"+bill);
	}
	public static void main(String[] args) 
	{
	  ElectricityBill eb=new ElectricityBill();
	  eb.accept();
	  eb.calculateBil();
	  eb.printBill();
    }

}
