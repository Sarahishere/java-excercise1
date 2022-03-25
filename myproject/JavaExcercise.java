
package javaexcercise;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaExcercise {

    
    public static void main(String[] args) { 
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers(enter  \"end\" to stop the input):");
       ArrayList<Double> arr = new ArrayList<>();
       arr = getArrayList(scan); // get arraylist 
       double mean = mean(arr);
       double deviation = deviation(arr);
        System.out.println("The mean of the numbers are: " + String.format("%.3f", mean)
        +"\nThe deviation of the numbers are: " + String.format("%.3f", deviation));
    }
    
    static ArrayList getArrayList(Scanner scan){
        String input;
        ArrayList<Double> arr = new ArrayList<>();
        do{
            input = scan.next();
            if(!input.equalsIgnoreCase("end")){
                
                arr.add(Double.parseDouble(input));
            }
        }while(!input.equalsIgnoreCase("end"));
        
        
        
        return arr;
    }
    
    static double mean(ArrayList<Double> arr){ 
        double sum = 0;
        for(int i = 0; i < arr.size();i++){
            sum += arr.get(i);
        }
        
        return sum / arr.size();
    }
    
    static double deviation(ArrayList<Double> arr){
        double sum = 0;
        double mean = mean(arr);
        for(int i = 0;i < arr.size();i++){
            sum += Math.pow((arr.get(i) - mean), 2);
              
        }
        return  Math.sqrt(sum/(arr.size()-1) );
    }
    
}
