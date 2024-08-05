object Q2 extends App {
    def calculateSquare (numList: List[Int]) = {
        numList.map(num => num*num)
    }
    val myNumbers = List(1,2,3,4,5)
    val squaredList = calculateSquare(myNumbers)

    println("Original list:\n" + myNumbers)
    println("Squared List:\n" + squaredList)
}
