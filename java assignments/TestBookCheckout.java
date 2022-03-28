/*
 * a program to checkout books bought
 */
package assignment1;

import java.util.Scanner;


public class TestBookCheckout {
    public static void main(String[] args){ 
        Scanner scan = new Scanner(System.in);
        int largeHbook, smallHbook,softBook;
        double price;
        String keepGoing ="Y";
        
        System.out.println("\nWelcome to the Annual Australian Book Festival!");
        do{
            System.out.println("\nEnter the number of large print hardback books purchased:");
            largeHbook = scan.nextInt();
            System.out.println("\nEnter the number of small print hardback books purchased:");
            smallHbook = scan.nextInt();
            System.out.println("\nEnter the number of softcover books purchased:");
            softBook = scan.nextInt();
            BookBill bill = new BookBill(largeHbook, smallHbook,softBook);
            System.out.println("Your total bill is:  $"+  bill.bookPrice());
            System.out.println("\nWould you like to calculate another bill? (Y / N)");
            keepGoing = scan.next();
               
        }while(keepGoing.equalsIgnoreCase("Y"));
        
        System.out.println("\nGoodbye! Thanks for your purchase.");
        
    } 
    
    
    
}
