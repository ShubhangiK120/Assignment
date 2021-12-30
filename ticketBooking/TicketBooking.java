package ticketBooking;

import java.util.Scanner;

public class TicketBooking 
{

	public static void main(String[] args)
	{
		String name;
		double tax=0.02;
		double Totalcharges=0.0;
		int age;
		int nPerson = 0;
		double charges=0;

		for(int i=0;i<=4;i++) 
		{
		 
		 Scanner src= new Scanner(System.in);
		 System.out.println("Enter the name");
		 name=src.nextLine();
		 System.out.println("Enter the Age");
		 age=src.nextInt();
		 if(age<=3)
			{
			 charges=0;
			 System.out.println("Free:"+charges);
			}
			if(age>3 && age<=12)
			{
				charges=70;
				System.out.println("Charges:"+charges);
			}
			if(age>=13 && age<=20)
			{
				charges=120;
				System.out.println("Charges:"+charges);
			}
			if(age>=21 && age<=54)
			{
				charges=200;
				System.out.println("Charges:"+charges);
			}
			if(age>=55)
			{
				charges=150;
				System.out.println("Charges:"+charges);
			}
			
		Totalcharges=charges+Totalcharges;
		
		nPerson=nPerson+1;
	   }
		double totaAmt;
		
	    totaAmt=Totalcharges*tax+Totalcharges;
	    System.out.println("Number Of Person:"+nPerson);
	    System.out.println("Total charges:"+Totalcharges);
		System.out.println("Total amount with tax:"+totaAmt);
		
		
	}
		

	
	}


