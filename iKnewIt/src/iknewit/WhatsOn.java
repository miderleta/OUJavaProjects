/**
 * Instances of class WhatsOn represent a collection of
 * activities that can be added to, removed, searched etc.
 * 
 * Inspired by Amazon's Echo Dot
 * 
 * @author M250 Module team 
 * @version 1.0
 */
public class WhatsOn
{

   private static String today;
   private static int nextId;

   /**
    * Constructor for objects of class WhatsOn
    */
   public WhatsOn()
   {
      // initialise instance variables

   }
   
   /*
    * updates the value of today  - provided
    */
   public void updateDate(String newDate)
   {
      today = newDate;
   }
   
}

