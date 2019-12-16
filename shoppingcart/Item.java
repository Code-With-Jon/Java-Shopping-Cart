package shoppingcart; // Import shoppingcart Package

import java.text.NumberFormat; //import NumberFormat library

// Create Item Class
public class Item {
	
// Set up Item variables
 String title;
 double price;
 int quantity;
 int sku;
 String description;
 int stock;
 int category;
 int pageCount;
 double length;
 int trackCount;
 


 // Create a new item with the given attributes.
 public Item(String title, double price, int quantity, String description, double d, int sku ) {
	 
	 // Set up constructors
  this.title = title;
  this.price = price;
  this.quantity = quantity;
  this.description = description;
  this.sku = sku;
 }

 // Set up the toString() Method

 public String toString() {
  NumberFormat fmt = NumberFormat.getCurrencyInstance(); // format currency

  //returns string
  return (title + " \t " + fmt.format(price) + " \t" + quantity + " \t" +  description + " \t" +
  sku + " \t "+ fmt.format(price * quantity)); 
 }
 
 
// Set up Getters and Setters

 // Returns the unit price of the item
 public double getPrice() {
  return price;
 }


 // Returns the name of the item
 public String getName() {
  return title;
 }


 // Returns the quantity of the item
 public int getQuantity() {
  return quantity;
 }
 // Returns the SKU of the item
 public int getSku() {
  return sku;
 }
 // Returns the Description of the item
 public String getDescription(){
     return description;
  }
 // Returns the Length of Movie
 public double getLength() {
	  return length;
	 }
 // Returns the Track Count of the CD
 public int getTrackCount() {
	  return trackCount;
	 }
 

}