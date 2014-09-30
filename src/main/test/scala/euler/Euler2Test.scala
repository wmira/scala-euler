package euler

import org.junit.Assert._
import org.junit.Test

/**
 * Created by miralabs on 9/30/2014.
 */
class Euler2Test {

  @Test def euler2() = {

    val euler = new Euler2(4000000)
    val result  = euler.solve

    assertEquals( 4613732, result )
  }
}
