package euler

import scala.util.control.Breaks

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 */
class Euler5 extends EulerSolver {

  def isFactorableBy1To20(input : Int) : Boolean = {

    var num = 0
    for ( num <- 1 to 20 ) {
      if ( input % num  != 0 ) {
        return false
      }
    }
    return true

  }

  override def solve(): Long = {
    var numToCheck : Int = 21

    val loop = new Breaks

    loop.breakable {
      while ( true ) {
        if ( isFactorableBy1To20(numToCheck) ) {
          loop.break
        }
        numToCheck += 1
      }
    }
    return numToCheck
  }


}
