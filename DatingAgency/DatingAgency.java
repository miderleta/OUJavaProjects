import java.util.*;
import ou.*;

/**
 * DatingAgency class will be used to collect data
 * of potential agency clients. It's an exercise class
 * build for the java course work.
 * 
 * @author Michal Derleta
 * @version 04/04/2017
 */
public class DatingAgency
{
   /**
    * Constructor for objects of class DatingAgency
    */
   public DatingAgency()
   {
      super();
   }

   /**
    * Creates a set referenced by the variable interestsSet
    * and then repeatedly displays a dialog box
    * (until cancel is pressed) in order to gather
    * a client's interests and add them to interestsSet.
    * Finally the method returns interestsSet.
    */
   public Set<String> gatherInterests(String client)
   {
      //Replace these comments with the code to create a
      //new empty instance of HashSet<String> and
      //assign it to a variable called interestsSet
      //declared as type Set<String>.
      Set<String> interestsSet = new HashSet<>(); //my code

      String dialogString = "Please input an interest for "
         + client + ". Press Cancel to end.";
      String input = OUDialog.request(dialogString);
      while (input != null)
      {
         //Replace these comments with the code to add
         //input to the set interestsSet.
         interestsSet.add(input);
         input = OUDialog.request(dialogString);
      }
      return interestsSet;
   }

   /**
    * Collects and displays interests for two clients.
    */
   public void run(String clientA, String clientB)
   {
      Set<String> interestsSetA = this.gatherInterests(clientA);
      Set<String> interestsSetB = this.gatherInterests(clientB);
      Set<String> commonInterest = new HashSet<>();
      
      System.out.println("Interests for " + clientA + " : ");
      for (String interest: interestsSetA) {
         System.out.println(interest);
      }
      
      System.out.println("Interests for " + clientB + " : ");
      for (String interest: interestsSetB) {
         System.out.println(interest);
      }
      
      commonInterest.addAll(interestsSetA);
      commonInterest.retainAll(interestsSetB);
      System.out.println("The commmon interests are: ");
      for (String interest: commonInterest) {
         System.out.println(interest);
      }
   }
}
