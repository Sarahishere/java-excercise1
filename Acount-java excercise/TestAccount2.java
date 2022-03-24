import java.util.Scanner;

public class TestAccount2 {
   public static void main(String[] args){ 
       
       int id,choice = 1;
       Scanner scan = new Scanner(System.in);
       Account[] accountArray =createInitialAccounts();
       
      while(true){ // this program never ends
           System.out.println("\nEnter an id: ");
       //check id validation
       id = scan.nextInt();
       while(idValidation(id,accountArray)== false){
           System.out.println("Incorrect id, please enter correct id");
           id = scan.nextInt();
       } 
       
        do{
           mainMenu();// display main manue and get choice
           choice = scan.nextInt();
           excecuteChoice(id,accountArray,choice);  // excecute the choices
       }while(choice != 4);
      
      
      }   
   } 
   
   
   
   // excecute choice
   static void excecuteChoice(int id, Account[] accountArray,int choice){  
        double amountWithdraw,amountDeposit;
        Scanner scan = new Scanner(System.in);
      //find the account that need to be excecuted
      
      switch (choice){
            case 1:System.out.println("The balance is:$ "+accountArray[id].getBalance());
                  break;
            case 2:System.out.println("Enter an amount to withdraw:");
                   amountWithdraw = scan.nextDouble();
                   accountArray[id].withdraw(amountWithdraw);
                   break;
            case 3:System.out.println("Enter an amount to deposit:");
                   amountDeposit = scan.nextDouble();
                   accountArray[id].deposit(amountDeposit);
                   break; 
   }
   
   }
   
   //check the validation of id
   static boolean idValidation(int id,Account[] accountArray){
       for(int i = 0; i < accountArray.length; i++){
           if(accountArray[i].getID() == id ){
               return true; 
           }
       }
       return false;
   }
   
   // display main menu
   static void mainMenu(){ 
       
       System.out.println("\nMain menu"
       +"\n1: check balance"
               + "\n2: withdraw"
               + "\n3: deposit"
               + "\n4: exit"
               +"\nEnter a choice"); 
   }
   
   // Create 10 accounts in an array with id 0,1, . . . , 9, and an initial balance of $100
      static Account[] createInitialAccounts(){ 
       int initialBalance = 100;   
       Account[] accountArray = new Account[10];
       for(int i = 0; i < accountArray.length; i++){
           accountArray[i] = new Account(i,initialBalance);
       }
      return accountArray; 
   }
    
    
}
