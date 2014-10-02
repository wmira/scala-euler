package euler



/**
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
   What is the sum of the digits of the number 2^^1000?
 */
class Euler16 extends EulerSolver {

  override def solve(): Long = {


    val to1000 : BigInt = BigInt(2).pow(1000)
    val to1000Str = to1000.toString
    val digitsCharArr = to1000Str.toCharArray
    digitsCharArr.map( char => char.asDigit ).sum
  }
}
