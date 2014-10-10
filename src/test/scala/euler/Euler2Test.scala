package euler

import org.junit.Assert._
import org.junit.Test

/**
 *
 */
class Euler2Test extends EulerTest{

  override def solverAnswer : Long = 4613732L
  override def createSolver() : EulerSolver = new Euler2(4000000)

}
