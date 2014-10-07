package euler
import scala.io.Source
/**
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 */
class Euler13 extends  EulerSolver {

  override def solve(): Long = {
    var total : BigInt = 0
    for(line <- Source.fromFile("./src/main/scala/euler/Euler13Input.txt").getLines()) {
      if ( line != null  && !"".equals(line) ) {
        total += BigInt(line)
      }
    }
    total.toString.substring(0,10).toLong
  }
}
