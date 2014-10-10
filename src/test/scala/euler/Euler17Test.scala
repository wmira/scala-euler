package euler

import org.junit.{Before, Test}
import org.junit.Assert.assertEquals

/**
 * Created by miralabs on 10/4/2014.
 */
class Euler17Test extends EulerTest {

  val euler17 = new Euler17

  override def solverAnswer : Long = 21124L
  override def createSolver() : EulerSolver = new Euler17


  @Test def test1000(): Unit = {
    assertEquals("one thousand",euler17.toWord(1000))
  }

  @Test def testTens(): Unit = {
    assertEquals("nineteen",euler17.toWord(19))
    assertEquals("eleven",euler17.toWord(11))
    assertEquals("thirty",euler17.toWord(30))
    assertEquals("fifty five",euler17.toWord(55))

  }

  @Test def testHundreds(): Unit = {
    assertEquals("one hundred",euler17.toWord(100))
    assertEquals("nine hundred and ninety nine",euler17.toWord(999))
    assertEquals("three hundred and fifty",euler17.toWord(350))
  }

}
