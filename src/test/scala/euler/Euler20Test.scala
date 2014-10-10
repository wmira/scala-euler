package euler

import org.junit.Test
import org.junit.Assert.assertEquals

/**
 *
 */
class Euler20Test extends EulerTest {
  override def solverAnswer : Long = 648L
  override def createSolver() : EulerSolver = new Euler20



  @Test def test10Factorial() = {
    val euler = new Euler20
    assertEquals(27,euler.solve(10))
  }
}
