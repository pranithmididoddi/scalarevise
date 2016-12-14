/**
  * Created by Pranith on 12/13/16.
  */
object scalatesting {

  def main(args: Array[String]) : Unit={

    printf("Enter the number: ")
    var number=scala.io.StdIn.readInt()
    println(fizzbuzz(number))

  }

  def fizzbuzz(number: Int) {
    if(number%15==0) println("FizzBuzz")
    else if (number%3==0) println("Fizz")
    else if(number%5==0) println("Buzz")
    else println(number+" is not valid for the given conditions")
  }

}
