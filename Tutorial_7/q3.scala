object Q3 extends App {
    def filterPrime (numList: List[Int]) = {
        numList.filter(num => (num > 1) && (2 to Math.sqrt(num).toInt).forall(i => num % i != 0))
    }
    val myNumbers = List(1,2,3,4,5,6,7)
    val primesOnly = filterPrime(myNumbers)

    println("Original list:\n" + myNumbers)
    println("Primes filtered List:\n" + primesOnly)
}
