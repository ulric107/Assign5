
/**
 * SE320- Individual Assignment 5
 * 
 * Represents a Triangle
 * @author Dr. Donyina
 * @author <Jeran>
 */
public class Triangle {
    
 
    protected double sideA;
    
   
    protected double sideB;
    
    
    protected double sideC;
    
 
    
    /*
     * Altered throw location
     */
    Triangle(double sideA, double sideB, double sideC) throws Exception {
        
        if (validateInput(sideA, sideB, sideC)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
            
        }
        else{
        	throw new Exception("Invalid Inputs");
        }
    }
    
   /* Altered false statement location
    */
    public boolean validateInput(double sideA, double sideB, double sideC) {
       if( sideA > 0 && sideB > 0 && sideC > 0){
           return true;
       }
       else{ 
    	   return false;
       }
    }
   
    public double getSideA() {
        return this.sideA;
    }
    
 
    public double getSideB() {
        return this.sideB;
    }
    
   
    public double getSideC() {
        return this.sideC;
    }
    
 
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
    
  
    public double getArea() {
        double p = getPerimeter()/2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

}