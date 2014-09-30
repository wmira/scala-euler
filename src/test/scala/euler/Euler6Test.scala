package euler

import org.junit.Test
import org.junit.Assert.assertEquals
/**
 *
 */
class Euler6Test {

  @Test def euler6() = {
    val euler = new Euler6
    assertEquals( 25164150 , euler.solve )

  }
}
