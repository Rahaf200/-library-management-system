// Author:Rahaf Elgharabawy
//StudentID : 200101095

//Create a ‘Book’ class that represents books available in the library.
public class Book extends LibraryItem{
  
  //Fileds 
  //This filed stores the name of author
  //This filed stores the ISBN
  private Person author;
  private String isbn;
  
  //Constructor
  //this connstructor takes as input: auther(as Person) and isbn(as String)
  //this class inherits from LibraryItem the titlte and if it is isAvailable  
  public Book(Person author , String isbn , String title){
    super(title, true);
    this.author = author;
    this.isbn = isbn;
  }
  //Methods
  //Returns the author of the book.
  public Person getAuthor(){
    return author;
  }
  
  //Returns the ISBN of the book. 
   public String getISBN(){
    return isbn;
  }
   
  /*Overrides toString method from LibraryItem returns a string describing the item from
parent method plus book author and isbn*/
  
   @Override
   public String toString(){
   return super.toString() + " Author: " + author + " ISBN: " + isbn;  
   }





}