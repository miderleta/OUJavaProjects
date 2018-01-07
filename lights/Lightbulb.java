
/**
 * Class Lightbulb will model any lightbulb that can be
 * switched on or off in a house.
 * Every new lightbulb will be created being switched off
 * and its colour will be white.
 * 
 * @author Michal Derleta 
 * @version 02-11-2017
 */
public class Lightbulb
{
   // instance variables - replace the example below with your own
   private boolean bulbState; // to indicate if the light is off
   private String colour;  // to indicate what colour the lightbulb is.

   /**
    * Constructor for objects of class Lightbulb
    */
   public Lightbulb()
   {
      // initialise instance variables
      bulbState = false;
      colour = "white";
   }
   
   /**
    * Internal check to see if the light is on or off.
    */
   private boolean isLightOff()
   {
      return this.bulbState;
   }
   
   /**
    * Swithes the lightbulb or on off.
    */
   public void setLight()
   {
      this.bulbState = !(this.isLightOff());
   }
   
   /**
    * Informs the user if the light is on or off.
    */
   public String isLightOn()
   {
      if (this.isLightOff() == false)
      {
         return "Light Off";
      }
      else
      {
         return "Light On";
      }
   }

   /**
    * Returns the info about the state of the receiver.
    */
   public String toString()
   {
      return "This light is " + bulbState + " and its colour is " + colour + ".";
   }
}
