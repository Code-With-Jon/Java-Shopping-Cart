package shoppingcart; // Import "shoppingcart" package

import java.util.Scanner; // Import Scanner 

// Create Customer Class
public class Customer {
//Create Customer Variables
 String id;
 String password;
 String firstName;
 String lastName;
 ShoppingCart shoppingCart;
 private static Scanner sc;
 private static boolean loggedIn = false;

 // Create Customer method
 public Customer(String id, String password, String firstName, String lastName, boolean loggedIn) {

  //shoppingCart = new ShoppingCart();

//Set up constructors
  this.id = id;

  this.firstName = firstName;

  this.lastName = lastName;

  Customer.loggedIn = loggedIn;

 }

 //****************************************************************************************
 //Set up methods to be used with the ShoppingCartAddOn File
 //****************************************************************************************

 public void CustomerMenu() {

	 //LogIn System
  sc = new Scanner(System.in);

  System.out.println("Please Sign Up: ");

  System.out.println("\n Please SET your username");
  String user = sc.nextLine();
  System.out.println("Please SET your password");
  String pass = sc.nextLine(); // looks at selected file in scan
  System.out.println("First Name: ");
  firstName = sc.nextLine();
  System.out.println("Last Name: ");
  lastName = sc.nextLine();

  System.out.println("\n Please Log In: ");

  System.out.println("Please enter User Name");
  id = sc.nextLine();
  System.out.println("Please enter Password");
  password = sc.nextLine(); // gets input from user

  if (id.equals(user) && password.equals(pass)) {
   setLoggedIn(true);
   System.out.print("Welcome " + firstName + " !");
  } else {
   setLoggedIn(false);
   System.out.print("Invalid Credentials");
   System.exit(0);
  }
 }

 public static boolean isLoggedIn() {
  return loggedIn;
 }




 public static void setLoggedIn(boolean loggedIn) {
  Customer.loggedIn = loggedIn;
 }








}