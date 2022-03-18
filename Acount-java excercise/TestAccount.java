
class TestAccount {
   public static void main(String[]args){
      Account account = new Account(1122,20000);// create account object 
      account.setAnnualInterestRate(4.5);//set annual interest rate
      account.withdraw(2500); //withdraw 
      account.deposit(3000);//deposit
      System.out.println("The balance of the account is: $"+account.getBalance() 
      +"\nThe monthly interest is: $"+account.getMonthlyInterest()
      +"\nThe date the account was created is: "+account.getDateCreated()
      );
      
   }
    
    
    
}
