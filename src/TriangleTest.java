import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author JeranUlrich
 *
 */

public class TriangleTest {
	Triangle tri;

	@Before
	public void setUp() throws Exception {
		 tri = new Triangle(5.0, 3.0, 2.0);
	}

	@Test
	public void test() {

	}
	
	@Test
	public void testGetSizeNeg() {
		try {
			 tri = new Triangle(-3.0, -1.0, -2.0);
		} catch (Exception e) {
			System.out.println("error caught");
		}
	}
	
	@Test
	public void GetA() throws Exception
	{
		Triangle tri = new Triangle(5.0, 3.0, 2.0);
		double side = tri.getSideA();
		double num = 5.0; 
		assertEquals(side, num, 0);
	}	
	
	@Test
	public void GetB() throws Exception
	{
		Triangle tri = new Triangle(5.0, 3.0, 2.0);
		double side = tri.getSideB();
		double num = 3.0;
		assertEquals(side, num, 0);
	}	
	
	@Test
	public void GetC() throws Exception
	{
		Triangle tri = new Triangle(5.0, 3.0, 2.0);
		double side = tri.getSideC();
		double num = 2.0;
		assertEquals(side, num, 0);
	}	
	
	@Test
	public void getPerim() throws Exception{
		double test = tri.getPerimeter();
		double result = 10.0;
		
		assertEquals(test, result, 0);
		
	}
	
	@Test
	public void getAr() throws Exception{
		Triangle tri = new Triangle(5.0, 6.0, 2.0);
		double test = tri.getArea();
		double result = 4.7;
		
		assertEquals(test, result, 0.4);
	}
}
	