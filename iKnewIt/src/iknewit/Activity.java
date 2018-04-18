/**
 * An instance of class Activity represents the sort of
 * activities that might be added to a calendar.
 * 
 * @author M250 MT
 * @version 1.0
 */
public class Activity
{
   // instance variables 
   private String name;
   private String date; // in format "ddmmyy"
   private String time; // in format "hhmm" from "0000" to "2359"

   /**
    * Constructor for objects of class Activity
    */
   public Activity(String aName, String aDate, String aTime)
   {
      // initialise instance variables
      name = aName;
      date = aDate;
      time = aTime;
   }

   /**
    *  setter for date
    */
   public void setDate(String aDate)
   {
 
      date = aDate;
   }
   
      /**
    *  setter for time
    */
   public void setTime(String aTime)
   {

      time = aTime;
   }
   
      /**
    *  setter for name
    */
   public void setName(String aName)
   {

      name = aName;
   }
   
   public String getDate()
   {
      return date;
   }
   
      public String getTime()
   {
      return time;
   }
   
      public String getName()
   {
      return name;
   }

   
}
