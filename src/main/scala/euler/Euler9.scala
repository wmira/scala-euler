package euler
import scala.util.control._

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

  a^2 + b^2 = c^2
  For example, 32 + 42 = 9 + 16 = 25 = 52.

  There exists exactly one Pythagorean triplet for which a + b + c = 1000.
  Find the product abc.
 */
class Euler9 extends EulerSolver {


  def generateC(a : Int, b: Int): Int = {
    1000 - a - b
  }
  override def solve(): Long = {

    var a = 1
    var b = a + 1
    var c = 1000 - ( b + a )


    while ( ( a  + b ) < c   ) {
      while ( b < c ) {
        if (((a * a) + (b * b)) == (c * c)) {
          return a * b * c
        }
        b += 1
        c = generateC(a,b)
      }

      a +=1
      b = a + 1
      c = 1000 - (b + a )



    }
    return -1
  }
}
