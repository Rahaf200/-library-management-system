// Author:Rahaf Elgharabawy
//StudentID : 200101095

//the Date class repesent dates for tracking due dates and late fees.
public class Date {

  //Fields 
  //this field stores date
  //this field stores month 
  //this field stores year 
  private int day;
  private int month;
  private int year;

  //Constructor
  //this constructor takes as inputs : day(as int) , month(as int) and year(as int)
  public Date(int day, int month, int year){
    this.day = day;
    this.month = month; 
    this.year = year;
 }
  
  //Methods
  //this method returns day of date
  public int getDay(){
    return day;
  }
  //this method returns month of date
  public int getMonth(){
    return month;
  }
  //this method returns year of date
  public int getYear(){
    return year;
  }
  
  //Overrides toString method from Object and returns a string in "DD/MM/YYYY" format 
  @Override
  public String toString(){
    return String.format("%02d/%02d/%04d", day, month, year);
  }
   
}