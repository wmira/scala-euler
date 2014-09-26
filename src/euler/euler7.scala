package euler

/**
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

   What is the 10 001st prime number?
 * 
 */
object euler7 {
	
  def main(args : Array[String]) = {
    var primes = 0
    var tocheck = 1
    while ( primes < 10001 ) {
      if ( eulerutils.isPrime(tocheck) ) {
        primes += 1
        if ( primes == 10001 ) {
          println(tocheck)
        }
      }
      tocheck += 1
    }      
  }
  
  
  
}