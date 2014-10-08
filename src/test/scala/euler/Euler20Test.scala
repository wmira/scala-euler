package euler

import org.junit.Test
import org.junit.Assert.assertEquals

/**
 *
 */
class Euler20Test  {

  @Test def euler20() = {
    val euler = new Euler20
    assertEquals(648,euler.solve)
  }

  @Test def test10Factorial() = {
    val euler = new Euler20
    assertEquals(27,euler.solve(10))
  }
}
