package shoppingcart; // Import shoppingcart Package



import java.util.Scanner; // Import Scanner Library



public class ShoppingCartAddOn {
 static final Scanner scanner = new Scanner(System.in);
 private static Scanner sc;
 static boolean loggedIn = false;


 {
  //Create Variables	 
  ShoppingCart cart = new ShoppingCart(null);
  Book books = new Book(null, 0, 0, null, 0, 0);
  Movie movies = new Movie(null, 0, 0, null, 0, 0);
  CD cds = new CD(null, 0, 0, null, 0, 0);
  String continueShopping;
  int choice = 0;
  Item item = null;
  Customer login = new Customer(null, null, null, null, false);
  
  
  


  do {
	  //Call the CustermMenu Method
   login.CustomerMenu();


   //String name, double price, int quantity, int sku, String description, int stock, int category
   
   //Create New Books 
   Book book1 = new Book("Book1", 20.99d, 1, "Description", 173, 1010);
   Book book2 = new Book("Book2", 19.99d, 1, "Description", 267, 1290);
   Book book3 = new Book("Book3", 8.99d, 1, "Description", 355, 1133);
   // Create New Movies
   Movie movie1 = new Movie("Movie1", 20.99d, 1, "Description", 2.15, 5858);
   Movie movie2 = new Movie("Movie2", 19.99d, 1, "Description", 2.15, 9404);
   Movie movie3 = new Movie("Movie3", 8.99d, 1, "Description", 2.15, 5454);
   // Create New CD's
   CD cd1 = new CD("CD1", 6d, 1, "Description", 1717, 12);
   CD cd2 = new CD("CD2", 5d, 1, "Description", 1515, 9);
   CD cd3 = new CD("CD3", 8d, 1, "Description",  1414, 24);


   do {
	   //Call the Menu Method
    choice = menu();


    if (choice == 1) {
     System.out.println("Please select a category");
     storeProductsMenu();
     choice = new Scanner(System.in).nextInt();
     do {
    	 //If user selects first menu item, run department option menu 
      if (choice == 1) {

       books.Book_Inventory();

       System.out.println("Please select a book: ");

       String sc1 = scanner.nextLine();

       if (sc1.equals("Book1"))

        item = book1;
       if (sc1.equals("Book2"))

        item = book2;

       if (sc1.equals("Book3"))

        item = book3;

       cart.addToCart(item);
       System.out.println(item + " was added to your cart");

       break;

      }

      if (choice == 2) {

       movies.Movie_Inventory();
       System.out.println("Please select a Movie: ");

       String sc2 = scanner.nextLine();

       if (sc2.equals("Movie1"))

        item = movie1;
       if (sc2.equals("Movie2"))

        item = movie2;

       if (sc2.equals("Movie3"))

        item = movie3;
       cart.addToCart(item);
       System.out.println(item + " was added to your cart");
       break;
      }
      if (choice == 3) {
       cds.CD_Inventory();
       
       System.out.println("Please select a CD: ");

       String sc3 = scanner.nextLine();

       if (sc3.equals("CD1"))

        item = cd1;
       if (sc3.equals("CD2"))

        item = cd2;

       if (sc3.equals("CD3"))

        item = cd3;
       cart.addToCart(item);
       System.out.println(item + " was added to your cart");
       break;
      }

      System.out.print("\n Shop some more? Enter Y for yes or N for no ");
      continueShopping = scanner.nextLine();
     } while (continueShopping.charAt(0) == 'Y' || continueShopping.charAt(0) == 'y');
    } else if (choice == 2) {
     System.out.println(cart.toString());
     System.out.println("Which items would you like to take out: " );

     String sc_remove = scanner.nextLine();

     	if (sc_remove.equals("Book1"))
         item = book1;
        
     	if (sc_remove.equals("Book2"))
         item = book2;
    
     	if (sc_remove.equals("Book3"))
         item = book3;
        
     	if (sc_remove.equals("Movie1"))
         item = movie1;
        
     	if (sc_remove.equals("Movie2"))
         item = movie2;

        if (sc_remove.equals("Movie3"))
         item = movie3;
           
        if (sc_remove.equals("CD1"))
        item = cd1;
        
        if (sc_remove.equals("CD2"))
     	item = cd2;

        if (sc_remove.equals("CD3"))
        item = cd3;
        
     cart.removeFromCart(item);

     System.out.println("Items were removed");

    } else if (choice == 3) {

     System.out.println(cart.toString());

    } else if (choice == 4) {
     System.exit(0);
    } else

     System.out.println("Invalid Input");
    System.out.print("\n Shop some more? Enter Y for yes or N for no ");
    continueShopping = scanner.nextLine();
   } while (continueShopping.charAt(0) == 'Y' || continueShopping.charAt(0) == 'y');
   if (continueShopping.charAt(0) == 'N' || continueShopping.charAt(0) == 'n') {
    System.exit(0);
   }
  } while (loggedIn = true);

 }



// Create Menu Method
 static int menu() {
  sc = new Scanner(System.in);

  System.out.println("\n Please select an option");

  System.out.println("1. Add Items to cart");

  System.out.println("2. Remove an item from cart");

  System.out.println("3. View Cart");

  System.out.println("4. Exit");

  int choice = sc.nextInt();

  return choice;
 }
// Create Store Department Method for adding items to cart 
 public static void storeProductsMenu() {
  System.out.println("1. Books");
  System.out.println("2. Movies");
  System.out.println("3. CD's");
 }



 
}