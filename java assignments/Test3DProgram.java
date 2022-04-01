
// create multiple points , display the maximum and minimum distance between the points
package assignment2;

import java.util.ArrayList;
import java.util.Scanner;


public class Test3DProgram {
   public static void main(String[] args){ 
       ArrayList<Point3D> arr = new ArrayList<>(); // arraylist to store the points
       double x,y,z;
       String color,keepgoing = "Y";
       Scanner scan = new Scanner(System.in);
       do{
           System.out.println("\nPlease enter the three points(x,y,z) of the Point3D: ");
           x = scan.nextDouble();
           y = scan.nextDouble();
           z = scan.nextDouble();
           System.out.println("Enter the color for this Point3D: ");
           color = scan.next();
           arr.add(new Point3D(x,y,z,color));
           System.out.println("Would you like to keep adding another point?(Y / N)");
           
           keepgoing = scan.next();
       }while(keepgoing.equalsIgnoreCase("Y"));
       
       System.out.println("\nThe information for the point(s) is shown below: ");
       displayPoints(arr);
       getMinDistance(arr);
       getMaxDistance(arr);
   }
   
   static void displayPoints(ArrayList<Point3D> arr){
       for(int i = 0; i < arr.size(); i++){ 
           Point3D point = arr.get(i);
           System.out.println("Point"+ i +":("+ point.getX() +"," + point.getY() +"," + point.getZ() +"," + point.getColor() +")"); 
       }
   }
    
  static void getMinDistance(ArrayList<Point3D> arr){
      double min = arr.get(0).distance(arr.get(1));
      int minIndex1 = 0,minIndex2 = 0;
      for(int i = 0; i < arr.size(); i++){
          for(int j = i + 1; j < arr.size(); j++){
             Point3D point1 = arr.get(i);
             Point3D point2 = arr.get(j);
             if(min > point1.distance(point2) ){
                min = point1.distance(point2);
                minIndex1 = i;
                minIndex2 = j;
             }
              
          } 
          
      } 
      System.out.println("\nPoint:"+ minIndex1 + "and Point:" + minIndex2 +" has the minimum distance: "+ min);
      
  }  
  
  static void getMaxDistance(ArrayList<Point3D> arr){
       double max = arr.get(0).distance(arr.get(1));
      int maxIndex1 = 0,maxIndex2 = 0;
      for(int i = 0; i < arr.size(); i++){
          for(int j = i + 1; j < arr.size(); j++){
             Point3D point1 = arr.get(i);
             Point3D point2 = arr.get(j);
             if(max < point1.distance(point2) ){
                max = point1.distance(point2);
                maxIndex1 = i;
                maxIndex2 = j;
             }
              
          } 
          
      } 
      System.out.println("Point:"+ maxIndex1 + "and Point:" + maxIndex2 +" has the maximum distance: "+ max);
      
  }    
  
}
