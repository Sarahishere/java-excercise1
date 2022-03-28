
// a program to count tax based on different filing status 
package assignment1;

import java.util.Scanner;


public class TestTaxFile { 
     public static void main(String[] args){ 
         int filingStatus;
         double taxableIncome,tax;
         double[] rates = {0.1,0.15,0.25,0.28,0.33,0.35};// store the rates for different threshholds
         int[][] thresholds = {
             {8350,33950,82250,171550,372950},// filingStatus = 0
             {16700,67900,137050,208850,372950},//filingStatus = 1
             {8350,33950,68525,104425,186475},//filingStatus = 2
             {11950,45500,117450,190200,372950}//filingStatus = 3
             
         }; // store the threshholds of taxable income
         Scanner scan = new Scanner(System.in);
        
         filingStatus = getFilingStatus(scan); 
         taxableIncome = getTaxableIncome(scan);
         tax = getTax(rates,thresholds,filingStatus,taxableIncome);
         System.out.println("The tax is $:" + String.format("%.3f", tax));
         
     }
     
     
    public static double getTax(double[] rates, int[][]thresholds,int filingStatus, double taxableIncome){
        double tax = 0, incomeTaxed = 0;
       
        for(int i = (thresholds[filingStatus].length -1); i >= 0; i--){
            if(taxableIncome > thresholds[filingStatus][i]){
               incomeTaxed = taxableIncome - thresholds[filingStatus][i];
               tax = tax + incomeTaxed*rates[i+1];
               
               taxableIncome = taxableIncome - incomeTaxed;
                
            }
            
        } 
        tax += thresholds[filingStatus][0] * rates[0];
        return tax;
         
    } 
     
     
     public static int getFilingStatus(Scanner scan){ 
          System.out.println("Please enter your filing status:"
                 + " \n(Enter 0 for single filers, "
                 + " 1 for married filing jointly or qualified widow(er), "
                 + " 2 for married filing separately, and " +
                    "3 for head of household).");
         int input = scan.nextInt();
         
         return input;
     }
     
    public static double getTaxableIncome(Scanner scan){
        System.out.println("Please enter your income: ");
        return scan.nextDouble();
    } 
    
   
}
