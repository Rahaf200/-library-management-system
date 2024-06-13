// Author:Rahaf Elgharabawy
//StudentID : 200101095

//this Librarian  class to represent librarians responsible for managing the library’s collection. 
public class Librarian extends Person{
  
  //fields
  //this field stores employeeID
  private int employeeID;
  private static int lastEmployeeID = -1;
  
  //Constructor 
  //this constructor inherits from Person firstName , lastName and dateOfBirth
  public Librarian(String firstName ,String lastName, Date dateOfBirth ){
    super(firstName , lastName , dateOfBirth);
    this.employeeID = Librarian.lastEmployeeID + 1 ; 
    Librarian.lastEmployeeID++;
  }
  
  //Methods
  //this method returns the employee ID
  public int getEmployeeID(){
    return employeeID;
  }
  
  /*Overrides toString method from Person and returns a string describing the Librarian
instance from parent method plus employeeID.*/
  @Override
  public String toString(){
    return super.toString() + " ,EmployeeID " + getEmployeeID();   
  }
}