/**
 * SE320- Individual Assignment 5
 * 
 * Represents a Right Angled Triangle
 * @author Dr. Donyina
 * @author <Jeran>
 */
public class RightAngledTriangle extends Triangle {
    
    RightAngledTriangle(double width, double height, double hypotenuse)
            throws Exception {
        super(width, height, hypotenuse);
    }
    
/*
 * (non-Javadoc)
 * @see Triangle#validateInput(double, double, double)
 * 
 * The return false statement was out of order;
 * had to be inside of if-else block in order 
 * for the function to be ran completely
 */
    public boolean validateInput(double sideA, double sideB, double sideC) 
    {
    	if((sideC * sideC) == ((sideA * sideA) + (sideB * sideB)))
        {
    		return true;
        }
        else{
        	return false;
        }
    }

  
    public double getArea() {
        return ((sideA * sideB) / 2);
    }

}
