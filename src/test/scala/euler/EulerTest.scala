package euler

import org.junit.Assert._
import org.junit.{Before, Test}

import scala.collection.mutable.ArrayBuffer

/**
 *
 */
trait  EulerTest {


  def solverAnswer : Long
  def createSolver() : EulerSolver

  @Test def euler() = {

    val eur = createSolver
    val result  = eur.solve

    assertEquals( solverAnswer, result )
  }

}
