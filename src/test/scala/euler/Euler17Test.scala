package euler

import org.junit.{Before, Test}
import org.junit.Assert.assertEquals

/**
 * Created by miralabs on 10/4/2014.
 */
class Euler17Test {

  val euler = new Euler17

  @Test def euler17() {

    val euler = new Euler17
    assertEquals(21124,euler.solve)

  }

  @Test def test1000(): Unit = {
    assertEquals("one thousand",euler.toWord(1000))
  }

  @Test def testTens(): Unit = {
    assertEquals("nineteen",euler.toWord(19))
    assertEquals("eleven",euler.toWord(11))
    assertEquals("thirty",euler.toWord(30))
    assertEquals("fifty five",euler.toWord(55))

  }

  @Test def testHundreds(): Unit = {
    assertEquals("one hundred",euler.toWord(100))
    assertEquals("nine hundred and ninety nine",euler.toWord(999))
    assertEquals("three hundred and fifty",euler.toWord(350))
  }

}
