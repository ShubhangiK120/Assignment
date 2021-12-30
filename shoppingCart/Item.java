package shoppingCart;


	import java.text.NumberFormat;
	public class Item6k
	 {
	    private String name;
	    private double price;
	     private int quantity;
	
	 public Item6k( String itemName, double itemPrice, int numPurchased )
	 {
	 name = itemName;
	 price = itemPrice;
	 quantity = numPurchased;
	 }
	 
	 public String getName()
	 {
	 return name;
	 }
	
	 public double getPrice()
	 {
	 return price;
	 }
	 public int getQuantity()
	 {
	 return quantity;
	 }
	
	 @Override
	 public String toString()
	 {
	 NumberFormat fmt = NumberFormat.getCurrencyInstance();
	 String strTab = name.length() > 8 ? "\t" : "\t\t";
	 return name + strTab + fmt.format( price ) + "\t\t" + quantity + "\t\t" + fmt.format( price * quantity);
	 }
	 }


