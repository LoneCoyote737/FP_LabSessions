// Integer pattern  matching

object Q2 extends App {
    println("Enter an integer:")
    var myNum = scala.io.StdIn.readInt()

    val multipleOf = (num: Int, div: Int) => num % div == 0

    println(myNum match {
        case x if multipleOf(x, 3) && multipleOf(x, 5) => "Multiple of Both Three and Five"
        case x if multipleOf(x, 3) => "Multiple of Three"
        case x if multipleOf(x, 5) => "Multiple of Five"
        case x => "Not a Multiple of Three or Five"
    })
}
