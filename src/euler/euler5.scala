package euler

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
