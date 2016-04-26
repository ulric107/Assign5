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
public class RightAngledTriangleTest {
	RightAngledTriangle tri;

	@Before
	public void setUp() throws Exception {
	 tri = new RightAngledTriangle(3.0, 4.0, 5.0);
	}

	@Test
	public void test() throws Exception{
		RightAngledTriangle tri = new RightAngledTriangle(3.0, 4.0, 5.0);
		double test = Math.round(tri.getArea() * 10 / 10.0);
		
		assertEquals(test, 1.0, 0);
	}
	
	@Test
	public void testNotEqual() throws Exception
	{
		try {
			tri = new RightAngledTriangle(3.0, 4.0, 4.0);
		} catch (Exception e) {
			System.out.println("error caught");
		}
	}

}