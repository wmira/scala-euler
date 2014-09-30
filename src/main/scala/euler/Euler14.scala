package euler

import scala.collection.mutable.ArrayBuffer

/**
 * 
 * The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
 * 
 */
object euler14 {
	
  def collatz(num: Long) : Long = {
    
    var tmpCollatz : Long = num;    
    var counter = 0;
    while ( tmpCollatz > 1 ) {
	    if ( tmpCollatz % 2 == 0 ) {
	      
	      tmpCollatz = tmpCollatz / 2 	      
	    } else {
	      tmpCollatz = ( tmpCollatz * 3 ) + 1
	    }	    
	    counter += 1
    }	
    
    return counter
  }
  
  def main(args : Array[String]) = {
   
    var maxLength : Long =  0;
    val input = 1 to 1000000
    var maxTerm = 0;
    for ( i <- input ) {
      val collatzLength = collatz(i)
      if ( collatzLength > maxLength ) {       
        maxTerm = i
        maxLength = collatzLength
      }     
    }
    println (maxTerm)
  }
}
