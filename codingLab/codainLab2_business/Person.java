
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
   // instance variables
   private String name;
   private String address;
   private int dob;

   /**
    * Constructor for objects of class Person
    */
   public Person(String n, String a, int d)
   {
      this.name = n;
      this.address = a;
      this.dob = d;      
   }

   //getters
   public String getName()
   {
      return this.name;
   }
   
   public String getAddress()
   {
      return this.address;
   }
   
   public int getDob()
   {
      return this.dob;
   }
   
   @Override
   public String toString()
   {
      return "Person [" + details() + ".]";
   }
   public String details()
   {
      return "Person [" + name + " from " + address + " born in " + dob +".]";
   }

}
