package euler



/**
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
 */
class Euler21 extends EulerSolver {

  def sumOfDivisors(num : Int ): Int = {
    EulerUtils.factors(num).sum.intValue
  }

  override def solve(): Long = {
    val amicableNumbers = scala.collection.mutable.SortedSet[Int]()

    for ( i <- 1 to 9999 ) {
      val sumDivisor = sumOfDivisors(i);
      if ( sumOfDivisors(sumDivisor) == i && ( i != sumDivisor)) {
        amicableNumbers += i
        amicableNumbers += sumDivisor
      }
    }
    amicableNumbers.sum
  }
}
