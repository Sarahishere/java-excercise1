/*
 * LinearEquation class 
 *   
 */

public class LinearEquationClass {
   private double a,b,c,d,e,f;
   LinearEquationClass(double a,double b,double c, double d, double e, double f){
       this.a = a;
       this.b = b;
       this.c = c;
       this.d = d;
       this.e = e;
       this.f = f;
   }
    //getters

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
   
    // boolean method
    public boolean isSolvable(){
        if ( ((a*d)-(b*c)) != 0 ){
            return true;
        }else{
            return false;
        }
    }
    //solution for x
    double getX(){ 
        return (e*d - b*f)/(a*d - b*c);   
    } 
    //solution for y
    double getY(){ 
        return (a*f - e*c)/(a*d - b*c);     
    } 
    
}
