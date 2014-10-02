package euler

import scala.collection.mutable.ArrayBuffer
/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

    Find the sum of all the primes below two million.
 */
class Euler10 extends EulerSolver {


  override def solve(): Long = {
    var i = 0
    var primesBelow2M =  new ArrayBuffer[Long]

    for ( i <- 1 to 1999999 ) {
      if ( EulerUtils.isPrime(i) ) {
        primesBelow2M += i
      }
    }


    primesBelow2M.sum

  }
}
