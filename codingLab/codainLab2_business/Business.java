
/**
 * Write a description of class Business here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Business
{
   // instance variables
   private String name;
   private Person owner;
   
   /**
    * Constructor for objects of class Business
    */
   public Business(String  aName, Person anOwner)
   {
      // initialise instance variables
      this.name = aName;
      this.owner = anOwner;
   }
   
   public Business(String  aBusinessName, String anOwnerName, String anOwnerAddress, int aDate)
   {
      // initialise instance variables
      this.name = aBusinessName;
      this.owner = new Person(anOwnerName, anOwnerAddress, aDate);
   }
   
   public String getOwnerName()
   {
      return owner.getName();
   }
   
   @Override
   public String toString()
   {
      return "Bussiness [" + name + " owned by " + owner.getName() + "]";
   }
}
