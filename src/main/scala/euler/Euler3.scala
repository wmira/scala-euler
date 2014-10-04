package euler

import scala.collection.mutable.ArrayBuffer

/**
 *  The prime factors of 13195 are 5, 7, 13 and 29.
 *
 *   What is the largest prime factor of the number 600851475143 ?
 */
class Euler3 extends EulerSolver {


  override def solve(): Long = {
    val input = BigInt("600851475143")
    var factors = ArrayBuffer[BigInt]()
    val limit : BigInt = EulerUtils.sqrt(input) + 1
    var counter = 1
    val increment = if ( input % 2 == 0 ) 1 else 2  //counter + 1 or 2, if even, we only test for even count

    while ( counter <= limit ) {
      if ( input % counter == 0  && EulerUtils.isPrime(counter)) {
        factors += counter
      }
      counter += increment
    }

    return factors.max.longValue
  }
}
