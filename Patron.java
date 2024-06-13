// Author:Rahaf Elgharabawy
//StudentID : 200101095

//this Patron class to represent library patrons
public class Patron extends Person{
  
  //Fields
  //this field stores the libraryCardNumber
  //this field stores the emailAddress
  private int libraryCardNumber;
  private String emailAddress;
  private static int lastLibraryCardNumber = -1;
  
  //constructor
  //this conctructor takes as input : emailAddress(as String)
  //this constructor also inherits from Person : firstName , lastName and dateOfBirth
  public Patron(String firstName, String lastName, Date dateOfBirth, String emailAddress ){
    super(firstName , lastName , dateOfBirth);
    this.emailAddress = emailAddress;
    this.libraryCardNumber = lastLibraryCardNumber + 1;
    Patron.lastLibraryCardNumber++;
  }
  
  //Methods
  //this method returns the library card number 
  public int getLibraryCardNumber(){
    return libraryCardNumber;
  }
  //this method returns the email address
  public String getEmailAddress(){
    return emailAddress;
  }
  
  /* Overrides toString method from Person and returns a string describing the Patron
instance from parent method plus libraryCardNumber and emailAddress.*/ 
  @Override
  public String toString(){
    return super.toString() + "LibraryCardNumer: " + getLibraryCardNumber() +
      " emailAddress: " + getEmailAddress() ; 
  }

}