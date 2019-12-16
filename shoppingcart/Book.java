package shoppingcart;// Import "shoppingcart" package

//Create Book class that inherits attributes from Item class 
public class Book extends Item {
	
	int pageCount; // create pageCount variable
	
	
	// Create Book Method that pulls name, price, quantity, and sku variables
 public Book(String title, double price, int quantity, String description, int pageCount, int sku) {
  super(title, price, quantity, description, pageCount, sku ); // pull variables from super class (ITEM)
  
 this.setPageCount(pageCount); //set up constructor
 }

//set up toString() Method
@Override
public String toString() {
	StringBuilder str=new StringBuilder();
   	str.append(super.toString()+", pageCount: "); //Calling the toString() method of the Item class
   	str.append(this.getPageCount()); //appending PageCount field value to it.
    //Return Results
   	return str.toString();
}
//Create Book_Inventory method
 public void Book_Inventory() {
  //Create Item array of Books
  Item[] Books = new Item[10];
  //Hold name, price, quantity, and sku values in array
  Books[0] = new Item("Book1", 20.99d, 1, "This is Book 1", 173, 1010);

  Books[1] = new Item("Book2", 19.99d, 1, "This is Book 2", 267, 1290);

  Books[2] = new Item("Book3", 8.99d, 1, "This is Book 3", 355, 1133);

  //print out array
  for (int i = 0; i < 3; ++i)

   System.out.println(Books[i]);

 }
 
 // Set up getters and Setters
public int getPageCount() {
	return pageCount;
}
public void setPageCount(int pageCount) {
	this.pageCount = pageCount;
}




}