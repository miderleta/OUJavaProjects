import ou.*;

/**
 * Instances of this class are used to calculate the cost in pounds sterling
 * of buying a foreign currency.
 * 
 * @author M250 Module Team
 * @version 1.6
 */

public class CurrencyConverter
{
   // class variables
   private static double fixedFee = 2.00;
   private static double percentageRate = 0.05;

   // instance variables
   private double exchangeRate;
   private String currencyName;

   /**
    * Constructor for objects of class CurrencyConverter.
    */
   public CurrencyConverter(String nameOfCurrency, double rate)
   {
      this.currencyName = nameOfCurrency;
      this.exchangeRate = rate;
   }

   // class methods
   /**
    * Sets the fixedFee of the receiver to the value of the argument.
    */
   public static void setFixedFee(double fee)
   {
      CurrencyConverter.fixedFee = fee;
   }

   /**
    * Returns the value of the fixedFee of the receiver.
    */
   public static double getFixedFee()
   {
      return CurrencyConverter.fixedFee;
   }

   /**
    * Sets the percentageRate of the receiver to the value of the argument.
    */
   public static void setPercentageRate(double percentage)
   {
      CurrencyConverter.percentageRate = percentage;
   }

   /**
    * Returns the value of the percentageRate of the receiver.
    */
   public static double getPercentageRate()
   {
      return CurrencyConverter.percentageRate;
   }

   //instance methods
   /**
    * Sets the exchangeRate of the receiver to the value of the argument.
    */
   public void setExchangeRate(double rate)
   {
      this.exchangeRate = rate;
   }

   /**
    * Returns the value of the exchangeRate of the receiver.
    */
   public double getExchangeRate()
   {
      return this.exchangeRate;
   }

   /**
    * Sets the curencyName of the receiver to the value of the argument.
    */
   public void setCurrencyName(String nameOfCurrency)
   {
      this.currencyName = nameOfCurrency;
   }

   /**
    * Returns the value of the currencyName of the receiver.
    */
   public String getCurrencyName()
   {
      return this.currencyName;
   }

   // Change the following method so that it makes use of calculateCommission()
   /** 
    * Calculate and report cost in sterling of buying an amountOfCurrency. 
    */
   public void reportCostOfCurrency(int amountOfCurrency)
   {
      double  percentageFee, commission, cost;

      cost = this.calculateCommission(amountOfCurrency) + (amountOfCurrency / this.getExchangeRate());
      String costString = String.format("%.2f", cost);
      String result = amountOfCurrency + " " 
         + this.getCurrencyName() 
         + " cost �" + costString;

      OUDialog.alert(result);
   }

   /**
    * Prompts the user to enter the amount of currency via a request() dialogue box.
    * Once the cost of the currency in sterling has been calculated the method asks 
    * the user via a confirm() dialogue box if they wish to calculate the cost of 
    * another transaction. The method will continue to ask the user if they wish to 
    * calculate the cost of another transaction until the user clicks the No button 
    * of the confirm() dialogue box. 
    */
   public void doTransactions()
   {
      String amountString;
      int amountOfCurrency;

      boolean repeat = true;
      while (repeat)
      {
         amountString = OUDialog.request("How many " + this.getCurrencyName() + "?");
         amountOfCurrency = Integer.parseInt(amountString);
         this.reportCostOfCurrency(amountOfCurrency);  
         repeat = OUDialog.confirm("Would you like another transaction?");
      }
   }

   // Add the methods calculateCommission() and displayCommission() below
   /**
    * Prompts the user to enter the amount of currency via the request() dialogue box.
    * Calculates the total commision for the transaction.
    */
   public double calculateCommission(int amountOfCurrency)
   {
      double percentageFee, commission;
      
      percentageFee = CurrencyConverter.getPercentageRate() * amountOfCurrency / this.getExchangeRate();
      commission = CurrencyConverter.getFixedFee() + percentageFee;
      
      return commission;
   }
   
   /**
    * Displys the amout of the commission for the transaction using alert() dialogue box.
    */
   public void displayCommission(int amountOfCurrency)
   {
      double cost;
      String costString, result;
      
      cost = this.calculateCommission(amountOfCurrency);
      costString = String.format("%.2f", cost);
      result = "To buy " + amountOfCurrency + " " + this.getCurrencyName()
         + " will entail a commission cost of �" + costString;
         
      OUDialog.alert(result);
   }
}

