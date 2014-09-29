package euler

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
}
