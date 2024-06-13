// Author:Rahaf Elgharabawy
//StudentID : 200101095

//this class to represent DVDs available in the library
public class DVD extends LibraryItem{
  
  //Fields
  //this field stores the director name
  //this field stores the runtimeMinutes
  private Person director;
  private int runtimeMinutes;
  
  //Constructor 
  //this constructor takes as input : director(as Person) and runtimeMinutes(as int)
  //this constructor also inherits from LibraryItem the titlte and if it is isAvailable
  public DVD(String title ,Person director ,int runtimeMinutes){
    super(title , true);
    this.director = director;
    this.runtimeMinutes = runtimeMinutes;
  }
  
  //Methods
  //Returns the director of the DVD.
  public Person getDirector(){
    return director;
  }
  //Returns the runtime duration of the DVD. 
  public int getRuntimeMinutes(){
    return runtimeMinutes;
  }
  
  /*Overrides toString method from LibraryItem returns a string describing the item from
parent method plus director and runtime duration.*/
  @Override 
  public String toString(){
    return super.toString() + "\nDirector: " + getDirector() + "\nRuntime: " + getRuntimeMinutes() + "minutes";
  }

}