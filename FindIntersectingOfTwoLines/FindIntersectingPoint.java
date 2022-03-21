/*
 * solving a linear equation to find the intersecting point of two lines
 *     ax + by = e             x = ed -bf / ad - bc   y = af - ec / ad - bc
 *     cx + dy = f
 *    (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 *    (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
 */
import java.util.Scanner;

public class FindIntersectingPoint {
  public static void main(String[] args){ 
     
      double[][] points = new double[4][2]; // two dimentional array to store the four points
      double a, b, c, d, e, f;
      double x1, y1,x2, y2,x3,y3,x4,y4;
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter the coordinators for the two end points for the first line segment: ");
      for(int i = 0; i < points.length; i++){ // store the points in the array
          for(int j = 0; j < points[i].length; j++){
              points[i][j] = scan.nextDouble();
          }
      } 
      
      // find the xs and ys and  a b c d e f
      x1 = points[0][0];
      x2 = points[1][0];
      x3 = points[2][0];
      x4 = points[3][0];
      y1 = points[0][1];
      y2 = points[1][1];       
      y3 = points[2][1];
      y4 = points[3][1];       
      
      //(y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1  (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
      a = y1 - y2;
      b = - (x1 - x2);
      c = y3 - y4;
      d = - (x3 - x4);
      e = (y1 - y2)*x1 - (x1 - x2)*y1;
      f = (y3 - y4)*x3 - (x3 - x4)*y3;
              
              
      // create a linearequationclass object
      LinearEquationClass linear = new LinearEquationClass(a,b,c,d,e,f);
      if(linear.isSolvable() == true){
          System.out.printf("The intersecting point for the two lines are at: (%.2f,%.2f)",linear.getX(),linear.getY());
      }else{
          System.out.println("This two lines are parallel");
      }
      
      
      } 
      
      
      
   }   
  