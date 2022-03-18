
import java.util.Date;

/*
 * Account class 
 */

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
  // no-arg constructor, create a default account
    Account(){
       id = 0;
       balance = 0;
       annualInterestRate = 0;
       dateCreated = new Date();
    }
    // constructor creates an account with the specified id and initial balance
    Account(int id,double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    
    // getters and setters 
    int getID(){
        return id;
    }
    double getBalance(){
        return balance;
    } 
    double getAnnualInterestRate(){
        return annualInterestRate;
    }
    String getDateCreated(){
        return dateCreated.toString();
    }
    
    void setID( int newId){
        id = newId;
    }
    void setBalance(double newBalance){
        balance = newBalance;
    }
    void setAnnualInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }
    //monthlyInterestRate is annualInterestRate / 12
    double getMonthlyInterestRate(){
        return getAnnualInterestRate() / 12;
    }
    
    // Monthly interest is balance * monthlyInterestRate
    double getMonthlyInterest(){
        return getBalance() * (getMonthlyInterestRate()/100);
    }
    //withdraws a specified amount from the account
    void withdraw(double withdraw){
        balance = balance - withdraw;
    }
    // deposits a specified amount to the account
    void deposit(double deposit){
       balance = balance + deposit; 
    } 
}
