package euler

import org.junit.Test
import org.junit.Assert.assertEquals


class Euler5Test {

  @Test def euler5() = {
    val euler = new Euler5
    assertEquals(232792560,euler.solve )

  }

}
