package euler

import scala.collection.mutable.Map
import scala.collection.mutable.ArrayBuffer

/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

  If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 */
class Euler17 extends EulerSolver {

  val onesToWord = Map[Int,String](
    1 -> "one", 2 -> "two", 3 -> "three",
    4 -> "four", 5 -> "five", 6 -> "six",
    7 -> "seven", 8 -> "eight", 9 -> "nine", 10 -> "ten"
  )

  val teensToWord = Map[Int,String](
    11 -> "eleven", 12 -> "twelve", 13 -> "thirteen",
    14 -> "fourteen", 15 -> "fifteen", 16 -> "sixteen", 17 -> "seventeen",
    18 -> "eighteen", 19 -> "nineteen"
  )
  
  val tensToWord = Map[Int,String](
    1 -> "ten", 2 -> "twenty", 3 -> "thirty", 4 -> "forty",
    5 -> "fifty", 6 -> "sixty", 7 -> "seventy",
    8 -> "eighty", 9 -> "ninety"
  );

  val hundredsToWord = Map[Int,String](
    1 -> "one hundred", 2 -> "two hundred", 3 -> "three hundred", 4 -> "four hundred",
    5 -> "five hundred", 6 -> "six hundred", 7 -> "seven hundred",
    8 -> "eight hundred", 9 -> "nine hundred"
  );

  def toWordBelow100(count: Int) : String = {
    val arr = count.toString.toCharArray
    var result = ""
    result = tensToWord(arr(0).asDigit)
    if ( arr(1).asDigit > 0 ) {
      result = result + " " + onesToWord(arr(1).asDigit)
    }
    return result
  }

  def toWordBelow1000(count: Int) : String= {
    val arr = count.toString.toCharArray
    var result = ""
    if ( arr(1).asDigit == 0 && arr(2).asDigit == 0 ) {
      return hundredsToWord(arr(0).asDigit)
    } else {

      result = hundredsToWord(arr(0).asDigit)
      return result + " and " + toWord((arr(1).toString + "" + arr(2).toString).toInt)
    }
  }

  def toWord(count : Int) : String = {
    if ( count <= 10 ) {
      onesToWord(count)
    } else if ( count > 10 && count <= 19 ) {
      teensToWord(count)
    } else {
      if ( count < 100 ) {
        return toWordBelow100(count)
      } else {
        if ( count == 1000 ) {
          return "one thousand"
        } else {
          return toWordBelow1000(count)
        }
      }
    }
  }

  /**
   * Nasty code, there should be a better way
   *
   * @return
   */
  override def solve(): Long = {

    var words = new ArrayBuffer[String]
    var count = 0

    for ( count <- 1 to 1000 ) {
      words += toWord(count)
    }

    words.foreach( word => count += word.split(" ").mkString("").toCharArray.size )
    return count
  }
}

object Euler17 {

  def main(args : Array[String]): Unit = {
    val euler = new Euler17
    println(euler.solve)
  }

}


