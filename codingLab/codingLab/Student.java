
/**
 * Class Student - part of the sample model for TMA02 
 * made at Coding Lab with Donna.
 * 
 * @author Michal Derleta 
 * @version 0.1
 */
public class Student
{
   // instance variables - replace the example below with your own
   private String forename;
   private String surname;
   private String PI;
   private int age;

   /**
    * Constructor for objects of class Student
    */
   public Student()
   {
      // initialise instance variables
      this.forename = "";
      this.surname = "";
      this.PI = "";
      this.age = 18;
   }
   
   //getter methods for all instance variables
   /**
    * Returns students forename.
    */
   public String getForename()
   {
      return this.forename;
   }
   
   /**
    * Returns students surname.
    */
   public String getSurname()
   {
      return this.surname;
   }
   
   /**
    * Returns the value of students Public Identifier Number.
    */
   public String getPI()
   {
      return this.PI;
   }
   
   /**
    * Returns students age.
    */
   public int getAge()
   {
      return this.age;
   }
   
   //setter methods for all instance variables
   /**
    * Sets student's forename.
    */
   public void setForename(String aForename)
   {
      this.forename = aForename;
   }
   
   /**
    * Sets student's surname.
    */
   public void setSurname(String aSurname)
   {
      this.surname = aSurname;
   }
   
   /**
    * Sets student's PI number.
    */
   public void setPI(String aPI)
   {
      this.PI = aPI;
   }
   
   /**
    * Sets student's age.
    */
   public void setAge(int anAge)
   {
      this.age = anAge;
   }
   
   /**
    * Returns a string representation of the receiver.
    */
   public String toString()
   {
      return "An instance of class " + this.getClass().getName()
      + ": PI" + this.getPI() + ", " 
      + "Name " + this.getForename() + " " + this.getSurname() + ", " 
      + "Age " + this.getAge();
   }   
}
