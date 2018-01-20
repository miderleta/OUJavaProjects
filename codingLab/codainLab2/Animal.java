
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Animal
{
   // instance variables
   private int legs;
   private String diet;
   private boolean wild;
   private String nameOfYoung;
   private String sex;   

   /**
    * Constructor for objects of class Animal
    */
   public Animal()
   {
      // initialise instance variaalbles
      this.legs = 4;
      this.diet = "";
      this.wild = false;
      this.nameOfYoung = "";
      sex = "M";
   }
   
   //getter methods
   public int getLegs()
   {
      return this.legs;
   }
   
    public String getDiet()
   {
      return this.diet;
   }
   
    public String getSex()
   {
      return this.sex;
   }
   
   public abstract String sound();
   
   
   
   
   
}
