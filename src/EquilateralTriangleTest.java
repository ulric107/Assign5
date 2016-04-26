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
public class EquilateralTriangleTest {
	EquilateralTriangle tri;


	@Before
	public void setUp() throws Exception {
		tri = new EquilateralTriangle(3.0);
	}

		@Test
		public void testGetSize() throws Exception {
			EquilateralTriangle tri = new EquilateralTriangle(3.0);
			Double test = Math.round(tri.getArea() * 10) / 10.0;
			Double result = 3.9;
			assertEquals(test, result);
		}
		
		@Test
		public void testGetSizeNeg() {
			try {
				 tri = new EquilateralTriangle(-3.0);
			} catch (Exception e) {
				System.out.println("error caught");
			}
		}
	}

