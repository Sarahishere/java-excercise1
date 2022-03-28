/*
 * process input marks.
 */
package assignment2;

import assignments.at.csu.TestClass;
import java.util.*;


public class TestMarksProgram {
  public static void main(String[] args){ 
      
      ArrayList<Integer> arr = new ArrayList<Integer>();
      Scanner scan = new Scanner(System.in);
      int input = 0;
      System.out.println("Enter the marks(Enter 101 to end the input): ");
      input = scan.nextInt();
      while(input <= 100){ 
          arr.add(input);
          input = scan.nextInt();
      }
      
      
      Marks mark = new Marks(arr);
      System.out.println("\nThe grades are shown below:");
      mark.displayGrade();
      System.out.println("\n\nThe grades distribution is shown below:");
      mark.displayDistribution();
      System.out.println("\nThe maximum grade is: " + mark.getMax()
              +"\nThe minimum grade is: " + mark.getMin()
              +"\nThe range of the grade is: " + mark.getRange()
              +"\nThe median of the grade is: " + mark.getMedian()
              +"\nThe mode of the grade is: " + mark.getMode()
              +"\nThe mean of the grade is: " + mark.getMean()
      );
      
      
  }  
}
