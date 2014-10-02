package euler

/**
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * 
 */
class Euler1 extends EulerSolver{


  override def solve(): Long = {

    val arr = 1 to 999 //1 to 999, inclusive
    return arr.filter( num => num % 3 == 0 || num % 5 == 0 ).sum //.foldLeft(0)( (total,num) => total + num )

  }


}

