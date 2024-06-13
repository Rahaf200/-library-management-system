// Author:Rahaf Elgharabawy
//StudentID : 200101095

//this ‘Magazine’ class to represent magazines available in the library
public class Magazine extends LibraryItem{
  //Fields
  //this field stores issueNumber 
  //this field stores publicationDate 
  private String issueNumber;
  private Date publicationDate;
  
  //Constructor
  // this constructor takes as input : issueNumber(as String) , publicationDate(as Dat)
  //this constructor inherits from LibraryItem the titlte and if it is isAvailable
  public Magazine(String title , String issueNumber , Date publicationDate){
    super(title, true);
    this.issueNumber = issueNumber;
    this.publicationDate = publicationDate;
  }
  
  //Methods
  //Returns the issue number of the magazine.
  public String getIssueNumber(){
    return issueNumber;
  }
  // Returns the date of publication. 
  public Date getPublicationDate(){
    return publicationDate;
  }
  
  /*Overrides toString method from LibraryItem returns a string describing the item from
    parent method plus publication date and issue number.*/
  @Override
  public String toString(){
    return super.toString() + ",Publication Date : " + getPublicationDate() + " ,IssueNumber : " + getIssueNumber(); 
  }
}