
/**
 * Created by tina on 2015/10/17.
 */
package edu.buaa.sse.lesson.unittest;
import static org.junit.Assert.*;
import org.junit.Test;


public class TriangleTest {
        @Test
        public void testTriangle_legal()
        {
            Triangle t = new Triangle(2,2,3);
            assertTrue(t.isTriangle());
        }
        @Test
        public void testTriangle_illegal()
        {
            Triangle t = new Triangle(1,2,3);
            assertFalse(t.isTriangle());
        }

//	@Test
//	public void testisTriangle() {
//		Triangle t1 = new Triangle(1,2,3);
//		assertFalse(t1.isTriangle());
//		Triangle t2 = new Triangle(2,2,3);
//		assertTrue(t2.isTriangle());
//	}

    }


