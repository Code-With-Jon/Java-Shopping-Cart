package shoppingcart; // Import "shoppingcart" package

//Create CD class that inherits attributes from Item class 
public class CD extends Item {

	int trackCount; // Set up trackCount variable
	
   // Create CD Method that pulls name, price, quantity, and sku variables
 public CD(String title, double price, int quantity, String description, int trackCount, int sku) {
  super(title, price, quantity, description, sku, trackCount ); // Pull variables from Super Class (ITEM)
  
  this.trackCount = trackCount; // set up constructor
 }
 
 
 
 

// Set up toString() Method

@Override
public String toString() {
	StringBuilder str=new StringBuilder();
   	str.append(super.toString()+", Number of Tracks: "); //Calling the toString() method of the Item class
   	str.append(this.getTrackCount()); //appending Track Count field value to it.
    //Return Results
   	return str.toString();
}

// Set up Getters and Setters
public int getTrackCount() {
	return trackCount;
}

public void setTrackCount(int trackCount) {
	this.trackCount = trackCount;
}




//Create CD_Inventory method
 public void CD_Inventory() {
  //Create Item array of CD's
  Item[] CDs = new Item[10];
  // Hold name, price, quantity, and sku values in array
  CDs[0] = new Item("CD1", 6d, 1, "This is CD 1", 1717, 12);

  CDs[1] = new Item("CD2", 5d, 1, "This is CD 2", 1515, 9);

  CDs[2] = new Item("CD3", 8d, 1, "This is CD 3",  1414, 24);
  
  //print out array
  for (int i = 0; i < 3; ++i)

   System.out.println(CDs[i]);

 }
}