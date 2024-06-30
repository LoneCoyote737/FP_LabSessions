// You are given two integers, num1 and num2.
// Write a function in Scala to determine the arithmetic mean (average) of the two numbers,
// rounded to two decimal places.
// Return the result as a floating-point number.

// import scala.math.BigDecimal.RoundingMode
object q3 {
    def arithmaticMean (num1: Int, num2: Int): Float = {
        // (math.floor((num1 + num2) / 2)).toFloat
        // BigDecimal((num1 + num2) / 2).setScale(2, RoundingMode.HALF_UP).toFloat
        // ("%.2f".format((num1 + num2) / 2)).toFloat
        ((num1 + num2) / 2.0).toFloat
    }

    import java.util.Scanner
    def main(args: Array[String]): Unit = {       
        val scanner = new Scanner(System.in)
        println("Enter number 1: ")
            val n1 = scanner.nextInt()
        println("Enter number 2: ")
            val n2 = scanner.nextInt()
        
        val mean: Float = arithmaticMean(n1,n2)
        println("Arithmatic mean: " + mean)
    }
}
