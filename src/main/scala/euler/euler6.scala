package euler

/**
 *
 * The sum of the squares of the first ten natural numbers is,
 *
 *  1^2 + 2^2 + ... + 10^2 = 385
 *   The square of the sum of the first ten natural numbers is,

 *   (1 + 2 + ... + 10)2 = 552 = 3025
 *   Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 *   Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
object euler6 {

  def main(args : Array[String]) = {

    val range = 1 to 100

    val totalPow = range.map( num => BigInt(num).pow(2) ).foldLeft(0)( (total,num) => ( total + num ).intValue  )
    val totalSquareSum = BigInt(range.foldLeft(0)( (total,num) => total + num )).pow(2)
    
    println(totalSquareSum - totalPow)


  }
}
