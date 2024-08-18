// interest calculating function

object Q1 extends App {

    val calcInterest = (deposit: Double, rate: Double) => deposit * rate / 100  
    val findInterest = (deposit: Double) => deposit match {
        case x if x <= 20000 => calcInterest(x, 2)
        case x if x <= 200000 => calcInterest(x, 4)
        case x if x <= 2000000 => calcInterest(x, 3.5)
        case x => calcInterest(x, 6.5)
    }

    print("Deposit amount: ")
    var depositInput = scala.io.StdIn.readDouble()

    println("Yearly interest amounts to: " + findInterest(depositInput))
}
