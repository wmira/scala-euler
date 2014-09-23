package euler

/**
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * 
 */
object euler1 {
	
  def main(arr : Array[String]) = {
    
    val arr = 1 to 1001 //this is exclusive so 1 to 1001
    
    val result = arr.filter( num => num % 3 == 0 || num % 5 == 0 ).foldLeft(0)( (total,num) => total + num )
    println(result)
  }
}