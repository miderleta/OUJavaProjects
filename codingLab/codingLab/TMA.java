
/**
 * Class TMA - part of the model to help with TMA02
 * made at the Coding Lab with Donna.
 * 
 * @author Michal Derleta
 * @version 0.1
 */
public class TMA
{
   // instance variables - replace the example below with your own
   private Student lerner;
   private String assignmentNo;
   private int mark;
   private boolean late;

   /**
    * Constructor for objects of class TMA
    */
   public TMA(Student aStudent, String TMAAssignmentNo, int TMAMark, boolean TMALate)
   {
      // initialise instance variables
      this.mark = TMAMark;
      this.assignmentNo = TMAAssignmentNo;
      this.late = TMALate;
      this.lerner = aStudent;      
   }
   
   //getters methods for instance varables
   /**
    * Returns TMA's mark.
    */
   public int getMark()
   {
      return this.mark;
   }
   
   /**
    * Returns TMA's assignment number.
    */
   public String getAssignmentNo()
   {
      return this.assignmentNo;
   }
   
   /**
    * Returns info about the student
    * who submitted this TMA.
    */
   public Student getLerner()
   {
      return this.lerner;
   }
   
   /**
    * Displys information about if
    * TMA submission was late.
    */
   public boolean getStatus()
   {
      return this.late;
   }
   
   //setter methods for all instance variables
   /**
    * Sets lerner information
    */
   public void setLerner(Student aStudent)
   {
      this.lerner = aStudent;
   }
   
   /**
    * Sets TMA's assignment number.
    */
   public void setAssignmentNo(String aAssignmentNo)
   {
      this.assignmentNo = aAssignmentNo;
   }
   
   /**
    * Sets the mark for the assignment.
    */
   public void setMark(int aMark)
   {
      this.mark = aMark;
   }
   
   /**
    * Allaws subbmission to be marked late 
    * or on time.
    */
   public void setStatus(boolean aLate)
   {
      this.late = aLate;
   }
   
   /**
    * Returns a string representation of the receiver.
    */
   public String toString()
   {
      return "An instance of class " + this.getClass().getName()
      + ":Student " + this.getLerner().getForename() + " "
      + this.getLerner().getSurname() + " "
      + "AssignmentNo " + this.getAssignmentNo() + " "
      + "Late " + this.getStatus();
   }
}
