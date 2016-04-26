/**
 * SE320- Individual Assignment 5
 * 
 * Represents an Equilateral Triangle
 * @author Dr. Donyina
 * @author <Jeran >
 */
public class EquilateralTriangle extends Triangle {
    
    EquilateralTriangle(double length)
            throws Exception {
        super(length, length, length);
    }

   
    public boolean validateInput(double sideA, double sideB, double sideC) {
        return sideA > 0;
    }

/* incorrect original equation below. corrected to 3/4
 * 
 */
   
    public double getArea() 
    {
        return (Math.sqrt(3)/4) * sideA * sideA;
          
    }

}
