
/**
 * Write a description of class Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dog extends Animal implements Pet
{
   // instance variables - replace the example below with your own
   private int x;

   /**
    * Constructor for objects of class Dog
    */
   public Dog()
   {
      // initialise instance variables
      x = 0;
   }

   @Override
   public String sound()
   {
      return "Woof!";
   }
   public boolean mustBeCaged()
   {
      return false;
   }
   public boolean mustBeLicensed()
   {
      return true;
   }
  

}
