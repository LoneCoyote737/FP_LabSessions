// Write a function in Scala that takes a string as input
// and returns the reverse of the string using a recursive approach.

import java.util.Scanner
object q1 { 
    def reverseString(str: String): String = {
        if (str.isEmpty) ""
        else reverseString(str.tail) + str.head
    }
    def main(args: Array[String]): Unit = {
        val scanner = new Scanner(System.in)

        println("Enter a string to reverse: ")
        val origStr: String = scanner.nextLine()

        val revStr: String = reverseString(origStr)
        println(revStr)
    }
}