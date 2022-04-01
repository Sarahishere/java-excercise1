
package assignment2;


public class Point3D {
    private double x;
    private double y;
    private double z;
    private String color;
    
    Point3D(){
        x = y = z =0;
        color = "Red";
    }
   
    Point3D(double x, double y, double z, String color){
       this.x = x;
       this.y = y;
       this.z = z;
       this.color = color;
    }
    
    // getters

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String getColor() {
        return color;
    }
    
    //return the distance between the current point and another point
    public double distance(Point3D point){
        return Math.sqrt((Math.pow(x - point.getX(), 2)) + (Math.pow(y - point.getY(), 2)) + (Math.pow(z - point.getZ(), 2)));
    }
    
    
}
