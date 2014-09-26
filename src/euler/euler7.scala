package euler

object euler7 {
	
  def main(args : Array[String]) = {
    var primes = 0
    var tocheck = 1
    while ( true ) {
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