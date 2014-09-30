package euler

import org.junit.Test
import org.junit.Assert.assertEquals


/**
 *
 */
class Euler7Test {

  @Test def euler7() = {
    val euler = new Euler7
    assertEquals(104743,euler.solve)
  }

}
