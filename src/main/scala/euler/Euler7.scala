package euler

import scala.util.control._

/**
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

   What is the 10 001st prime number?
 * 
 */
class Euler7 extends EulerSolver {


  override def solve(): Long = {


    var primeCount = 0
    var tocheck = 1

    val loop = new Breaks

    loop.breakable {
      //FIXME, make this a for loop
      while (primeCount <= 10000) {
        if (EulerUtils.isPrime(tocheck)) {
          primeCount += 1
          if ( primeCount == 10001 ) {
            loop.break
          }

        }
        tocheck += 1
      }
    }
    tocheck
  }
  
  
  
}
