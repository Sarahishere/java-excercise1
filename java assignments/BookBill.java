
package assignment1;


public class BookBill {
  private int largeHbook, smallHbook,softBook;
  double bill;
  
  private double largeHbookPrice ,smallHbookPrice,softBookPrice;
  
  BookBill(){
     bill = 0; 
  }
    
  BookBill(int largeHbook,int smallHbook,int softBook ){
     this.largeHbook =  largeHbook;
     this.smallHbook = smallHbook;
     this.softBook = softBook;
  }  
  
  double bookPrice(){
      double largeHbookPrice,smallHbookPrice,softBookPrice;
      largeHbookPrice = (int)(largeHbook / 3)*40 + (largeHbook % 3)*20; // 20 per book, 40 every three
      smallHbookPrice = (int)(smallHbook / 2)*15 + (smallHbook % 2)*10;// 10 per book, 15 every two
      softBookPrice = (int)(softBook / 4)*10 + (softBook % 4)*5; // 5 per book, 10 every four books  
      return largeHbookPrice + smallHbookPrice + softBookPrice;
  }

  
}
