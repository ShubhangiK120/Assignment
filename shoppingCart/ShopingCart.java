package shoppingCart;

import java.util.ArrayList;
import java.util.List;
import java.text.NumberFormat;
import java.util.Scanner;
public class RunShop6k
 {
    public static void main( String[] args )
 {  

     String itemName;
     double itemPrice;
     int quantity;
     Scanner scan = new Scanner( System.in );
      String keepShopping = "y";
        do
        {
          System.out.print( "Enter the name of the item: " );
         itemName = scan.nextLine();
          System.out.print( "Enter the unit price: " );
          itemPrice = scan.nextDouble();
          System.out.print( "Enter the quantity: " );
          quantity = scan.nextInt();
          scan.nextLine();
 
         System.out.print( "Continue shopping (y/n)? " );
         keepShopping = scan.nextLine();
 }
 while ( keepShopping.equalsIgnoreCase( "y" ) );

 System.out.println( "Final Shopping Cart totals" ); 

  
 } 
 } 
 
