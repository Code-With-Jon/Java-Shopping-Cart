package shoppingcart; // Import shoppingcart Package

/* 
Name: Jonathan Fink  
Assignment: Project 6

Comment: 
This program was created as a way for a customer to manage and view Inventory of a store.
The program allows the storage of inventory of Items, Lists Items in Cart, and the ability to add and 
remove Items. The program uses OOP by calling on Methods and includes functionality of Super and Sub Classes
and shares variables by accessing a Java Package which holds all the Java Class files

**NOTE**
 There is an additional file labeled "SHOPPINGCARTADDON" which contains Java code to enable Multi-layered
 Menus. If this "AddOn" file is enabled, it would allow a user to create a UserName, Password, and stores
 the users First Name and Last Name. Once Signed Up the user will be asked to logIn to the program. 
 Once logged in, the user is greeted with a Welcome message, and is then asked to select from Menu Items:
 Add Items to cart, Remove an item from cart, View Cart, or Exit. 
 
 If a user selects "Add Items," they are then asked to select from a sub-menu containing 3 categories:
 Books, Movies, or CD's. Once a user selects the category the want, the program will display only those items
 that match that particular Category. 
 
 There are many ways to expand this program, by adding many other Item Categories (Produce, Electronics, etc..).
 Also, creating many other variables associated with the categories, and the products that lay inside 
 those categories would help the use of filtering products and help the user choose what item they would 
 like to add to cart. Implementing functions like having a user choose how many of a particular 
 item they want to purchase, or applying discount codes would capture alot of what commercially used P.O.S
 systems contain.
*/

public class ShoppingProject {
//Run Main Program
 public static void main(String[] args) {
  //Launch new UI
	 new UI();
	 
	 //Launch Add on File
	 // new ShoppingCartAddOn();

 }

}
