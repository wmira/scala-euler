package euler

/**
n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
 */
class Euler20 extends EulerSolver {

  def factorial(num : BigInt) : BigInt = {
    if ( num - 1 == 0 ) {
      num * 1
    } else {
      num * factorial(num - 1)
    }
  }
  def solve(input : BigInt ) : Long = {
    val result = factorial(input)
    return result.toString.toCharArray.map( ch => ch.asDigit ).sum
  }

  override def solve(): Long = {
    solve(100)
  }
}
