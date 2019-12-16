package shoppingcart; //Import shoppingcart Package

import java.text.NumberFormat; // Import NumberFormat Library

//Create ShoppingCart Class
public class ShoppingCart {
 private int itemCount; // total number of items in the cart
 double totalPrice; // total price of items in the cart
 private int capacity; // current cart capacity
 private Item[] cart;
 Customer customer;
 

 // Creates an empty shopping cart with a capacity of 5 items.
 public ShoppingCart(Customer customer) {
  this.customer = customer;
  capacity = 5;
  itemCount = 0;
  totalPrice = 0.0;
  cart = new Item[capacity];
 }


 // Method to Add an item to the shopping cart.
 public void addToCart(Item s) {
  
  cart[itemCount] = s;
  totalPrice += s.price;
  itemCount++;
  if (itemCount == capacity) {
   increaseSize();
  }
 }
 
 // Method to Remove an item from the shopping cart.
 public void removeFromCart(Item s) {

  cart[itemCount] = s;
  totalPrice -= s.price;
  itemCount--;
 // if (itemCount != capacity) {
 //  decreaseSize();
//  }
 }


 // Returns the contents of the cart together with
 // summary of cart information.
 public String toString() {
  NumberFormat fmt = NumberFormat.getCurrencyInstance();
  String contents ="\n\n*********************************************************";
  contents += "\n\t\tShopping Cart";
  contents += "\n*********************************************************";
  contents += "\nTitle\t Quantity\t Description\t SKU\t Price\t Other Details\t\n\n";

  for (int i = 0; i < itemCount; i++)
  contents += cart[i].toString() + "\n";

  contents += "\nTotal Price: " + fmt.format(totalPrice);
  contents += "\n";

  return contents;
 }


 // Increases the capacity of the shopping cart by 5 if there are too many items in cart
 private void increaseSize() {
  Item[] temp = new Item[capacity + 5];
  System.arraycopy(cart, 0, temp, 0, capacity);
  cart = temp;

 }

 /*
 private void decreaseSize() {
  Item[] temp = new Item[capacity - 1];
  System.arraycopy(cart, 0, temp, 0, capacity);
  cart = temp;
 }

*/
}