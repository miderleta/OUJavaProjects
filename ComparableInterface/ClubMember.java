
/**
 * Write a description of class ClubMember here.
 * 
 * Activity 10 Unit 11 - Comperable Interface
 */
public class ClubMember
{
   // instance variables
   private String firstName;
   private String lastName;
   private int age;

   /**
    * Constructor for objects of class ClubMember
    */
   public ClubMember(String first, String last, int years)
   {
      this.firstName = first;
      this.lastName = last;
      this.age = years;      
   }

   //Setter and getter methods
   public String getFirstName() {
      return this.firstName;
   }
   
   public void setFirstName(String aName) {
      this.firstName = aName;
   }
   
   public String getLastName() {
      return this.lastName;
   }
   
   public void setLastName(String aSurname) {
      this.lastName = aSurname;
   }
   
   public int getAge() {
      return this.age;
   }
   
   public void setAge(int anAge) {
      this.age = anAge;
   }
   
   
}
