package euler

import org.junit._
import org.junit.Assert._

/**
 *
 */
class Euler9Test {

  @Test def euler9() = {

    val eur1 = new Euler9
    val result  = eur1.solve

    assertEquals( 31875000, result )
  }
}
