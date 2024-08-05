object Q1 extends App {
    def filterEvenNumbers (numList: List[Int]) = {
        numList.filter(num => num % 2 == 0)
    }

    val myNumbers: List[Int] = List(2,5,11,22,8,9,13,7,16)
    var filtered = filterEvenNumbers(myNumbers)
    
    println("Original list:\n" + myNumbers)
    println("Filtered list:\n" + filtered)
}
