package euler

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 */
object euler5 {

  def factoredBy20(input : Int) : Boolean = {
    for ( num <- 1 to 20 ) {
      if ( (input % num) != 0 ) {
        return false
      }
    }
    return true
  }

  def main(args: Array[String]) {

    var start : Int = 21

    while ( true ) {

      if ( factoredBy20( start ) ) {
        println(start);
        return
      }

     start += 1
    }

  }
}
