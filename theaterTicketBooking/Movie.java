package theater;

import java.util.Scanner;

public class Movie 
{
  private String movieName;
  private String movieCategory;
  private int ticketCost;
  String circle;
 
  
  public Movie() 
  {
    this.movieName=movieName;
    this.movieCategory=movieCategory;
    this.ticketCost=ticketCost;
   Scanner src=new Scanner(System.in);
   System.out.println("Enter the movie name");
   movieName=src.next();
   System.out.println(movieCategory);
   movieCategory=src.next();
   
   
   
  }

public String getMovieName() {
	return movieName;
}

public void setMovieName(String movieName) {
	this.movieName = movieName;
}

public String getMovieCategory() {
	return movieCategory;
}

public void setMovieCategory(String movieCategory) {
	this.movieCategory = movieCategory;
}

public int getTicketCost() {
	return ticketCost;
}

public void setTicketCost(int ticketCost) {
	this.ticketCost = ticketCost;
}

public int calculateTicketCost(String circle)
{ 
	
	if(circle.equals("gold") && movieCategory.equals(2D))
	{
		ticketCost=300;
	}
	else 
	{
		if(circle.equals("gold") && movieCategory.equals(3D))
		{
			ticketCost=500;
		}
		else
		{
			if(circle.equals("silver") && movieCategory.equals(2D))
			{
				ticketCost=250;
			}
			else
			{
				if(circle.equals("silver") && movieCategory.equals(3D))
				{
					 ticketCost=450;
				}
				else
				{
					if(movieCategory!=getMovieCategory())
					{
						System.out.println("Invalid category");
						return 1;
					}
					else
					{
						if(circle!=this.circle)
						{
							System.out.println("Invalid circle");
							return 2;
						}
						else
						{
							if(movieCategory!=getMovieCategory() && circle!=this.circle)
							{
								System.out.println("Invalid Circle and Category");
								return 3;
							}
						}
					}
				}
			}
		}
	}
	return 0;
	
}

}
