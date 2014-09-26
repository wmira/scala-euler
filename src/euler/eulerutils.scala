package euler

object eulerutils {
  
	def isPrime(input: BigDecimal) : Boolean = {
    
    var primeCheck = 2
    
    //FIXME: is there a better way to do this shit?
    while ( true ) {    	
      if ( input % primeCheck == 0 ) {
        return false
      }
      if ( primeCheck * primeCheck > input ) {
        return true
      }
      primeCheck += 1
      
    }
    return false
    
  }
}