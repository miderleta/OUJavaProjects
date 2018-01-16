
/**
 * Class Car will make a use of class Engine to complete 
 * a Car has an Engine model.
 * 
 * @author Michal Derleta 
 * @version 16/01/2018
 */
public class Car
{
   // instance variables
   private Engine eng; 

   /**
    * Constructor for objects of class Car
    */
   public Car(Engine anEngine)
   {
      // initialise instance variables
      super();
      this.eng = anEngine;             //an example of compsistion as class Car 'has' an eng variable of type Engine
   }
   
   //class methods
   /**
    * Sends a message to eng to start the engine.
    * if unsucessfull displays a messge.
    */
   public void start()
   {
      if (this.eng.startEngine() == false)
      {
         System.out.println("Engine is already running");
      }
      else
      {
         this.eng.startEngine();
      }
   }
   
   /**
    * Returns the value of the engine's variable revs
    */
   public int getRevs()
   {
      return this.eng.getRevs();
   }
   
   /**
    * Enable the user to increase the value of revs (accelerate);
    * will report an error messge if engine isn't running or user blew it up.
    */
   public void accelerate()
   {
      if(this.eng.isRunning() == false)
      {
         System.out.println("You've not started the engine yet");
      }
      else
      {
         this.eng.incRevs();
         if(this.eng.getRevs() == 0)
            {
               System.out.println("You blew up the engine!");
            }
      }
   }
   
   /**
    * Enable the user to decrease the value of revs (de-celerate);
    * will report an error messge if engine isn't running or is stalled.
    */
   public void decelerate()
   {
      if(this.eng.isRunning() == false)
      {
         System.out.println("You've not started the engine yet");
      }
      else
      {
         this.eng.decRevs();
         if(this.eng.getRevs() == 0)
         {
            System.out.println("Stalled");
         }
      }
   }
   
   /**
    * Enable the user to stop and idle the revs;
    * will report an error messge if engine isn't running;
    * if it is, then it will gardully decrease the value of revs.
    */
   public void stop()
   {
      if(this.eng.isRunning() == false)
      {
         System.out.println("You've not started the engine yet");
      }
      else
      {
         this.eng.reduceToIdling();
      }
   }
}
