package euler

import scala.util.control._

/**
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

   What is the 10 001st prime number?
 * 
 */
object euler7 {

  
  def main(args : Array[String]) = {

    var primeCount = 0
    var tocheck = 1

    val loop = new Breaks

    loop.breakable {
      while (primeCount <= 10000) {
        if (eulerutils.isPrime(tocheck)) {
          primeCount += 1
          if ( primeCount == 10001 ) {
            loop.break
          }

        }
        tocheck += 1
      }
    }
    println(tocheck)
  }
  
  
  
}