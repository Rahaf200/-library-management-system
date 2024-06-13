// Author:Rahaf Elgharabawy
//StudentID : 200101095

//this class represents all items available in the library 
public class LibraryItem{
  //Fields
  /*this field stores the title of the library item
   * this field stores a unique identifier for the library item
   * this field stores the item is available for borrowing.
   * this field a static field starting from -1*/
  private String title;
  private int itemID;
  private boolean isAvailable;
  private static int lastItemID = -1;
  
  //Constructor 
  //this constructor takes as input : title(as String) and isAvailable(as boolean)
  public LibraryItem(String title, boolean isAvailable){
    this.title = title ; 
    this.isAvailable = isAvailable;
    this.itemID = LibraryItem.lastItemID + 1; 
    LibraryItem.lastItemID++;
  }
 
  //Methods
  
  //Returns the title of the library items
  
  public String getTitle(){
    return title;
  }
  
  //Returns the unique item ID
  public int getItemID(){
    return itemID ; 
  }
  
  // Returns a boolean value indicating whether the item is available
  public boolean isAvailable(){
    return isAvailable;
  }
  
  // Sets the item’s availability status to unavailable if the item is available.
  public void borrowItem(){
    isAvailable = false;
  }
    //Sets the item’s availability status to available.
    public void returnItem(){
     isAvailable = true;
    }
    
    /*Overrides toString method from Object and returns a string describing the item Id,
title and availability*/
    @Override
    public String toString(){
      return getItemID() + " " + getTitle() + (this.isAvailable() ? " available" : " not available"); 
    }
}












