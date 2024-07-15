// PatternMatching to check the state of an Int:

import scala.io.StdIn.readInt
object Q2 extends App {
    val isOdd = (num: Int) => num%2 != 0
    val isEven = (num: Int) => !(isOdd(num))

    val PatternMatching = (num: Int) => num match {
        case x if x <= 0 => println("Negative/Zero")
        case x if isOdd(x) => println("Odd number")
        case x if isEven(x) => println("Even number")
    }

    // driver code:
    println("Enter an integer: ");
    val num = readInt()
    PatternMatching(num)
}