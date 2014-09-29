package euler


import org.junit._
import org.junit.Assert._
/**
 *
 */
class Euler1Test  {

  @Test def euler1() = {

    val eur1 = new Euler1
    val result  = eur1.solve

    assertEquals( 233168, result )
  }
}
