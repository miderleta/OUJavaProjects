
/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat extends Animal implements Pet
{
   // instance variables - replace the example below with your own
   

   /**
    * Constructor for objects of class Cat
    */
   public Cat()
   {
      // initialise instance variables
   }

   @Override
   public String sound()
   {
      return "Miaow!";
   }
   
   @Override
   public boolean mustBeCaged()
   {
      return false;
   }
   
   @Override
   public boolean mustBeLicensed()
   {
      return false;
   }
}
