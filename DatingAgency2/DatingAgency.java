import java.util.*;
import ou.*;

/**
 * A class which simulates a simple dating agency.
 * 
 * @author M250 Module Team
 * @version 1.2
 */

public class DatingAgency
{
   /**
    * Creates a set referenced by the variable interestsSet and then
    * repeatedly displays a dialog box (until cancel is pressed) in 
    * order to gather a client's interests and add them to interestsSet. 
    * Finally the method returns interestsSet.
    */
   public Set<String> gatherInterests(String client) 
   {
      Set<String> interestsSet = new HashSet<>();
      String dialogString = "Please input an interest for  "
         + client + ". Press Cancel to end."; 
      String input = OUDialog.request(dialogString);
      while (input != null) 
      {
         interestsSet.add(input);
         input = OUDialog.request(dialogString);
      }

      return interestsSet;
   }

   /**
    * Finds and prints the common interests of a pair of clients.
    */
   public void run(String clientA, String clientB)
   {  
      Set<String> interestsA = this.gatherInterests(clientA);
      Set<String> interestsB = this.gatherInterests(clientB);

      System.out.println("Interests for client " + clientA);
      for (String interest : interestsA)
      {
         System.out.println(interest);
      }   

      System.out.println("Interests for client " + clientB);
      for (String interest : interestsB)
      {
         System.out.println(interest);
      }      

      Set<String> commonInterests = new HashSet<>(interestsA);
      commonInterests.retainAll(interestsB);      

      System.out.println("The common interests are: ");
      for (String interest : commonInterests)
      {
         System.out.println(interest);
      }
   }

   public void printPositives()
   {
      Set<Integer> theSet = new HashSet<>();
      theSet.add(1);
      theSet.add(-1);
      theSet.add(10);
      theSet.add(11);
      theSet.add(12);
      theSet.add(-14);
      theSet.add(-4);
      theSet.add(7);

      int positives = 0;
      for (Integer val: theSet)
      {
         if (val > 0)
         {
            positives++;
         }
      }
      System.out.println(positives);
   }
}

