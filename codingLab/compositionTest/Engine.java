
/**
 * Class Engine is a composistion exercise which will test the understanding 
 * of the subject. This class will be used in class Car.
 *  
 * @author M Derleta
 * @version 15/01/2018
 */
public class Engine
{
   // instance variables
   private int revs;
   private int MAXREVS;
   private int MINREVS;
   private int REVSINC;

   /**
    * Constructor for objects of class Engine
    */
   public Engine()
   {
      // initialise instance variables
      super();
      this.revs = 0;
      this.MAXREVS = 6000;
      this.MINREVS = 1000;
      this.REVSINC = 1000;
   }
   
   //getter and setter methods methods
   /**
    * Returns the amout of revs of the receiver.
    */
   public int getRevs()
   {
      return this.revs;
   }
   
   /**
    * sets the amout of revs of the receiver to the argument aRevs.
    */
   public void setRevs(int aRevs)
   {
      this.revs = aRevs;
   }
   
   /**
    * Returns True if the value of revs is higher than 0
    * - engine is running.
    */
   public boolean isRunning()
   {
      return this.getRevs() > 0;
   }
   
   /**
    * Checks if engine isRunning(). If yes returns False, else
    * Returns True and increses the value of revs by REVSINC (starts the engine).
    */
   public boolean startEngine()
   {
      if(this.isRunning() == false && this.getRevs() == 0)
      {
         revs = this.getRevs() + REVSINC;
         return true;
      }
      else
      {
         return false;
      }
   }
   
   /**
    * increases.
    */
   public boolean incRevs()
   {
      if (this.getRevs() < MAXREVS)
      {
         revs = this.getRevs() + REVSINC;
         return true;
      }
      else
      {
         this.setRevs(0);
         return false;
      }
   }
   
   public boolean decRevs()
   {
      if (this.getRevs() > MINREVS)
      {
         revs = this.getRevs() - REVSINC;
         return true;
      }
      else
      {
         this.setRevs(0);
         return false;
      }
   }
   
   public void reduceToIdling()
   {
      while (this.getRevs() > MINREVS)
      {
         revs = this.getRevs() - REVSINC;
      }
   }
}
