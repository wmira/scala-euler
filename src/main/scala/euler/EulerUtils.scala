package euler

import scala.collection.mutable.ArrayBuffer

object EulerUtils {

  /**
   * Check http://en.wikipedia.org/wiki/Primality_test
   *
   * @param input
   * @return
   */
	def isPrime(input: Long) : Boolean = {
    
    if ( input <= 3 ) {
      return input > 1 //1 is not a prime.
    }

    if ( input % 2 == 0 || input % 3 == 0 ) {
      return false //divisible by 2 or 3
    }

    //start with 5 to check for divisibility
    var divisor : Long = 5

    while (  divisor < ( math.sqrt(input) + 1 )   ) {
      if ( input % divisor == 0 || input % (divisor + 2) == 0 ) {
        return false
      }
      divisor += 6
    }
    return true
  }

  def main(args : Array[String] ): Unit = {
    println(isPrime(29995))

  }

  def factors(input: Long) : ArrayBuffer[Long] = {

    var result = ArrayBuffer[Long]()
    val limit : Long = input/2 + 1
    var counter = 1
    val increment = if ( input % 2 == 0 ) 1 else 2  //counter + 1 or 2, if even, we only test for even count

    while ( counter <= limit ) {
      if ( input % counter == 0 ) {
        result += counter
      }
      counter += increment
    }

    return result
  }

  def sqrt(number : Long) : Double = {

    def next(n : BigInt, i : BigInt) : BigInt = (n + i/n) >> 1

    val one = BigInt(1)

    var n = one
    var n1 = next(n, number)

    while ((n1 - n).abs > one) {
      n = n1
      n1 = next(n, number)
    }

    while (n1 * n1 > number) {
      n1 -= one
    }

    n1.doubleValue
  }
}
