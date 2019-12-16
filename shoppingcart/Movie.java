package shoppingcart ;// Import "shoppingcart" package

//Create Movie class that inherits attributes from Item class 
public class Movie extends Item {
	
	//Create Movie variable
	double length;
	
// Create Movie Method that pulls name, price, quantity, and sku variables
 public Movie(String title, double price, int quantity, String description, double length, int sku) {
  super(title, price, quantity, description, length, sku); // Pull variables from Super Class (ITEM)
  
  // set up constructor
  this.length = length;
 }

// Set up toString() Method

@Override
public String toString() {
	StringBuilder str=new StringBuilder();
   	str.append(super.toString()+", length: "); //Calling the toString() method of the Item class
   	str.append(this.getMovieLength()); //appending Movie Length field value to it.
    //Return Results
   	return str.toString();
}
//Create Movie_Inventory method
 public void Movie_Inventory() {
	 //Create Item array of Movies
  Item[] Movies = new Item[10];
  //Hold name, price, quantity, and sku values in array
  Movies[0] = new Item("Movie1", 20.99d, 1, "This is Movie 1", 2.20, 5858);

  Movies[1] = new Item("Movie2", 19.99d, 1, "This is Movie 2", 2.15, 9404);

  Movies[2] = new Item("Movie3", 8.99d, 1, "This is Movie 3", 1.50, 5454);

  
  //print out array
  for (int i = 0; i < 3; ++i)

   System.out.println(Movies[i]);

 }
 
 // Set up getters and Setters
 public double getMovieLength() {
		return length;
	}
	public void setMovieLength(double length) {
		this.length = length;
	}

}