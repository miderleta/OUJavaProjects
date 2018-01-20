
/**
 * calss CurrentAccount is a subclass of the Account class
 * allowing the account to be overdrawn to the specified limit and 
 * is protected by PIN number.
 * Two new instance variables are used: creditLimit and pinNum.
 * 
 * @author Michal Derleta 
 * @version 1.0 (07/12/2017)
 */
public class CurrentAccount extends Account
{
   // instance variables
   private double creditLimit;
   private String pinNum;

   /**
    * Constructor for objects of class CurrentAccount
    */
   public CurrentAccount()
   {
     super();
     this.creditLimit = 0.0;
     this.pinNum = "0000";
   }
   
   /**
    * Constructor for objects of calss CurrentAccount,
    * which sets the values of holder, number, balance,
    * creditLimit and pinNum to the arguments aHolder,
    * aNumber, aBalance, aLimit, and aPin respectively.
    */
   public CurrentAccount(String aHolder, String aNumber, double aBalance, double aLimit, String aPin)
   {
      super(aHolder, aNumber, aBalance);
      this.creditLimit = aLimit;
      this.pinNum = aPin;
   }

   /**
    * Returns the credit limit of the receiver.
    */
   public double getCreditLimit()
   {
     return this.creditLimit;
   }
   
   /**
    * Sets the creditLimit of the receiver to the
    * argument aLimit
    */
   public void setCreditLimit(double aLimit)
   {
      this.creditLimit = aLimit;
   }
   
   /**
    * Returns the pinNum of the receiver.
    */
   public String getPinNum()
   {
      return this.pinNum;
   }
   
   /**
    * Sets the pinNum of the receiver to the argument aPin.
    */
   public void setPinNum(String aPin)
   {
      this.pinNum = aPin;
   }
   
   /**
    * Calculates and returns the amount available
    * to spend; the total of the receivers's balance
    * and creditLimit.
    */
   public double availableToSpend()
   {
      return this.getCreditLimit() + this.getBalance();
   }
   
   /**
    * If the amount availibleToSpend of the receiver is equal to or greater than the argument anAmount,
    * the balance of the receiver is debited by the argument anAmount and the method
    * returns true.
    *
    * If the balance of the receiver is not equal to or greater than the argument
    * anAmount, the method simply returns false.
    */
   @Override
   public boolean debit(double anAmount)
   {
      if (this.availableToSpend() >= anAmount)
      {
         this.setBalance(this.getBalance() - anAmount);
         return true;
      }
      else
      {
         return false;
      }
   }
   
}
