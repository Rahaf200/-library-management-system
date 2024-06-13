// Author:Rahaf Elgharabawy
//StudentID : 200101095

//Class
/*This Person class to represent individuals such as authors, directors, patrons, and librarians. Each
person has a first name, last name, and date of birth. */
public class Person{
  
  //Fields
  //This field stores the first name of the person. 
  private String firstName;
  //This field stores the last name of the person.
  private String lastName;
  //This field stores the date of birth as a Date object.
  private Date dateOfBirth;
  
  //Constructor
  //this constructor takes as input :firstName(as String), lastName(as String)and dateOfBirth(as Date) 
  public Person(String firstName ,String lastName, Date dateOfBirth ){
    this.firstName = firstName; 
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth; 
  }
  
  /*this constructor takes as input : firstName(as String), lastName(as String)and
   *, day(as int) , month(as int) and year(as int)*/ 
  public Person(String firstName ,String lastName,int day ,int month ,int year){
    this.firstName = firstName; 
    this.lastName = lastName;
    this.dateOfBirth = new Date(day , month , year);
  }
  
  //Methods 
  //Method to get the firstname
  public String getFirstName(){
    return firstName;
  }
  //Method to get the lastname
  public String getLastName(){
    return lastName ; 
  }
  //Method to get the date of birth
  public Date getDateOfBirth(){
    return dateOfBirth;
  }
  
  /*Overrides toString method from Object and returns a string describing the Person
instance by its fields.*/
  @Override 
  public String toString(){
    return "FirstName : " + getFirstName() + " ,LastName: " + getLastName() + " ,DateOfBirth: " + getDateOfBirth() ;
      
 }
}