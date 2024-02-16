package lab.exceptions;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class QuadraticTest {
  @Test
  public void testSmallerRoot1() throws Exception {
    assertEquals(-5, new Quadratic(1, 3, -10).smallerRoot(), 0.000001);
    assertEquals((double) -3/2, new Quadratic(6, 1, -12).smallerRoot(), 0.000001);
  }
}
