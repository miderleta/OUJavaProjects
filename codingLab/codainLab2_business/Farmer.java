
/**
 * Write a description of class Farmer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Farmer extends Person
{
   // instance variables

   /**
    * Constructor for objects of class Farmer
    */
   public Farmer(String n, String a, int d)
   {
      super(n, a, d);
   }
   
   @Override
   public String toString()
   {
      return "Farmer [" + getName() + " from " + getAddress() 
      + " born in " + getDob() +".]";
   }
}
