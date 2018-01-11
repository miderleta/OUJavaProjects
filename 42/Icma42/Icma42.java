
/**
 * Write a description of class Icma42 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Icma42
{

   /**
    * Constructor for objects of class Icma42
    */
   public Icma42()
   {
      super();
   }

    /**
    *Takes three arguments:- 
    * claimValue - an int value representing the value claimed by the user in pounds
    * verificationCode - A String representing the verification code printed on the card
    * secretKey - a String representing the secret key used to validate the claim
    *
    * Iterates over the characters in the Strings adding the position of matches
    * and subtracting the position of mis-matches to determine the prize value
    * The claim is valid if the amount claimed is equal to the prize value determined.
    * Returns a boolean value true if the claim is valid and false otherwise.
    */
   public boolean verifyWin(int claimValue, String verificationCode, String secretKey)
   {
     //create and initialise your local variable prize here
     int prize = 0;
    
     // insert your loop here 
     for (int i = 0; i < secretKey.length(); i++)
     {
        if (verificationCode.charAt(i) == secretKey.charAt(i))
        {
           prize = prize + (i + 1);
           System.out.println(prize);
        }
        else
        {
           prize = prize - (i + 1);
           System.out.println(prize);
        }
     }
     // and return your value here
     if (claimValue == prize)
     {
        return true;
     }
     else
     {
        return false;
     }
   }
}
