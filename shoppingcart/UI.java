package shoppingcart; // Import shoppingcart Package

// Create User Interface (UI) Class 
public class UI {
	
// Initialize variables	
static Book books = new Book(null, 0, 0, null, 0, 0);
static Movie movies = new Movie(null, 0, 0, null, 0, 0);
static CD cds = new CD(null, 0, 0, null, 0, 0);


 {
  //Create Variables	 
  Customer customer = new Customer ("id", "password", "Customer_firstName", "lastName", true);
  ShoppingCart cart = new ShoppingCart(customer);
  
  //Create New Books 
  Book book1 = new Book("Book1", 20.99d, 1, "This is Book 1", 173, 1010);
  Book book2 = new Book("Book2", 19.99d, 1, "This is Book 2", 267, 1290);
  Book book3 = new Book("Book3", 8.99d, 1, "This is Book 3", 355, 1133);
  // Create New Movies
  Movie movie1 = new Movie("Movie1", 20.99d, 1, "This is Movie 1", 2.15, 5858);
  Movie movie2 = new Movie("Movie2", 19.99d, 1, "This is Movie 2", 2.15, 9404);
  Movie movie3 = new Movie("Movie3", 8.99d, 1, "This is Movie 3", 2.15, 5454);
  // Create New CD's
  CD cd1 = new CD("CD1", 6d, 1, "This is CD 1", 1717, 12);
  CD cd2 = new CD("CD2", 5d, 1, "This is CD 2", 1515, 9);
  CD cd3 = new CD("CD3", 8d, 1, "This is CD 3",  1414, 24);
  
  // Initialize all items in store
  cart.addToCart(book1);
  cart.addToCart(book2);
  cart.addToCart(book3);
  cart.addToCart(movie1);
  cart.addToCart(movie2);
  cart.addToCart(movie3);
  cart.addToCart(cd1);
  cart.addToCart(cd2);
  cart.addToCart(cd3);
  
  // Start with Empty Cart
  cart.removeFromCart(book1);
  cart.removeFromCart(book2);
  cart.removeFromCart(book3);
  cart.removeFromCart(movie1);
  cart.removeFromCart(movie2);
  cart.removeFromCart(movie3);
  cart.removeFromCart(cd1);
  cart.removeFromCart(cd2);
  cart.removeFromCart(cd3);
  //****************************************************************************************
  //Print Store Inventory
  //****************************************************************************************
  System.out.print("*********************************************************\n");
  System.out.println("\t\t STORE INVENTORY");
  System.out.print("*********************************************************\n");
  
  // Show inventory of books, movies, and cd's in store
  
  books.Book_Inventory();
  movies.Movie_Inventory();
  cds.CD_Inventory();
  
  //****************************************************************************************
  //Make changes of items in cart through Program:
  //****************************************************************************************
  System.out.print("\n*********************************************************");
  System.out.print("\n\t\tChanges Made Through Program: \n");
  System.out.print("*********************************************************");
 

 cart.addToCart(book1);
 System.out.println("\n• " + customer.firstName + " added \n" + book1 + " to cart");
 
 cart.addToCart(book2);
 System.out.println("\n• " + customer.firstName + " added \n" + book2 + " to cart");
 
 cart.addToCart(cd2);
 System.out.println("\n• " + customer.firstName + " added \n" + cd2 + " to cart");

 cart.addToCart(movie1);
 System.out.println("\n• " + customer.firstName + " added \n" + movie1 + " to cart");
 
 cart.addToCart(cd1);
 System.out.println("\n• " + customer.firstName + " added \n" + cd1 + " to cart");
 
 cart.removeFromCart(cd1);
 System.out.println("\n• " +customer.firstName + " just removed \n" + cd1 + " from cart");

 //****************************************************************************************
 //Print All Items In Cart
 //****************************************************************************************
 
 System.out.println(cart.toString());
 
 
 
 }
 
 
 
}